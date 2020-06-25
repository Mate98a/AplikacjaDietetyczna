package pl.wsiz.aplikacjadietetyczna;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class por extends AppCompatActivity {

    ListView listView;
    List list=new ArrayList();
    ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_por);

        listView=(ListView)findViewById(R.id.list_view);
        list.add("1. Rozpocznij dzień od sycącego śniadania\n" +
                "Na śniadanie najlepsze są produkty pełnoziarniste, które powoli będą dostarczać ci energii przez cały poranek. Wybieraj kanapki z pełnoziarnistego pieczywa, płatki owsiane z orzechami lub pastę z ciecierzycy.");
        list.add("2. Jedz regularnie\n" +
                "Na okrągło słyszymy o pięciu posiłkach dziennie co 3 godziny. Ale to naprawdę niezwykle istotne. Jedzenie o stałych porach pozwala regulować pracę organizmu, nadaje tempo metabolizmowi i ogranicza napady głodu, podczas których jesteśmy w stanie pochłonąć wszystko, co mamy pod ręką.");
        list.add("3. Urozmaicaj!\n" +
                "Zadbaj, aby każdy Twój posiłek zawierał różnorodne produkty. Staraj się nie jeść chleba z szynką na śniadanie, drugie śniadanie i kolację. Przygotowuj różnego rodzaju pasty, twarożki i sałatki. Jedz surowe warzywa jak najczęściej, najlepiej 5 razy dziennie i pamiętaj, aby Twój talerz był zawsze kolorowy. Jedzenie różnokolorowych produktów zapewnia dostarczenie składników odżywczych i witamin z różnych grup.");
        list.add("4. Unikaj produktów wysoko przetworzonych i sklepowych słodyczy\n" +
                "Im bardziej przetworzony produkt, tym mniej wartości odżywczych. Słodycze sklepowe to źródło pustych kalorii, łatwo przyswajalnego cukru i tłuszczów trans powodujących miażdżycę. Z kolei słone przekąski, zupki chińskie i dania gotowe zasypują nas solą, glutaminianem sodu, a często też rakotwórczym akrylamidem.");
        list.add("5. Pij odpowiednią ilość wody\n" +
                "Aby zrekompensować codzienne straty wody z organizmu, powinniśmy wypijać jej co najmniej 1,5 – 2 litry dziennie. Odpowiednie nawodnienie komórek umożliwia prawidłowe funkcjonowanie organizmu, gdyż wszystkie procesy w nim zachodzą w środowisku wodnym. Odpowiednie nawodnienie zapobiega też powstawaniu obrzęków. Składamy się w 70% z wody! Nie zapominajmy o tym.");
        list.add("6. Wprowadź aktywność fizyczną\n" +
                "Regularne umiarkowane ćwiczenia fizyczne poprawiają wydolność organizmu, dotleniają mózg i komórki ciała i przyczyniają się do polepszenia stanu psychicznego. W końcu wysiłek to relaks dla umysłu. Jeśli nie masz czasu na aerobic, wyjdź na spacer, pojedź do pracy na rowerze, a w weekend wybierz się na basen, zamiast siedzieć na kanapie. Ćwiczenia fizyczne nie muszą być katorżniczą pracą.");
        list.add("7. Zadbaj o relaks\n" +
                "Znajdź czas tylko dla siebie. Poczytaj książkę, posłuchaj ulubionej muzyki, umów się z przyjaciółką. Tylko nie rozmawiajcie ciągle o problemach! Takie proste rzeczy naprawdę pomagają utrzymać równowagę psychiczną.");
        list.add("8. Pracuj nad poczuciem własnej wartości\n" +
                "Zastanów się, ile razy krytykowałaś siebie, obwiniałaś się o rzeczy, na które nie masz wpływu, a na komplementy reagowałaś alergicznie. Pomyśl, czy zwracałabyś się tak do dziecka? Znajdź swoje wewnętrzne dziecko i przynajmniej raz dziennie pochwal się za to, co udało ci się dzisiaj zrobić.");
        list.add("9. Wysypiaj się\n" +
                "Nie pozwól, aby życie w biegu tobą zawładnęło i wygospodaruj odpowiednią ilość godzin na sen. Nie tylko będziesz fizycznie zdrowsza, ale również radośniejsza, bardziej skoncentrowana i efektywna w pracy.");
        list.add("10. Wprowadzaj zmiany małymi krokami\n" +
                "Nie od razu Rzym zbudowano. I nie od razu uda ci się zmienić swój styl życia na zdrowy. Stawiaj sobie wyzwania, które pozwolą ci stopniowo eliminować zachowania, które ci nie służą. Od czego zacząć? Np. nie sól pomidora na kanapce, przygotuj zdrową sałatkę na kolację, 2 razy w tygodniu poświęć godzinę na swój odpoczynek po pracy. Z czasem zaniechanie kolejnych dotychczasowych nawyków będzie stanowiło coraz mniejszy problem.");


        adapter=new ArrayAdapter(por.this,android.R.layout.simple_list_item_1,list);
        listView.setAdapter(adapter);
    }
}
