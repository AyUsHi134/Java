//WAP to update the existing text into uppercase in a textfile

public class UpperCaseFileUpdater {
    public static void main(String[] args) {
            File file=new File("xyz.txt");
            File file1=new File("merge.txt");

            try(BufferedReader reader=new BufferedReader(new FileReader(file));
            BufferedWriter writer=new BufferedWriter(new FileWriter(file1))){
                String line;
                while((line=reader.readLine())!=null){
                    writer.write(line.toUpperCase());
                    writer.newLine();
                }
            }catch(IO Exception e){
                System.out.println(e.getMessage());
                return;
            }
            System.out.println("File successfully convert to uppercase");
    }
}
