package FindDublicatesHomeWork;

import java.util.*;

class FindDublicatesBySorting {
    static char[] NUCLEOTIDES = {'A', 'C', 'G', 'T'};

    static char[] generate(int N) {
        Random r = new Random();
        char[] data = new char[N];
        for (int i = 0; i < data.length; i++) {
            data[i] = NUCLEOTIDES[r.nextInt(NUCLEOTIDES.length)];
        }
        return data;
    }

    public static void main(String[] args) {
        char[] dna = generate(1_000_000);
        Map<String, List<Integer>> dups = findDuplicates(dna, 40);
        System.out.println(dups);
    }


    public static Map<String, List<Integer>> findDuplicates(char[] dna, int M) {
        Map<String, List<Integer>> result;
        ArrayList<keyValue> data = new ArrayList<keyValue>();
        for (int i = 0; i < dna.length - M; i++) {
            String substring = new String(Arrays.copyOfRange(dna, i, i + M));
            data.add(new keyValue(substring,i));
        }
        Collections.sort(data, new Comparator<keyValue>() {
            @Override
            public int compare(keyValue o1, keyValue o2) {
                return o1.getSub().compareTo(o2.getSub());
            }
        });
        result =saveDataInMap(data);
        return result;
    }

    private static Map<String,List<Integer>>saveDataInMap(ArrayList<keyValue> data) {
        Map<String,List<Integer>> result = new HashMap<String,List<Integer>>();
        List<Integer> tempList = new ArrayList<Integer>();
        String checker = data.get(0).getSub();

        for (int i=0; i <data.size();i++){
            if(checker.equals(data.get(i).getSub())){
                tempList.add(data.get(i).getIndex());
            }else{
                result.put(checker,tempList);
                checker = data.get(i).getSub();
                tempList= new ArrayList<Integer>();
                tempList.add(data.get(i).getIndex());
            }
        }
        result.put(checker,tempList);
        return result;
    }

    public static class keyValue{
        private String sub;
        private int index;

        public keyValue(String sub, int index){
            this.sub=sub;
            this.index = index;
        }
        public int getIndex(){
            return index;
        }

        public String getSub() {
            return sub;
        }

    }

}

