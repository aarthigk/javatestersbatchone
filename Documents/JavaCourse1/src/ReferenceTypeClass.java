public class ReferenceTypeClass {
    public static void main(String[] args) {

        int idno=1001;
        System.out.println(idno);

        Television tele = new Television("Sony ",2024);
        Television led = new Television("SAMSUNG ",112233);

        System.out.println(tele);

        tele.displayInfo();
        led.displayInfo();

    }
}

class Television {
    int modelNo;
    String modelName;


    Television(String modelName,int modelNo){
        this.modelName=modelName;
        this.modelNo=modelNo;
    }

    void displayInfo()
    {
        System.out.println("ModelName "+modelName + " Model No" +modelNo );
    }


}