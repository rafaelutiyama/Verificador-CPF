public class main {

    public static int verificador1(int cpf[]){

        int ver1[] = {10, 9, 8 ,7 ,6 ,5, 4, 3, 2};
        int soma = 0;

        for(int i = 0; i < ver1.length; i++){
            soma = soma + (cpf[i] * ver1[i]);
        }
        soma = soma % 11;
        if(soma < 2){
            return 0;
        }else return 11 - soma;

    }

    public static int verificador2(int cpf[]){

        int ver2[] = {11, 10, 9, 8 ,7 ,6 ,5, 4, 3, 2};
        int soma = 0;

        for(int i = 0; i < ver2.length; i++){
            soma = soma + (cpf[i] * ver2[i]);
        }


        soma = soma % 11;
        if(soma < 2){
            return 0;
        }else return 11 - soma;

    }

    public static void validação(int n1, int n2, int cpf[]){

        if(n1 == cpf[9] && n2 == cpf[10]) {
            System.out.println("CPF valido");
        }else
            System.out.println("CPF invalido");

    }

    public static void estado(int estado){

        switch (estado){
            case 0:
                System.out.println("RS");
                break;
            case 1:
                System.out.println("DF, GO, MT, MS ou TO");
                break;
            case 2:
                System.out.println("AC, AM, AP, PA, RO ou RR");
                break;
            case 3:
                System.out.println("CE, MA ou PI");
                break;
            case 4:
                System.out.println("AL, PB, PE ou RN");
                break;
            case 5:
                System.out.println("BA OU SE");
                break;
            case 6:
                System.out.println("MG");
                break;
            case 7:
                System.out.println("ES ou RJ");
                break;
            case 8:
                System.out.println("SP");
                break;
            case 9:
                System.out.println("PR ou SC");
                break;

        }
    }


    public static void main(String[] args) {


        String CPFstring = "09011907990";
        int cpf[] = new int[CPFstring.length()];


        for (int i = 0; i < CPFstring.length(); i++) {
            cpf[i] = Character.getNumericValue(CPFstring.charAt(i));
        }


        validação(verificador1(cpf),verificador2(cpf), cpf);
        estado(verificador1(cpf));


    }
}
