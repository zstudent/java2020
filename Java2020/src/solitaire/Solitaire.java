package solitaire;

import java.applet.Applet;

/*
 Simple Solitaire Card Game in Java
 Written by Tim Budd, Oregon State University, 1996
 */
import java.awt.Event;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Solitaire extends Applet {
	static CardPile allPiles[];
	static DeckPile deckPile;
	static DiscardPile discardPile;
	static SuitPile suitPile[];
	static TablePile tableau[];

	@Override
	public void init() {
		// first allocate the arrays
		allPiles = new CardPile[13];
		suitPile = new SuitPile[4];
		tableau = new TablePile[7];
		// then fill them in
		allPiles[0] = deckPile = new DeckPile(335, 5);
		allPiles[1] = discardPile = new DiscardPile(268, 5);
		for (int i = 0; i < 4; i++) {
			allPiles[2 + i] = suitPile[i] = new SuitPile(15 + 60 * i, 5);
		}
		for (int i = 0; i < 7; i++) {
			allPiles[6 + i] = tableau[i] = new TablePile(5 + 55 * i, 80, i + 1);
		}
		
		addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Solitaire.this.mouseClicked(e.getX(), e.getY());
			}
		});
	}

	@Override
	public boolean mouseDown(final Event evt, final int x, final int y) {
		return mouseClicked(x, y);
	}

	private boolean mouseClicked(final int x, final int y) {
		System.out.println(x + ":" + y);
		for (int i = 0; i < 13; i++) {
			if (allPiles[i].includes(x, y)) {
				allPiles[i].select(x, y);
				repaint();
				return true;
			}
		}
		return true;
	}

	@Override
	public void paint(final Graphics g) {
		for (int i = 0; i < 13; i++) {
			allPiles[i].display(g);
		}
	}
}