import java.util.ArrayList;
import java.util.Random;

public class EnocaAlgorithma {

            public static void main(String[] args) {

                //Burada listeyi oluşturuyorum,Random kütüphanesini kullanmak için çagırıyorum
                ArrayList<Integer> list = new ArrayList<>();
                Random random = new Random();

                //Burada 100 adet random sayı ürettiriyorum ve listeye ekliyorum
                for (int i = 0; i < 100; i++) {
                    list.add(random.nextInt());
                }

                //Listenin kopyasını oluşturuyorum
                ArrayList<Integer> copy = new ArrayList<Integer>(list);

                //0-100 arasında bir adet random sayı üretiyorum
                int randomNumber = random.nextInt(100);
                //kopya listeden ürettiğim sayıya eşit olan elemanı siliyorum
                copy.remove(randomNumber);

                //Burada oluşturdugum methodu int değere atıyorum
                int missingElement = elementControl(list, copy);

                //listelerin eleman sayısını int değere atadım
                int listSize=list.size();
                int copySize=copy.size();


                System.out.println("Random 100 adet Sayı " + list);
                System.out.println("Listenin Kopyası " + copy);
                System.out.println("0-100 arasında random ürettiğim sayı " + randomNumber);
                System.out.println("Eksik olan eleman " + missingElement);
                System.out.println("Orjinal listenin eleman sayısı  " + listSize);
                System.out.println("Kopya listenin eleman sayısı  " + copySize);
            }

            //forEach ile listeyi geziyorum ve olmayan elemanı buluyorum eğer tüm elemanlar eşitse 0 döndürüyorum
            public static int elementControl(ArrayList<Integer> list, ArrayList<Integer> copyList) {
                for (int num : list) {
                    if (!copyList.contains(num)) {
                        return num;
                    }
                }
                return 0;
            }



        }

