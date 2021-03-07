package Second_week.listy;

public class listy {
    System.out.println("Zadanie 3 - Listy");
    ArrayList<String> lista_Napojow = new ArrayList<>();
            lista_Napojow.add("Coca-Cola");
            lista_Napojow.add("Czarna Porzeczka");
            lista_Napojow.add("Fanta");
            lista_Napojow.add("Sprite");
        System.out.println(lista_Napojow);

    //Dodawanie
            lista_Napojow.add("Woda");
            lista_Napojow.add(1,"Oranżada");
        System.out.println("\n" + lista_Napojow);

    //Odejmowanie
            lista_Napojow.remove("Sprite");
            lista_Napojow.remove(0);
        System.out.println("\n" + lista_Napojow);

    //Nadpisywanie
            lista_Napojow.set(3,"Tonic");
        System.out.println("\n" + lista_Napojow);

    //Sortowanie
        Collections.sort(lista_Napojow);
        System.out.println("\n" + lista_Napojow);

    //Czyszczenie
        lista_Napojow.clear();
        System.out.println("\n" + lista_Napojow);
}
