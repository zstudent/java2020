package lesson210511.dispatch_with_reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.Arrays;

public class RealProcessor {

	public void accept(Command cmd) {
		Class<? extends Command> cmdClass = cmd.getClass();

		Method[] methods = this.getClass().getMethods();
		Arrays.stream(methods).filter(m -> {
			Parameter[] parameterTypes = m.getParameters();
			for (Parameter p : parameterTypes) {
				if (p.getType().getCanonicalName().equals(cmdClass.getCanonicalName()))
					return true;
			}
			return false;
		}).forEach(m -> {
			try {
				m.invoke(this, cmd);
			} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
				e.printStackTrace();
			}
		});

	}

	public void process(Command.Load cmd) {
		System.out.println(cmd);
	}

	public void process(Command.Save cmd) {
		System.out.println(cmd);
	}

	public void process(Command.Search cmd) {
		System.out.println(cmd);
	}

}
