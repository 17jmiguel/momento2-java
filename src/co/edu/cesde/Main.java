package co.edu.cesde;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Scanner inputdata = new Scanner(System.in);
        //declaracion arrays
        List<Watchman> Seguridad = new ArrayList<>();
        List<CleaningStaff> Limpieza = new ArrayList<>();
        List<Accountand> Contador = new ArrayList<>();
        List<Admin> Administrador = new ArrayList<>();

        boolean flagStop = false;
        while (!flagStop) {
            System.out.println("Que tipo de empleado quiere ingresar?: 1 (Seguridad) o 2 (Servicios varios) o 3(Contador) o 4(Admin) o 5(exit)");
            int option = Integer.parseInt(inputdata.nextLine());
            switch (option) {
                case 1:
                    int respu = 1;
                    while (respu != 0) {
                        // Inicia---------------------------------------------------------------------------------------------
                        Watchman sela = new Watchman();

                        System.out.println("Ingrese el nombre: ");
                        sela.setName(inputdata.nextLine());

                        System.out.println("Ingrese numero de documento: ");
                        sela.setIdentification(inputdata.nextLine());

                        System.out.println("Ingrese la edad: ");
                        sela.setAge(Integer.parseInt(inputdata.nextLine()));

                        System.out.println("ingrese el arma que utiliza: ");
                        sela.setWeapon(inputdata.nextLine());

                        System.out.println("Ingrese el dia de trabajo: ");
                        sela.setWorkday(inputdata.nextLine());

                        System.out.println("quiere ingresar mas datos en este perfil de usuario? (1: si or 0: no) ");
                        respu = Integer.parseInt(inputdata.nextLine());
                        Seguridad.add(sela);

                        // Termina---------------------------------------------------------------------------------------------

                    }
                    break;
                case 2:
                    respu = 1;
                    while (respu != 0) {
                        //Inicia----------------------------------------------------------------------------------------

                        CleaningStaff limp = new CleaningStaff();
                        System.out.println("Ingrese nombre: ");
                        limp.setName(inputdata.nextLine());

                        System.out.println("Ingrese numero de identificacion: ");
                        limp.setIdentification(inputdata.nextLine());

                        System.out.println("Ingrese la edad: ");
                        limp.setAge(Integer.parseInt(inputdata.nextLine()));

                        System.out.println("Ingrese el dia de receso: ");
                        limp.setDayOff(inputdata.nextLine());

                        System.out.println("quiere ingresar mas datos en este perfil de usuario? (1: si or 0: no) ");
                        respu = Integer.parseInt(inputdata.nextLine());
                        Limpieza.add(limp);

                        //Termina---------------------------------------------------------------------------------------
                    }
                    break;
                case 3:
                    respu = 1;
                    while (respu != 0) {
                        //inicio----------------------------------------------------------------------------------------
                        Accountand cont = new Accountand();
                        System.out.println("Ingrese nombre: ");
                        cont.setName(inputdata.nextLine());

                        System.out.println("Ingrese numero de identificacion: ");
                        cont.setIdentification(inputdata.nextLine());

                        System.out.println("Ingrese la edad: ");
                        cont.setAge(Integer.parseInt(inputdata.nextLine()));

                        System.out.println("Ingrese nombre del lider: ");
                        cont.setLeader(inputdata.nextLine());

                        System.out.println("Ingrese lugar de parqueadero: ");
                        cont.setParking(inputdata.nextLine());

                        System.out.println("quiere ingresar mas datos en este perfil de usuario? (1: si or 0: no) ");
                        respu = Integer.parseInt(inputdata.nextLine());
                        Contador.add(cont);

                        //fin-------------------------------------------------------------------------------------------

                    }
                    break;
                case 4:
                    respu = 1;
                    while (respu != 0) {
                        //inicio----------------------------------------------------------------------------------------
                        Admin adm = new Admin();

                        System.out.println("Ingrese nombre: ");
                        adm.setName(inputdata.nextLine());

                        System.out.println("Ingrese numero de identificacion: ");
                        adm.setIdentification(inputdata.nextLine());

                        System.out.println("Ingrese la edad: ");
                        adm.setAge(Integer.parseInt(inputdata.nextLine()));

                        System.out.println("Ingrese nombre del lider: ");
                        adm.setLeader(inputdata.nextLine());

                        System.out.println("Ingrese lugar de parqueadero: ");
                        adm.setParking(inputdata.nextLine());

                        System.out.println("quiere ingresar mas datos en este perfil de usuario? (1: si or 0: no) ");
                        respu = Integer.parseInt(inputdata.nextLine());
                        Administrador.add(adm);

                        //fin-------------------------------------------------------------------------------------------

                    }
                case 5:
                    flagStop = true;
                    break;
            }
            System.out.println("Quiere ingresar otro empleado? (1: si o 0: no)");
            int resp = Integer.parseInt(inputdata.nextLine());
            if (resp == 0) {
                flagStop = true;
            }
        }
        flagStop = false;
        while (!flagStop) {
            System.out.println("Que informacion desea imprimir 1-(Selador) o 2-(Servicios varios ) o 3(Contador) o 4-(Admin) o 5(Salir) ");
            int option = Integer.parseInt(inputdata.nextLine());
            switch (option) {
                case 1:
                    for (int i = 0; i < Seguridad.size(); i++) {
                        System.out.println("Nombre: "+ Seguridad.get(i).getName());
                        System.out.println("Numero de identificacion: "+ Seguridad.get(i).getIdentification());
                        System.out.println("Edad: "+Seguridad.get(i).getAge());
                        System.out.println("Arma: "+Seguridad.get(i).getWeapon());
                        System.out.println("Dia de trabajo: "+Seguridad.get(i).getWorkday());
                    }
                    break;
                case 2:
                    for (int i = 0; i < Limpieza.size(); i++) {
                        System.out.println("Nombre: "+Limpieza.get(i).getName());
                        System.out.println("Numero de identificacion: "+ Limpieza.get(i).getIdentification());
                        System.out.println("Edad: "+ Limpieza.get(i).getAge());
                        System.out.println("Dia de descanso: "+Limpieza.get(i).getDayOff());

                    }
                    break;
                case 3:
                    for (int i = 0; i < Contador.size(); i++) {
                        System.out.println("Nombre: "+Contador.get(i).getName());
                        System.out.println("Numero de identificacion: "+Contador.get(i).getIdentification());
                        System.out.println("Edad: "+Contador.get(i).getAge());
                        System.out.println("Nombre del lider: "+Contador.get(i).getLeader());
                        System.out.println("Nombre del parqueadero: "+Contador.get(i).getParking());
                    }
                    break;
                case 4:
                    for (int i = 0; i < Administrador.size(); i++) {
                        System.out.println("Nombre: "+ Administrador.get(i).getName());
                        System.out.println("Numero de identificacion: "+Administrador.get(i).getIdentification());
                        System.out.println("Edad: "+Administrador.get(i).getAge());
                        System.out.println("Nombre del lider: "+ Administrador.get(i).getLeader());
                        System.out.println("Nombre del parqueadero: "+Administrador.get(i).getParking());
                    }
                    break;
                case 5:
                    flagStop = true;
                    break;
            }
        System.out.println("Quiere ver la info de otro empleado? (1: si o 0: no)");
            int resp = Integer.parseInt(inputdata.nextLine());
            if (resp == 0) {
                flagStop = true;
            }
        }
        flagStop = false;
    }

}
