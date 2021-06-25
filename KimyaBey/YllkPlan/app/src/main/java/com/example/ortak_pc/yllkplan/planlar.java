package com.example.ortak_pc.yllkplan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class planlar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_planlar);

        String donem = "";
        int ayno = 0;
        int sinifno =0;
        int haftano = 0;

        /*Intent id = new Intent(planlar.this, Duzen.class);
        String test = id.getStringExtra("icerik1");
        TextView tes = (TextView) findViewById(R.id.textView7);*/

        Intent i10 = getIntent();

        donem = i10.getStringExtra("donem1");
        ayno = i10.getIntExtra("ayno",0);
        sinifno = i10.getIntExtra("sinif1",0);
        haftano = i10.getIntExtra("hafta",0);
        String baslik = "";
        String baslik1 = "";
        String icerik1 = "";
        String baslik2 = "";
        String icerik2 = "";

        if (donem.equals("I"))
        {
            if (ayno == 1)
            {
                if (haftano == 1)
                {
                    baslik = (donem + ". Dönem " + sinifno + ". Sınıf Eylül Ayı " + haftano + ". Hafta").toString();
                    if (sinifno == 9)
                    {
                        baslik1 = "";
                        icerik1 = "";
                        baslik2 = "";
                        icerik2 = "";
                    }
                    if (sinifno == 10)
                    {
                        baslik1 = "";
                        icerik1 = "";
                        baslik2 = "";
                        icerik2 = "";
                    }
                    if (sinifno == 11)
                    {
                        baslik1 = "";
                        icerik1 = "";
                        baslik2 = "";
                        icerik2 = "";
                    }
                    if (sinifno == 12)
                    {
                        baslik1 = "";
                        icerik1 = "";
                        baslik2 = "";
                        icerik2 = "";
                    }
                }
                if (haftano == 2)
                {
                    baslik = (donem + ". Dönem " + sinifno + ". Sınıf Eylül Ayı " + haftano + ". Hafta").toString();
                    if (sinifno == 9)
                    {
                        baslik1 = "";
                        icerik1 = "";
                        baslik2 = "";
                        icerik2 = "";
                    }
                    if (sinifno == 10)
                    {
                        baslik1 = "";
                        icerik1 = "";
                        baslik2 = "";
                        icerik2 = "";
                    }
                    if (sinifno == 11)
                    {
                        baslik1 = "";
                        icerik1 = "";
                        baslik2 = "";
                        icerik2 = "";
                    }
                    if (sinifno == 12)
                    {
                        baslik1 = "";
                        icerik1 = "";
                        baslik2 = "";
                        icerik2 = "";
                    }
                }
                if (haftano == 3)
                {
                    baslik = (donem + ". Dönem " + sinifno + ". Sınıf Eylül Ayı " + haftano + ". Hafta").toString();
                    if (sinifno == 9)
                    {
                        baslik1 = "9.1. KİMYA BİLİMİ 9.1.1. Simyadan Kimyaya 9.1.2. Kimyanın Disiplinleri ve Kimyacıların Çalışma  Alanları";
                        icerik1 = "1. Kimyanın bilim olma sürecini açıklar.\n"+
                                "a. Simya ile kimya bilimi arasındaki fark vurgulanır. \n" +
                                "b. Kimya biliminin gelişim süreci ele alınırken Mezopotamya, Çin, Hint, Mısır, Yunan, Orta Asya ve İslâm uygarlıklarının kimya bilimine yaptığı katkılara ilişkin okuma parçası verilir.\n" +
                                "c. Simyadan kimyaya geçiş sürecine katkı sağlayan bilim insanlarından bazılarının (Empedokles, Democritus, Aristo, Câbir bin Hayyan, Ebubekir er-Razi, Robert Boyle, Antoine Lavoisier) kimya bilimine ilişkin çalışmaları kısaca tanıtılır. \n" +
                                "ç. Atatürk’ün bilime verdiği önemle ilgili okuma parçası verilir.\n";
                        baslik2 = "2. Kimyanın ve kimyacıların başlıca uğraş alanlarını açıklar.";
                        icerik2 = "a. Biyokimya, analitik kimya, organik kimya, anorganik kimya, fizikokimya, polimer kimyası ve endüstriyel kimya disiplinleri kısaca tanıtılır.\n" +
                                "b. İlaç, gübre, petrokimya, arıtım, boya-tekstil alanlarının kimya ile ilişkisi belirtilir. \n" +
                                "c. Kimya alanı ile ilgili kimya mühendisliği, metalurji mühendisliği, eczacı, kimyager, kimya öğretmenliği meslekleri tanıtılır.\n";
                    }
                    if (sinifno == 10)
                    {
                        baslik1 = "Kimyanın temel kanunlarını açıklar.";
                        icerik1 = "a. Kütlenin korunumu, sabit oranlar ve katlı oranlar kanunları ile ilgili hesaplamalar yapılır.\n" +
                                "b. Demir(II) sülfür bileşiğinin elde edilmesi deneyi yaptırılır.\n";
                        baslik2 = "";
                        icerik2 = "";
                    }
                    if (sinifno == 11)
                    {
                        baslik1 = "";
                        icerik1 = "";
                        baslik2 = "";
                        icerik2 = "";
                    }
                    if (sinifno == 12)
                    {
                        baslik1 = "İndirgenme-Yükseltgenme Tepkimelerinde Elektrik Akımı";
                        icerik1 = "1.Redoks tepkimelerini tanır. \n" +
                                "a. Yükseltgenme ve indirgenme kavramları üzerinde durulur. \n" +
                                "b. Redoks tepkimeleri denkleştirilerek yaygın yükseltgenler (O2, KMnO4, H2SO4, HNO3, H2O2) ve indirgenler (H2, SO2) tanıtılır. \n" +
                                "c. Sülfürik asit ile bakır metalinin tepkimesi deneyi yaptırılarak oluşan tepkimenin denkleştirilmesi sağlanır. Deney sırasında uyulması gereken güvenlik kuralları hatırlatılır.\n";
                        baslik2 = "";
                        icerik2 = "";
                    }
                }
                if (haftano == 4)
                {
                    baslik = (donem + ". Dönem " + sinifno + ". Sınıf Eylül Ayı " + haftano + ". Hafta").toString();
                    if (sinifno == 9)
                    {
                        baslik1 = "Kimyanın Sembolik Dili";
                        icerik1 = "1. Günlük hayatta sıklıkla etkileşimde bulunulan elementlerin adlarını sembolleriyle eşleştirir.\n"+"" +
                                "a. Element tanımı yapılır.\n" +
                                "b. Periyodik sistemdeki ilk 20 element ve günlük hayatta sıkça kullanılan krom, mangan, demir, kobalt, nikel, bakır, çinko, brom, gümüş, kalay, iyot, baryum, altın, cıva, kurşun elementlerinin sembolleri tanıtılır.\n";
                        baslik2 = "2. Bileşiklerin formüllerini adlarıyla eşleştirir.";
                        icerik2 = "a. Bileşik tanımı yapılır.\n" +
                                "b. H2O, HCl, H2SO4, HNO3, CH3COOH, CaCO3, NaHCO3, NH3, Ca(OH)2, NaOH, KOH, CaO ve NaCl  bileşiklerinin yaygın ve sistematik adları tanıtılır. Sistematik adlandırılma kurallarına girilmez.\n";
                    }
                    if (sinifno == 10)
                    {
                        baslik1 = "Kimyanın temel kanunlarını açıklar.";
                        icerik1 = "a. Kütlenin korunumu, sabit oranlar ve katlı oranlar kanunları ile ilgili hesaplamalar yapılır.\n" +
                                "b. Demir(II) sülfür bileşiğinin elde edilmesi deneyi yaptırılır.\n";
                        baslik2 = "";
                        icerik2 = "";
                    }
                    if (sinifno == 11)
                    {
                        baslik1 = "";
                        icerik1 = "";
                        baslik2 = "";
                        icerik2 = "";
                    }
                    if (sinifno == 12)
                    {
                        baslik1 = "İndirgenme-Yükseltgenme Tepkimelerinde Elektrik Akımı";
                        icerik1 = "2.Redoks tepkimeleriyle elektrik enerjisi arasındaki ilişkiyi açıklar. \n" +
                                "a. İndirgen-yükseltgen arasındaki elektron alışverişinin doğrudan temas dışında bir yolla mümkün olup olmayacağının tartışılması sağlanır. \n" +
                                "b. Elektrik enerjisi ile redoks tepkimesinin istemlilik/ istemsizlik durumu ilişkilendirilir\n";
                        baslik2 = "";
                        icerik2 = "";
                    }
                }
            }
            if (ayno == 2)
            {
                if (haftano == 1)
                {
                    baslik = (donem + ". Dönem " + sinifno + ". Sınıf Ekim Ayı " + haftano + ". Hafta").toString();
                    if (sinifno == 9)
                    {
                        baslik1 = "Kimya Uygulamalarında İş Sağlığı ve Güvenliği";
                        icerik1 = "1. Kimya laboratuvarlarında uyulması gereken iş sağlığı ve güvenliği kurallarını açıklar. \n" +
                                "a. Kimyada kullanılan sağlık ve güvenlik amaçlı temel uyarı işaretleri [yanıcı, yakıcı, korozif, patlayıcı, tahriş edici, zehirli (toksik), radyoaktif ve çevreye zararlı anlamına gelen işaretler] tanıtılır. \n" +
                                "b. İş sağlığı ve güvenliği için temel uyarı işaretlerinin bilinmesinin gerekliliği ve önemi vurgulanır.";
                        baslik2 = "2. Doğal kimyasal maddelerin insan sağlığı ve çevre üzerindeki etkilerini açıklar.";
                        icerik2 = "a. Na, K, Fe, Ca, Mg, H2O maddelerinin insan sağlığı ve çevre için önemine değinilir.\n" +
                                "3. Kimya laboratuvarında kullanılan bazı temel malzemeleri tanır. \n" +
                                "Beherglas, erlenmayer, dereceli silindir (mezür), pipet, cam balon, balon joje, büret ve ayırma hunisi gibi laboratuvarda bulunan temel araç gereçler tanıtılır.\n";
                    }
                    if (sinifno == 10)
                    {
                        baslik1 = "Kimyanın temel kanunlarını açıklar.";
                        icerik1 = "a. Kütlenin korunumu, sabit oranlar ve katlı oranlar kanunları ile ilgili hesaplamalar yapılır.\n" +
                                "b. Demir(II) sülfür bileşiğinin elde edilmesi deneyi yaptırılır.\n";
                        baslik2 = "";
                        icerik2 = "";
                    }
                    if (sinifno == 11)
                    {
                        baslik1 = "";
                        icerik1 = "";
                        baslik2 = "";
                        icerik2 = "";
                    }
                    if (sinifno == 12)
                    {
                        baslik1 = "Elektrotlar ve Elektrokimyasal Hücreler";
                        icerik1 = "1. Elektrot ve elektrokimyasal hücre kavramlarını açıklar. \n" +
                                "a. Katot ve anot kavramları, indirgenme-yükseltgenme ile ilişkilendirilerek ele alınır. \n" +
                                "b. Elektrot, yarı-hücre ve hücre kavramları üzerinde durulur.\n";
                        baslik2 = "";
                        icerik2 = "";
                    }
                }
                if (haftano == 2)
                {
                    baslik = (donem + ". Dönem " + sinifno + ". Sınıf Ekim Ayı " + haftano + ". Hafta").toString();
                    if (sinifno == 9)
                    {
                        baslik1 = "ATOM VE PERİYODİK SİSTEM 9.2.1. Atom Modelleri";
                        icerik1 = "1. Dalton, Thomson, Rutherford ve Bohr atom modellerini açıklar. \n" +
                                "a. Bohr atom modeli, atomların soğurduğu/yaydığı ışınlar ile ilişkilendirilir. Hesaplamalara girilmeden sadece ışın soğurma/yayma üzerinde durulur. \n" +
                                "b. Atom modellerinin açıklanmasında bilişim teknolojilerinden (animasyon, simülasyon, video vb.) yararlanılır.\n";
                        baslik2 = "";
                        icerik2 = "";
                    }
                    if (sinifno == 10)
                    {
                        baslik1 = "Mol Kavramı";
                        icerik1 = "Mol kavramının tarihsel süreç içerisindeki değişimi üzerinde durulur.";
                        baslik2 = "";
                        icerik2 = "";
                    }
                    if (sinifno == 11)
                    {
                        baslik1 = "";
                        icerik1 = "";
                        baslik2 = "";
                        icerik2 = "";
                    }
                    if (sinifno == 12)
                    {
                        baslik1 = "Elektrotlar ve Elektrokimyasal Hücreler";
                        icerik1 = "c. İnert elektrotların hangi durumlarda gerekli olduğu belirtilir. \n" +
                                "ç. Pillerde tuz köprüsünün işlevi açıklanır. \n" +
                                "d. Zn/Cu elektrokimyasal pili deneyi yaptırılır; bilişim teknolojilerinden (animasyon, simülasyon, video vb.) yararlanılarak da açıklanır.\n";
                        baslik2 = "";
                        icerik2 = "";
                    }
                }
                if (haftano == 3)
                {
                    baslik = (donem + ". Dönem " + sinifno + ". Sınıf Ekim Ayı " + haftano + ". Hafta").toString();
                    if (sinifno == 9)
                    {
                        baslik1 = "Atom Modelleri";
                        icerik1 = "1. Dalton, Thomson, Rutherford ve Bohr atom modellerini açıklar. \n" +
                                "a. Bohr atom modeli, atomların soğurduğu/yaydığı ışınlar ile ilişkilendirilir. Hesaplamalara girilmeden sadece ışın soğurma/yayma üzerinde durulur. \n" +
                                "b. Atom modellerinin açıklanmasında ";
                        baslik2 = "";
                        icerik2 = "";
                    }
                    if (sinifno == 10)
                    {
                        baslik1 = "Mol Kavramı";
                        icerik1 = "Bağıl atom kütlesi tanımlanır.";
                        baslik2 = "";
                        icerik2 = "";
                    }
                    if (sinifno == 11)
                    {
                        baslik1 = "";
                        icerik1 = "";
                        baslik2 = "";
                        icerik2 = "";
                    }
                    if (sinifno == 12)
                    {
                        baslik1 = "Elektrot Potansiyelleri";
                        icerik1 = "1. Redoks tepkimelerinin istemliliğini standart elektrot potansiyellerini kullanarak açıklar. \n" +
                                "a. Standart yarı hücre indirgenme potansiyelleri, standart hidrojen yarı hücresi ile ilişkilendirilir. \n" +
                                "b. Metallerin aktiflik sırası üzerinde durulur.\n" +
                                "c. Mg, Zn, Fe, Cu ve Al metallerinin HCl çözeltisi ile tepkime deneyleri yaptırılarak metallerin aktiflik karşılaştırması yapılır.\n";
                        baslik2 = "";
                        icerik2 = "";
                    }
                }
                if (haftano == 4)
                {
                    baslik = (donem + ". Dönem " + sinifno + ". Sınıf Ekim Ayı " + haftano + ". Hafta").toString();
                    if (sinifno == 9)
                    {
                        baslik1 = "Atomun Yapısı";
                        icerik1 = "1. Elektron, proton ve nötronun yüklerini, kütlelerini ve atomda bulundukları yerleri karşılaştırır. \n" +
                                "a. Elektron, proton, nötron, atom numarası, kütle numarası, izotop, izoton, izobar ve izoelektronik kavramları tanıtılır. \n" +
                                "b. Elektron, proton ve nötronun yük ve kütlelerinin nasıl bulunduğu sürecine ve izotop atomlarda ortalama atom kütlesi hesabına girilmez.\n" +
                                "Atatürk’ün ‘’Bilim ve teknoloji için sınır yoktur.’’ özdeyişinin, günümüzdeki uzay çalışmaları örnek verilerek, anlamının büyüklüğü ve önemi üzerinde durulmalıdır.\n";
                        baslik2 = "";
                        icerik2 = "";
                    }
                    if (sinifno == 10)
                    {
                        baslik1 = "Mol Kavramı";
                        icerik1 = "İzotop kavramı ve bazı elementlerin mol kütlelerinin tam sayı çıkmayışının nedeni örneklerle açıklanır.";
                        baslik2 = "";
                        icerik2 = "";
                    }
                    if (sinifno == 11)
                    {
                        baslik1 = "";
                        icerik1 = "";
                        baslik2 = "";
                        icerik2 = "";
                    }
                    if (sinifno == 12)
                    {
                        baslik1 = "Elektrot Potansiyelleri";
                        icerik1 = "ç. İki ayrı yarı hücre arasındaki istemli redoks tepkimesinin, standart indirgenme potansiyelleri ile ilişkilendirilmesi sağlanır. \n" +
                                "d. Standart olmayan koşullarda elektrot potansiyellerinin hesaplanmasına yönelik çalışmalara yer verilir\n" +
                                "Atatürk’ün bilim ve tekniğe verdiği önemi özdeyişiyle ile kavrar ve açıklar.\n";
                        baslik2 = "";
                        icerik2 = "";
                    }
                }
            }
            if (ayno == 3)
            {
                if (haftano == 1)
                {
                    baslik = (donem + ". Dönem " + sinifno + ". Sınıf Kasım Ayı " + haftano + ". Hafta").toString();
                    if (sinifno == 9)
                    {
                        baslik1 = "Atomun Yapısı";
                        icerik1 = "1. Elektron, proton ve nötronun yüklerini, kütlelerini ve atomda bulundukları yerleri karşılaştırır. \n" +
                                "a. Elektron, proton, nötron, atom numarası, kütle numarası, izotop, izoton, izobar ve izoelektronik kavramları tanıtılır. \n" +
                                "b. Elektron, proton ve nötronun yük ve kütlelerinin nasıl bulunduğu sürecine ve izotop atomlarda ortalama atom kütlesi hesabına girilmez.\n";
                        baslik2 = "";
                        icerik2 = "";
                    }
                    if (sinifno == 10)
                    {
                        baslik1 = "Mol Kavramı";
                        icerik1 = "Mol hesaplamaları yapılır.";
                        baslik2 = "";
                        icerik2 = "";
                    }
                    if (sinifno == 11)
                    {
                        baslik1 = "";
                        icerik1 = "";
                        baslik2 = "";
                        icerik2 = "";
                    }
                    if (sinifno == 12)
                    {
                        baslik1 = "Elektrot Potansiyelleri";
                        icerik1 = "2. Lityum iyon pillerinin önemini kullanım alanlarıyla ilişkilendirerek açıklar. Öğrencilerin lityum iyon pilleri ve güncel kullanım alanlarını açıklayan bir poster hazırlamaları ve sınıfta sunmaları sağlanır.\n" +
                                "Atatürk'ün \"Bilim ve Teknik İçin Sınır Yoktur\" özdeyişi\n";
                        baslik2 = "";
                        icerik2 = "";
                    }
                }
                if (haftano == 2)
                {
                    baslik = (donem + ". Dönem " + sinifno + ". Sınıf Kasım Ayı " + haftano + ". Hafta").toString();
                    if (sinifno == 9)
                    {
                        baslik1 = "Periyodik Sistem";
                        icerik1 = "1. Elementlerin periyodik sistemdeki yerleşim esaslarını açıklar. \n" +
                                "a. Mendeleyev’in periyodik sistem üzerine yaptığı çalışmalar ve Moseley’in katkıları üzerinde durulur. \n" +
                                "b. Atomların katman-elektron dağılımlarıyla periyodik sistemdeki yerleri arasındaki ilişki açıklanır. İlk 20 element esas olup diğer elementlerin katman elektron dağılımlarına girilmez.\n" +
                                "Fizik, kimya ve biyoloji derslerinin ve matematiğin öğretiminde kullanılan yüzlerce anlaşılması güç Arapça ve Osmanlıca terimlerin Atatürk’ün direktifleri ile Türkçeleştirildiği anlatılmalı, aradaki büyük öğrenim kolaylığına öğrencilerin dikkati çekilmelidir.\n";
                        baslik2 = "";
                        icerik2 = "";
                    }
                    if (sinifno == 10)
                    {
                        baslik1 = "Kimyasal Tepkimeler ve Denklemler";
                        icerik1 = "1. Kimyasal tepkime türlerini karşılaştırır. \n" +
                                "a. Yanma, sentez, analiz (ayrışma), asit-baz, çözünme-çökelme tepkimeleri örneklerle açıklanır. \n";
                        baslik2 = "";
                        icerik2 = "";
                    }
                    if (sinifno == 11)
                    {
                        baslik1 = "";
                        icerik1 = "";
                        baslik2 = "";
                        icerik2 = "";
                    }
                    if (sinifno == 12)
                    {
                        baslik1 = "Elektroliz";
                        icerik1 = "1. Elektroliz olayını elektrik akımı, zaman ve değişime uğrayan madde kütlesi açısından açıklar. \n" +
                                "a. 1 mol elektronun toplam yükü üzerinden elektrik yükü-kütle ilişkisi kurulması sağlanır. \n" +
                                "b. Yük birimi Coulomb (C) tanımlanır.\n" +
                                "Atatürk!ün ‘’İstikbal Göklerdedir.’’ Sözü ile fen ve tekniğe verdiği önemi kavrar.\n";
                        baslik2 = "";
                        icerik2 = "";
                    }
                }
                if (haftano == 3)
                {
                    baslik = (donem + ". Dönem " + sinifno + ". Sınıf Kasım Ayı " + haftano + ". Hafta").toString();
                    if (sinifno == 9)
                    {
                        baslik1 = "Periyodik Sistem";
                        icerik1 = "2. Elementleri periyodik sistemdeki yerlerine göre sınıflandırır. \n" +
                                "Elementlerin sınıflandırılması metal, ametal, yarı metal ve asal (soy) gazlar olarak yapılır. \n";
                        baslik2 = "";
                        icerik2 = "";
                    }
                    if (sinifno == 10)
                    {
                        baslik1 = "Kimyasal Tepkimeler ve Denklemler";
                        icerik1 = "1. Kimyasal tepkime türlerini karşılaştırır.\n" +
                                " b. Kimyasal tepkime denklemlerinin denkleştirilmesi sağlanır. Redoks \n" +
                                "tepkimelerine girilmez. \n";
                        baslik2 = "";
                        icerik2 = "";
                    }
                    if (sinifno == 11)
                    {
                        baslik1 = "";
                        icerik1 = "";
                        baslik2 = "";
                        icerik2 = "";
                    }
                    if (sinifno == 12)
                    {
                        baslik1 = "Elektroliz";
                        icerik1 = " c. Faraday bağıntısı açıklanarak bu bağıntının kullanıldığı hesaplamalar yapılır. \n" +
                                "ç. Öğrencilerin Faraday bağıntısını elektronik tablolama programı kullanarak kurgulamaları, değerleri değiştirerek gerçekleşen değişiklikleri gözlemlemeleri ve yorumlamaları sağlanır.\n";
                        baslik2 = "";
                        icerik2 = "";
                    }
                }
                if (haftano == 4)
                {
                    baslik = (donem + ". Dönem " + sinifno + ". Sınıf Kasım Ayı " + haftano + ". Hafta").toString();
                    if (sinifno == 9)
                    {
                        baslik1 = "Periyodik Sistem";
                        icerik1 = "3. Periyodik özelliklerin değişme eğilimlerini açıklar. \n" +
                                "a. Periyodik özelliklerden metalik-ametalik, atom yarıçapı, iyonlaşma enerjisi, elektron ilgisi ve elektronegatiflik kavramları açıklanır; bunların nasıl ölçüldüğü konusuna girilmez. \n" +
                                "b. Kovalent, iyonik, metalik, van der Waals yarıçap tanımlarına girilmez. \n" +
                                "c. Periyodik özelliklerin açıklanmasında bilişim teknolojilerinden (animasyon, simülasyon, video vb.) yararlanılır.\n";
                        baslik2 = "Periyodik Sistem (Kasım 5. Hafta)";
                        icerik2 = "3. Periyodik özelliklerin değişme eğilimlerini açıklar. \n" +
                                "a. Periyodik özelliklerden metalik-ametalik, atom yarıçapı, iyonlaşma enerjisi, elektron ilgisi ve elektronegatiflik kavramları açıklanır; bunların nasıl ölçüldüğü konusuna girilmez. \n" +
                                "b. Kovalent, iyonik, metalik, van der Waals yarıçap tanımlarına girilmez. \n" +
                                "c. Periyodik özelliklerin açıklanmasında bilişim teknolojilerinden (animasyon, simülasyon, video vb.) yararlanılır.\n";
                    }
                    if (sinifno == 10)
                    {
                        baslik1 = "Kimyasal Tepkimeler ve Denklemler";
                        icerik1 = "1. Kimyasal tepkime türlerini karşılaştırır.\n" +
                                " c. Kurşun(II) iyodürün çökmesi deneyi yaptırılır.\n";
                        baslik2 = "Kimyasal Tepkimeler ve Denklemler (Kasım 5. Hafta)";
                        icerik2 = "1. Kimyasal tepkime türlerini karşılaştırır. \n" +
                                "ç. Kimyasal tepkimelerin açıklanmasında bilişim teknolojilerinden \n" +
                                "(animasyon, simülasyon, video vb.) yararlanılır.\n";
                    }
                    if (sinifno == 11)
                    {
                        baslik1 = "";
                        icerik1 = "";
                        baslik2 = "";
                        icerik2 = "";
                    }
                    if (sinifno == 12)
                    {
                        baslik1 = "Elektroliz";
                        icerik1 = "d. Kaplama deneyi yaptırılır. \n" +
                                "2. Kimyasal maddelerin elektroliz yöntemiyle elde ediliş sürecini açıklar. Suyun elektrolizi ile hidrojen ve oksijen eldesi deneyi yaptırılır.\n";
                        baslik2 = "Korozyon (Kasım 5. Hafta)";
                        icerik2 = "1. Korozyon önleme yöntemlerinin elektrokimyasal temellerini açıklar. \n" +
                                "a. Korozyon kavramı açıklanır. \n" +
                                "b. Korozyondan koruma süreci metallerin aktiflik sırası ile ilişkilendirilir; kurban elektrot kavramı üzerinde durulur. \n" +
                                "c. Kurban elektrotun kullanım alanlarına örnekler verilir.\n";
                    }
                }
            }
            if (ayno == 4)
            {
                if (haftano == 1)
                {
                    baslik = (donem + ". Dönem " + sinifno + ". Sınıf Aralık Ayı " + haftano + ". Hafta").toString();
                    if (sinifno == 9)
                    {
                        baslik1 = "KİMYASAL TÜRLER ARASI ETKİLEŞİMLER 9.3.1. Kimyasal Tür";
                        icerik1 = "1. Kimyasal türleri açıklar. \n" +
                                "Radikal kavramına girilmez.\n";
                        baslik2 = "";
                        icerik2 = "";
                    }
                    if (sinifno == 10)
                    {
                        baslik1 = "Kimyasal Tepkimelerde Hesaplamalar.";
                        icerik1 = "1. Kütle, mol sayısı, molekül sayısı, atom sayısı ve gazlar için normal şartlarda hacim kavramlarını birbirleriyle ilişkilendirerek hesaplamalar yapar.";
                        baslik2 = "";
                        icerik2 = "";
                    }
                    if (sinifno == 11)
                    {
                        baslik1 = "";
                        icerik1 = "";
                        baslik2 = "";
                        icerik2 = "";
                    }
                    if (sinifno == 12)
                    {
                        baslik1 = "Anorganik ve Organik Bileşikler";
                        icerik1 = "1.Anorganik ve organik bileşiklerin özelliklerini açıklar.\n" +
                                "a. Organik bileşik kavramının tarihsel gelişimi açıklanır.\n" +
                                "b. Organik bileşiklerde karbon ve hidrojen tayini deneyi yaptırılır.\n";
                        baslik2 = "2. Anorganik ve organik bileşikleri ayırt eder.";
                        icerik2 = "Anorganik ve organik bileşiklerin formüllerinin adları ile eşleştirilmesi sağlanır.";
                    }
                }
                if (haftano == 2)
                {
                    baslik = (donem + ". Dönem " + sinifno + ". Sınıf Aralık Ayı " + haftano + ". Hafta").toString();
                    if (sinifno == 9)
                    {
                        baslik1 = "Kimyasal Türler Arası Etkileşimlerin Sınıflandırılması";
                        icerik1 = "1. Kimyasal türler arasındaki etkileşimleri sınıflandırır. \n" +
                                "a. Bağlanan türler arası sınıflandırma, atomlar arası ve moleküller arası şeklinde yapılır; bu sınıflandırmanın getirdiği güçlüklere değinilir. \n" +
                                "b. Güçlü etkileşimlere örnek olarak iyonik, kovalent ve metalik bağ; zayıf etkileşimlere örnek olarak da hidrojen bağı ve van der Waals kuvvetleri verilir.\n";
                        baslik2 = "";
                        icerik2 = "";
                    }
                    if (sinifno == 10)
                    {
                        baslik1 = "Kimyasal Tepkimelerde Hesaplamalar";
                        icerik1 = "a. Sınırlayıcı bileşen hesapları üzerinde durulur.";
                        baslik2 = "";
                        icerik2 = "";
                    }
                    if (sinifno == 11)
                    {
                        baslik1 = "";
                        icerik1 = "";
                        baslik2 = "";
                        icerik2 = "";
                    }
                    if (sinifno == 12)
                    {
                        baslik1 = "Basit Formül ve Molekül Formülü";
                        icerik1 = "1. Organik bileşiklerin basit ve molekül formüllerinin bulunması ile ilgili hesaplamalar yapar.";
                        baslik2 = "";
                        icerik2 = "";
                    }
                }
                if (haftano == 3)
                {
                    baslik = (donem + ". Dönem " + sinifno + ". Sınıf Aralık Ayı " + haftano + ". Hafta").toString();
                    if (sinifno == 9)
                    {
                        baslik1 = "Kimyasal Türler Arası Etkileşimlerin Sınıflandırılması";
                        icerik1 = "1. Kimyasal türler arasındaki etkileşimleri sınıflandırır. \n" +
                                "a. Bağlanan türler arası sınıflandırma, atomlar arası ve moleküller arası şeklinde yapılır; bu sınıflandırmanın getirdiği güçlüklere değinilir. \n" +
                                "b. Güçlü etkileşimlere örnek olarak iyonik, kovalent ve metalik bağ; zayıf etkileşimlere örnek olarak da hidrojen bağı ve van der Waals kuvvetleri verilir.\n";
                        baslik2 = "";
                        icerik2 = "";
                    }
                    if (sinifno == 10)
                    {
                        baslik1 = "Kimyasal Tepkimelerde Hesaplamalar";
                        icerik1 = "b. Tepkime denklemleri temelinde % verim hesapları yapılır.";
                        baslik2 = "";
                        icerik2 = "";
                    }
                    if (sinifno == 11)
                    {
                        baslik1 = "";
                        icerik1 = "";
                        baslik2 = "";
                        icerik2 = "";
                    }
                    if (sinifno == 12)
                    {
                        baslik1 = "Doğada Karbon";
                        icerik1 = "1. Karbon allotroplarının özelliklerini yapılarıyla ilişkilendirir. \n" +
                                "a. Karbon elementinin çok sayıda bileşik oluşturma özelliği ile bağ yapma özelliği arasında ilişki kurulur.\n";
                        baslik2 = "";
                        icerik2 = "";
                    }
                }
                if (haftano == 4)
                {
                    baslik = (donem + ". Dönem " + sinifno + ". Sınıf Aralık Ayı " + haftano + ". Hafta").toString();
                    if (sinifno == 9)
                    {
                        baslik1 = "Güçlü Etkileşimler";
                        icerik1 = "1. İyonik bağın oluşumunu iyonlar arası etkileşimler ile ilişkilendirir. \n" +
                                "a. Nötr atomların ve tek atomlu iyonların Lewis sembolleri verilir. Örnekler periyodik sistemdeki ilk 20 element arasından seçilir. \n" +
                                "b. İyonik bileşiklerin yapısal birimleri ile molekül kavramının karıştırılmamasına vurgu yapılır.\n" +
                                "c. İyonik bağların açıklanmasında bilişim teknolojilerinden (animasyon, simülasyon, video vb.) yararlanılır.\n";
                        baslik2 = "2. İyonik bağlı bileşiklerin sistematik adlandırmasını yapar. ";
                        icerik2 = "a. Tek atomlu ve çok atomlu iyonların (NH4+, OH-, NO3-, SO42-, CO32-, PO43-, CN-, CH3COO-) oluşturduğu bileşiklerin adlandırılması yapılır. \n" +
                                "b. Değişken değerlikli metallerin (Cu, Fe, Hg, Sn, Pb) oluşturduğu bileşiklerin adlandırılması yapılır. \n" +
                                "c. Hidrat bileşiklerinin adlandırılmasına girilmez.";
                    }
                    if (sinifno == 10)
                    {
                        baslik1 = "Homojen ve Heterojen Karışımlar.";
                        icerik1 = "1. Karışımları niteliklerine göre sınıflandırır. a. Homojen ve heterojen karışımların ayırt edilmesinde belirleyici olan özellikler açıklanır. \n" +
                                "b. Homojen karışımların çözelti olarak adlandırıldığı vurgulanır ve günlük hayattan çözelti örnekleri verilir.\n";
                        baslik2 = "";
                        icerik2 = "";
                    }
                    if (sinifno == 11)
                    {
                        baslik1 = "";
                        icerik1 = "";
                        baslik2 = "";
                        icerik2 = "";
                    }
                    if (sinifno == 12)
                    {
                        baslik1 = "Doğada Karbon";
                        icerik1 = "b. Elmas ve grafitin incelenmesi sağlanır; fulleren, grafen ve nanotüplerin yapıları ve önemleri görsel materyallerle tanıtılır.";
                        baslik2 = "";
                        icerik2 = "";
                    }
                }
            }
            if (ayno == 5)
            {
                if (haftano == 1)
                {
                    baslik = (donem + ". Dönem " + sinifno + ". Sınıf Ocak Ayı " + haftano + ". Hafta").toString();
                    if (sinifno == 9)
                    {
                        baslik1 = "Güçlü Etkileşimler";
                        icerik1 = "3. Kovalent bağın oluşumunu atomlar arası elektron ortaklaşması temelinde açıklar. \n" +
                                "a. Kovalent bağlar sınıflandırılırken polar ve apolar kovalent bağlar verilir; koordine kovalent bağa girilmez. \n" +
                                "b. Basit moleküllerin (H2, Cl2, O2, N2, HCl, H2O, BH3, NH3, CH4, CO2) Lewis elektron nokta formülleri üzerinden bağın ve moleküllerin polarlık-apolarlık durumları üzerinde durulur. \n";
                        baslik2 = "";
                        icerik2 = "";
                    }
                    if (sinifno == 10)
                    {
                        baslik1 = "Homojen ve Heterojen Karışımlar.";
                        icerik1 = "c. Heterojen karışımlar, dağılan maddenin ve dağılma ortamının fiziksel hâline göre sınıflandırılır. \n" +
                                "ç. Karışımlar çözünenin ve/veya dağılanın tanecik boyutu esas alınarak sınıflandırılır.\n";
                        baslik2 = "";
                        icerik2 = "";
                    }
                    if (sinifno == 11)
                    {
                        baslik1 = "";
                        icerik1 = "";
                        baslik2 = "";
                        icerik2 = "";
                    }
                    if (sinifno == 12)
                    {
                        baslik1 = "Hibritleşme-Molekül Geometrileri";
                        icerik1 = "1. Tek, çift ve üçlü bağların oluşumunu hibrit ve atom orbitalleri temelinde açıklar. ";
                        baslik2 = "";
                        icerik2 = "";
                    }
                }
                if (haftano == 2)
                {
                    baslik = (donem + ". Dönem " + sinifno + ". Sınıf Ocak Ayı " + haftano + ". Hafta").toString();
                    if (sinifno == 9)
                    {
                        baslik1 = "Güçlü Etkileşimler";
                        icerik1 = "c. Kovalent bağların açıklanmasında bilişim teknolojilerinden (animasyon, simülasyon, video vb.) yararlanılır.";
                        baslik2 = "4. Kovalent bağlı bileşiklerin sistematik adlandırmasını yapar.";
                        icerik2 = "";
                    }
                    if (sinifno == 10)
                    {
                        baslik1 = "Homojen ve Heterojen Karışımlar.";
                        icerik1 = "2. Çözünme sürecini moleküler düzeyde açıklar. \n" +
                                "a. Tanecikler arası etkileşimlerden faydalanılarak çözünme açıklanır. \n" +
                                "b. Çözünme ile polarlık, hidrojen bağı ve çözücü-çözünen benzerliği ilişkilendirilir.\n";
                        baslik2 = "";
                        icerik2 = "";
                    }
                    if (sinifno == 11)
                    {
                        baslik1 = "";
                        icerik1 = "";
                        baslik2 = "";
                        icerik2 = "";
                    }
                    if (sinifno == 12)
                    {
                        baslik1 = "Hibritleşme-Molekül Geometrileri";
                        icerik1 = "2. Moleküllerin geometrilerini merkez atomu orbitallerinin hibritleşmesi esasına göre belirler.";
                        baslik2 = "";
                        icerik2 = "";
                    }
                }
                if (haftano == 3)
                {
                    baslik = (donem + ". Dönem " + sinifno + ". Sınıf Ocak Ayı " + haftano + ". Hafta").toString();
                    if (sinifno == 9)
                    {
                        baslik1 = "Zayıf Etkileşimler";
                        icerik1 = "5. Metalik bağın oluşumunu açıklar. \n" +
                                "Metalik bağın açıklanmasında elektron denizi modeli kullanılır. \n" +
                                "Atatürk’ün ‘’Hayatta en hakiki mürşit ilimdir.’’ Özdeyişinin bilimin hızla geliştiği bu çağdaki etki alanı ve önemi açıklanacaktır 1. Zayıf ve güçlü etkileşimleri bağ enerjisi esasına göre ayırt eder.\n";
                        baslik2 = "";
                        icerik2 = "";
                    }
                    if (sinifno == 10)
                    {
                        baslik1 = "Homojen ve Heterojen Karışımlar.";
                        icerik1 = "c. Farklı maddelerin (sodyum klorür, etil alkol, karbon tetraklorür) suda çözünme deneyleri yaptırılır. \n" +
                                "ç. Farklı fiziksel hâldeki maddelerin suda çözünme süreçlerinin açıklanmasında bilişim teknolojilerinden (animasyon, simülasyon, video vb.) yararlanılır. \n";
                        baslik2 = "";
                        icerik2 = "";
                    }
                    if (sinifno == 11)
                    {
                        baslik1 = "";
                        icerik1 = "";
                        baslik2 = "";
                        icerik2 = "";
                    }
                    if (sinifno == 12)
                    {
                        baslik1 = "Hibritleşme-Molekül Geometrileri";
                        icerik1 = "a. Hibritleşme ve VSEPR (Değerlik Katmanı Elektron Çifti İtmesi) yaklaşımı üzerinde durulur. 2. periyot elementlerinin hidrojenle yaptığı bileşikler dışındakiler verilmez.";
                        baslik2 = "";
                        icerik2 = "";
                    }
                }
                if (haftano == 4)
                {
                    baslik = (donem + ". Dönem " + sinifno + ". Sınıf Ocak Ayı " + haftano + ". Hafta").toString();
                    if (sinifno == 9)
                    {
                        baslik1 = "";
                        icerik1 = "";
                        baslik2 = "";
                        icerik2 = "";
                    }
                    if (sinifno == 10)
                    {
                        baslik1 = "";
                        icerik1 = "";
                        baslik2 = "";
                        icerik2 = "";
                    }
                    if (sinifno == 11)
                    {
                        baslik1 = "";
                        icerik1 = "";
                        baslik2 = "";
                        icerik2 = "";
                    }
                    if (sinifno == 12)
                    {
                        baslik1 = "";
                        icerik1 = "";
                        baslik2 = "";
                        icerik2 = "";
                    }
                }
            }
        }
        else if (donem.equals("II"))
        {
            if (ayno == 1)
            {
                if (haftano == 1)
                {
                    baslik = (donem + ". Dönem " + sinifno + ". Sınıf Şubat Ayı " + haftano + ". Hafta").toString();
                    if (sinifno == 9)
                    {
                        baslik1 = "Zayıf Etkileşimler";
                        icerik1 = "1. Zayıf ve güçlü etkileşimleri bağ enerjisi esasına göre ayırt eder.\n" +
                                "2. Van der Waals kuvvetlerinin oluşumunu açıklar. \n" +
                                "a. Dipol-dipol etkileşimleri, iyon-dipol etkileşimleri ve London kuvvetlerinin etkileşme güçleri karşılaştırılır. \n" +
                                "b. Dipol-indüklenmiş dipol ve iyon-indüklenmiş dipol etkileşimlerine girilmez.\n";
                        baslik2 = "";
                        icerik2 = "";
                    }
                    if (sinifno == 10)
                    {
                        baslik1 = "Homojen ve Heterojen Karışımlar.";
                        icerik1 = "3. Çözünmüş madde oranını belirten ifadeleri yorumlar. \n" +
                                "a. Çözünen madde oranının yüksek (derişik) ve düşük (seyreltik) olduğu çözeltilere örnekler verilir. \n" +
                                "b. Kütlece yüzde ve ppm derişimleri tanıtılır; ppm ile ilgili hesaplamalara girilmez. \n" +
                                "c. Yaygın sulu çözeltilerde (çeşme suyu, deniz suyu, serum, kolonya, şekerli su) çözünenin kütlece yüzde derişimlerine örnekler verilir.\n";
                        baslik2 = "";
                        icerik2 = "";
                    }
                    if (sinifno == 11)
                    {
                        baslik1 = "";
                        icerik1 = "";
                        baslik2 = "";
                        icerik2 = "";
                    }
                    if (sinifno == 12)
                    {
                        baslik1 = "";
                        icerik1 = "";
                        baslik2 = "";
                        icerik2 = "";
                    }
                }
                if (haftano == 2)
                {
                    baslik = (donem + ". Dönem " + sinifno + ". Sınıf Şubat Ayı " + haftano + ". Hafta").toString();
                    if (sinifno == 9)
                    {
                        baslik1 = "Zayıf Etkileşimler";
                        icerik1 = "3. Hidrojen bağları ile maddelerin fiziksel özellikleri arasında ilişki kurar. \n" +
                                "a. Hidrojen bağının oluşumu açıklanır. \n" +
                                "b. Uygun bileşik serilerinin kaynama noktası değişimleri grafik üzerinde, hidrojen bağları ve diğer etkileşimler kullanılarak açıklanır. \n" +
                                "c. Aziz Sancar’ın DNA’nın onarımı ile ilgili çalışmalarına ve kısa biyografisine okuma parçası olarak yer verilir. Sabırlı, azimli ve kararlı olmanın bilimsel çalışmalarda başarıya ulaşmadaki önemi vurgulanır.\n";
                        baslik2 = "";
                        icerik2 = "";
                    }
                    if (sinifno == 10)
                    {
                        baslik1 = "Homojen ve Heterojen Karışımlar.";
                        icerik1 = "3. Çözünmüş madde oranını belirten ifadeleri yorumlar.\n" +
                                "a. Çözünen madde oranının yüksek (derişik) ve düşük (seyreltik) olduğu çözeltilere örnekler verilir.\n" +
                                "b. Kütlece yüzde ve ppm derişimleri tanıtılır; ppm ile ilgili hesaplamalara girilmez.\n" +
                                "c. Yaygın sulu çözeltilerde (çeşme suyu, deniz suyu, serum, kolonya, şekerli su) çözünenin kütlece yüzde derişimlerine örnekler verilir. \n";
                        baslik2 = "";
                        icerik2 = "";
                    }
                    if (sinifno == 11)
                    {
                        baslik1 = "";
                        icerik1 = "";
                        baslik2 = "";
                        icerik2 = "";
                    }
                    if (sinifno == 12)
                    {
                        baslik1 = "";
                        icerik1 = "";
                        baslik2 = "";
                        icerik2 = "";
                    }
                }
                if (haftano == 3)
                {
                    baslik = (donem + ". Dönem " + sinifno + ". Sınıf Şubat Ayı " + haftano + ". Hafta").toString();
                    if (sinifno == 9)
                    {
                        baslik1 = "Fiziksel ve Kimyasal Değişimler";
                        icerik1 = "1. Fiziksel ve kimyasal değişimi, kopan ve oluşan bağ enerjilerinin büyüklüğü temelinde ayırt eder. \n" +
                                "Türler arasında fiziksel ve kimyasal değişimlerin açıklanmasında bilişim teknolojilerinden (animasyon, simülasyon, video vb.) yararlanılır.\n";
                        baslik2 = "";
                        icerik2 = "";
                    }
                    if (sinifno == 10)
                    {
                        baslik1 = "Homojen ve Heterojen Karışımlar.";
                        icerik1 = "4. Çözeltilerin özelliklerini günlük hayattan örneklerle açıklar. a. Çözeltilerin donma ve kaynama noktasının çözücülerinkinden farklı olduğu ve derişime bağlı olarak değişimi açıklanır. Buhar basıncı düşmesine girilmez.\n" +
                                "b. Karayollarında ve taşıtlarda buzlanmaya karşı alınan önlemlere değinilir; bu önlemlerin olumlu ve olumsuz etkilerinin tartışılması sağlanır. Sınıf içi tartışmalarda karşısındakini dinlemenin ve görgü kurallarına uygun davranmanın tartışmanın verimliliği üzerindeki etkisi hatırlatılır.\n";
                        baslik2 = "";
                        icerik2 = "";
                    }
                    if (sinifno == 11)
                    {
                        baslik1 = "";
                        icerik1 = "";
                        baslik2 = "";
                        icerik2 = "";
                    }
                    if (sinifno == 12)
                    {
                        baslik1 = "";
                        icerik1 = "";
                        baslik2 = "";
                        icerik2 = "";
                    }
                }
                if (haftano == 4)
                {
                    baslik = (donem + ". Dönem " + sinifno + ". Sınıf Şubat Ayı " + haftano + ". Hafta").toString();
                    if (sinifno == 9)
                    {
                        baslik1 = "Fiziksel ve Kimyasal Değişimler";
                        icerik1 = "1. Fiziksel ve kimyasal değişimi, kopan ve oluşan bağ enerjilerinin büyüklüğü temelinde ayırt eder. \n" +
                                "Türler arasında fiziksel ve kimyasal değişimlerin açıklanmasında bilişim teknolojilerinden (animasyon, simülasyon, video vb.) yararlanılır.\n";
                        baslik2 = "";
                        icerik2 = "";
                    }
                    if (sinifno == 10)
                    {
                        baslik1 = "Ayırma ve Saflaştırma Teknikleri.";
                        icerik1 = ".1. Endüstri ve sağlık alanlarında kullanılan karışım ayırma tekniklerini açıklar.\n" +
                                "a. Mıknatıs ile ayırma, erime noktası farkı ile ayırma, tanecik boyutu (süzme, diyaliz), kaynama noktası (basit damıtma, ayrımsal damıtma), çözünürlük (özütleme, kristallendirme, ayrımsal kristallendirme) ve yoğunluk (ayırma hunisi, yüzdürme) farkından yararlanılarak uygulanan ayırma teknikleri üzerinde durulur.\n";
                        baslik2 = "";
                        icerik2 = "";
                    }
                    if (sinifno == 11)
                    {
                        baslik1 = "";
                        icerik1 = "";
                        baslik2 = "";
                        icerik2 = "";
                    }
                    if (sinifno == 12)
                    {
                        baslik1 = "";
                        icerik1 = "";
                        baslik2 = "";
                        icerik2 = "";
                    }
                }
            }
            if (ayno == 2)
            {
                if (haftano == 1)
                {
                    baslik = (donem + ". Dönem " + sinifno + ". Sınıf Mart Ayı " + haftano + ". Hafta").toString();
                    if (sinifno == 9)
                    {
                        baslik1 = "MADDENİN HÂLLERİ 9.4.1. Maddenin Fiziksel Hâlleri";
                        icerik1 = "1. Maddenin farklı hâllerde olmasının canlılar ve çevre için önemini açıklar. \n" +
                                "a. Suyun fiziksel hâllerinin (katı, sıvı, gaz) farklı işlevler sağladığı vurgulanır. \n" +
                                "b. LPG (sıvılaştırılmış petrol gazı), deodorantlardaki itici gazlar, LNG (sıvılaştırılmış doğal gaz), soğutucularda kullanılan gazların davranışları üzerinden hâl değişimlerinin önemi vurgulanır. \n" +
                                "c. Havadan azot ve oksijen eldesi üzerinde durulur.";
                        baslik2 = "";
                        icerik2 = "";
                    }
                    if (sinifno == 10)
                    {
                        baslik1 = "Ayırma ve Saflaştırma Teknikleri.";
                        icerik1 = "b. Karışımları ayırma deneyleri yaptırılır.";
                        baslik2 = "";
                        icerik2 = "";
                    }
                    if (sinifno == 11)
                    {
                        baslik1 = "";
                        icerik1 = "";
                        baslik2 = "";
                        icerik2 = "";
                    }
                    if (sinifno == 12)
                    {
                        baslik1 = "";
                        icerik1 = "";
                        baslik2 = "";
                        icerik2 = "";
                    }
                }
                if (haftano == 2)
                {
                    baslik = (donem + ". Dönem " + sinifno + ". Sınıf Mart Ayı " + haftano + ". Hafta").toString();
                    if (sinifno == 9)
                    {
                        baslik1 = "Maddenin Fiziksel Hâlleri";
                        icerik1 = "1. Maddenin farklı hâllerde olmasının canlılar ve çevre için önemini açıklar. \n" +
                                "a. Suyun fiziksel hâllerinin (katı, sıvı, gaz) farklı işlevler sağladığı vurgulanır. \n" +
                                "b. LPG (sıvılaştırılmış petrol gazı), deodorantlardaki itici gazlar, LNG (sıvılaştırılmış doğal gaz), soğutucularda kullanılan gazların davranışları üzerinden hâl değişimlerinin önemi vurgulanır. \n" +
                                "c. Havadan azot ve oksijen eldesi üzerinde durulur.";
                        baslik2 = "";
                        icerik2 = "";
                    }
                    if (sinifno == 10)
                    {
                        baslik1 = "Ayırma ve Saflaştırma Teknikleri.";
                        icerik1 = "b. Karışımları ayırma deneyleri yaptırılır.";
                        baslik2 = "";
                        icerik2 = "";
                    }
                    if (sinifno == 11)
                    {
                        baslik1 = "";
                        icerik1 = "";
                        baslik2 = "";
                        icerik2 = "";
                    }
                    if (sinifno == 12)
                    {
                        baslik1 = "";
                        icerik1 = "";
                        baslik2 = "";
                        icerik2 = "";
                    }
                }
                if (haftano == 3)
                {
                    baslik = (donem + ". Dönem " + sinifno + ". Sınıf Mart Ayı " + haftano + ". Hafta").toString();
                    if (sinifno == 9)
                    {
                        baslik1 = "Katılar";
                        icerik1 = "1. Katıların özellikleri ile bağların gücü arasında ilişki kurar. \n" +
                                "Katılar sınıflandırılarak günlük hayatta sıkça karşılaşılan tuz, iyot, elmas ve çinko katılarının taneciklerini bir arada tutan kuvvetler üzerinde durulur.\n" +
                                "Atatürk’ün ‘’İstikbal göklerdedir.’’ sözünün anlamı belirtilip; Atatürk’ün fen ve teknikten soyutlanamayan hava gücüne, dolaylı da olsa bu gücün dayandığı fen ve tekniğe verdiği önem açıklanacaktır.";
                        baslik2 = "";
                        icerik2 = "";
                    }
                    if (sinifno == 10)
                    {
                        baslik1 = "Asitler ve Bazlar";
                        icerik1 = "1. Asitleri ve bazları bilinen özellikleri yardımıyla ayırt eder. \n" +
                                "a. Limon suyu, sirke gibi maddelerin ekşilik ve aşındırma özellikleri, asitlikleriyle ilişkilendirilir. \n" +
                                "b. Kirecin, sabunun ve deterjanların ciltte oluşturduğu kayganlık hissi baziklikle ilişkilendirilir. \n" +
                                "c. Asitler ve bazların bazı renkli maddelerin (çay, üzüm suyu, kırmızı lahana) rengini değiştirmesi deneyleri yapılarak indikatör kavramı ve pH kâğıdı tanıtılır.\n";
                        baslik2 = "";
                        icerik2 = "ç. Sirke, limon suyu, çamaşır suyu, sodyum hidroksit, hidroklorik asit, sodyum klorür, potasyum nitrat ve amonyum klorür çözeltilerinin asitlik veya bazlık değerlerinin pH kâğıdı kullanılarak yorumlanması sağlanır. \n" +
                                "d. pH kavramı asitlik ve bazlık ile ilişkilendirilerek açıklanır. Logaritmik tanıma girilmez. \n" +
                                "e. Günlük hayatta kullanılan tüketim maddelerinin ambalajlarında yer alan pH değerlerinin asitlikbazlıkla ilişkilendirilmesi sağlanır.\n";
                    }
                    if (sinifno == 11)
                    {
                        baslik1 = "";
                        icerik1 = "";
                        baslik2 = "";
                        icerik2 = "";
                    }
                    if (sinifno == 12)
                    {
                        baslik1 = "";
                        icerik1 = "";
                        baslik2 = "";
                        icerik2 = "";
                    }
                }
                if (haftano == 4)
                {
                    baslik = (donem + ". Dönem " + sinifno + ". Sınıf Mart Ayı " + haftano + ". Hafta").toString();
                    if (sinifno == 9)
                    {
                        baslik1 = "Katılar";
                        icerik1 = "1. Katıların özellikleri ile bağların gücü arasında ilişki kurar. \n" +
                                "Katılar sınıflandırılarak günlük hayatta sıkça karşılaşılan tuz, iyot, elmas ve çinko katılarının taneciklerini bir arada tutan kuvvetler üzerinde durulur.";
                        baslik2 = "";
                        icerik2 = "";
                    }
                    if (sinifno == 10)
                    {
                        baslik1 = "Asitler ve Bazlar";
                        icerik1 = "2. Maddelerin asitlik ve bazlık özelliklerini moleküler düzeyde açıklar. a. Asitler su ortamında H3O+ iyonu oluşturma, bazlar ise OH- iyonu oluşturma özellikleriyle tanıtılarak basit örnekler verilir.\n" +
                                "b. Su ile etkileşerek asit/baz oluşturan CO2, SO2 ve N2O5 maddelerinin çözeltilerinin neden asit gibi davrandığı; NH3 ve CaO maddelerinin çözeltilerinin de neden baz gibi davrandığı bu tepkimeler üzerinden açıklanır. Lewis asit-baz tanımına girilmez.\n";
                        baslik2 = "";
                        icerik2 = "";
                    }
                    if (sinifno == 11)
                    {
                        baslik1 = "";
                        icerik1 = "";
                        baslik2 = "";
                        icerik2 = "";
                    }
                    if (sinifno == 12)
                    {
                        baslik1 = "";
                        icerik1 = "";
                        baslik2 = "";
                        icerik2 = "";
                    }
                }
            }
            if (ayno == 3)
            {
                if (haftano == 1)
                {
                    baslik = (donem + ". Dönem " + sinifno + ". Sınıf Nisan Ayı " + haftano + ". Hafta").toString();
                    if (sinifno == 9)
                    {
                        baslik1 = "Sıvılar";
                        icerik1 = "1. Sıvılarda viskozite kavramını açıklar.\n" +
                                "2. Sıvılarda viskoziteyi etkileyen faktörleri açıklar. \n" +
                                "a. Viskozitenin moleküller arası etkileşim ile ilişkilendirilmesi sağlanır. \n" +
                                "b. Farklı sıvıların viskoziteleri sıcaklıkla ilişkilendirilir. \n" +
                                "c. Farklı sıcaklıklarda su, gliserin ve zeytinyağının viskozite deneyleri yaptırılarak elde edilen sonuçların karşılaştırılması sağlanır.";
                        baslik2 = "";
                        icerik2 = "";
                    }
                    if (sinifno == 10)
                    {
                        baslik1 = "Asitlerin ve Bazların Tepkimeleri";
                        icerik1 = "1. Asitler ve bazlar arasındaki tepkimeleri açıklar.\n" +
                                "a. Nötralleşme tepkimeleri, asidin ve bazın mol sayıları üzerinden açıklanır.\n" +
                                "b. Sodyum hidroksit ile sülfürik asidin etkileşiminden sodyum sülfat oluşumu incelenir; asit, baz ve tuz kavramları ilişkilendirilir.\n";
                        baslik2 = "2. Asitlerin ve bazların günlük hayat açısından önemli tepkimelerini açıklar.";
                        icerik2 ="a. Asitlerin ve bazların metallerle etkileşerek hidrojen gazı oluşturması reaksiyonlarına örnekler verilir; aktif metal, yarı soy metal, soy metal ve amfoter metal kavramları üzerinde durulur. \n" +
                                "b. Alüminyum metalinin amfoterlik özelliğini gösteren deney yaptırılır. \n" +
                                "c. Nitrik asit, sülfürik asit ve hidroflorik asidin soy metal ve cam/porselen aşındırma özelliklerine değinilir. Tepkime denklemlerine girilmez. \n" +
                                "ç. Derişik sülfürik asit, fosforik asit ve asetik asidin nem çekme ve çözünürken ısı açığa çıkarma özellikleri nedeniyle yol açtıkları tehlikeler vurgulanır. \n";
                    }
                    if (sinifno == 11)
                    {
                        baslik1 = "";
                        icerik1 = "";
                        baslik2 = "";
                        icerik2 = "";
                    }
                    if (sinifno == 12)
                    {
                        baslik1 = "";
                        icerik1 = "";
                        baslik2 = "";
                        icerik2 = "";
                    }
                }
                if (haftano == 2)
                {
                    baslik = (donem + ". Dönem " + sinifno + ". Sınıf Nisan Ayı " + haftano + ". Hafta").toString();
                    if (sinifno == 9)
                    {
                        baslik1 = "Sıvılar";
                        icerik1 = "3. Kapalı kaplarda gerçekleşen buharlaşma-yoğuşma süreçleri üzerinden denge buhar basıncı kavramını açıklar. \n" +
                                "a. Kaynama olayı dış basınca bağlı olarak açıklanır. \n" +
                                "b. Faz diyagramlarına girilmeden kaynama ile buharlaşma olayının birbirinden farklı olduğu belirtilir. \n" +
                                "c. Saf suyun kaynama noktasının belirlenmesine ilişkin deney yaptırılır.\n" +
                                "4. Doğal olayları açıklamada sıvılar ve özellikleri ile ilgili kavramları kullanır. \n" +
                                "a. Atmosferdeki su buharının varlığının nem kavramıyla ifade edildiği belirtilir. \n" +
                                "b. Meteoroloji haberlerinde verilen gerçek ve hissedilen sıcaklık kavramlarının bağıl nem kavramıyla ifade edildiği belirtilir. Bağıl nem hesaplamalarına girilmez.";
                        baslik2 = "";
                        icerik2 = "";
                    }
                    if (sinifno == 10)
                    {
                        baslik1 = "Hayatımızda Asitler ve Bazlar";
                        icerik1 = "1. Asitlerin ve bazların fayda ve zararlarını açıklar. \n" +
                                "a. Asit yağmurlarının oluşumuna, çevreye ve tarihi eserlere etkilerine değinilir. \n" +
                                "b. Kirecin ve kostiğin yağ, saç ve deriye etkisi deney yapılarak açıklanır. \n" +
                                "c. Öğrencilerin asit ve bazların fayda ve zararları hakkında bilişim teknolojileri kullanarak araştırma yapmaları, elde ettikleri bilgileri kaynak belirterek özetlemeleri ve yazılı olarak sunmaları sağlanır. Bilişim teknolojilerini kullanırken siber güvenlik kurallarına uymanın gerekliliği hatırlatılır\n";
                        baslik2 = "";
                        icerik2 = "";
                    }
                    if (sinifno == 11)
                    {
                        baslik1 = "";
                        icerik1 = "";
                        baslik2 = "";
                        icerik2 = "";
                    }
                    if (sinifno == 12)
                    {
                        baslik1 = "";
                        icerik1 = "";
                        baslik2 = "";
                        icerik2 = "";
                    }
                }
                if (haftano == 3)
                {
                    baslik = (donem + ". Dönem " + sinifno + ". Sınıf Nisan Ayı " + haftano + ". Hafta").toString();
                    if (sinifno == 9)
                    {
                        baslik1 = "Gazlar";
                        icerik1 = "1. Gazların genel özelliklerini açıklar. \n" +
                                "Gaz yasaları ve kinetik-moleküler teoriye girilmez.\n";
                        baslik2 = "";
                        icerik2 = "";
                    }
                    if (sinifno == 10)
                    {
                        baslik1 = "Hayatımızda Asitler ve Bazlar";
                        icerik1 = "2. Asit ve bazlarla çalışırken alınması gereken sağlık ve güvenlik önlemlerini açıklar. \n" +
                                "a. Birbiriyle karıştırılması sakıncalı evsel kimyasallara (çamaşır suyu ile tuz ruhu) örnekler verilir. \n" +
                                "b. Asit ve baz ambalajlarındaki güvenlik uyarılarına dikkat çekilir.\n";
                        baslik2 = "";
                        icerik2 = "";
                    }
                    if (sinifno == 11)
                    {
                        baslik1 = "";
                        icerik1 = "";
                        baslik2 = "";
                        icerik2 = "";
                    }
                    if (sinifno == 12)
                    {
                        baslik1 = "";
                        icerik1 = "";
                        baslik2 = "";
                        icerik2 = "";
                    }
                }
                if (haftano == 4)
                {
                    baslik = (donem + ". Dönem " + sinifno + ". Sınıf Nisan Ayı " + haftano + ". Hafta").toString();
                    if (sinifno == 9)
                    {
                        baslik1 = "Gazlar";
                        icerik1 = "2. Gazların sıcaklık, basınç, hacim ve miktar özelliklerini birimleriyle ifade eder. \n" +
                                "Basınç birimleri olarak atm ve mmHg; hacim birimi olarak litre (L); sıcaklık birimleri olarak Celcius (oC) ve Kelvin (K); miktar birimi olarak da mol verilir. Birim dönüşümlerine ve hesaplamalara girilmez.\n" +
                                "Atatürk zamanında kurulan fabrikalar ve fen kuruluşlarının O’nun fen ve tekniğe dayanan sanayiye verdiği önemin açık bir kanıtı olduğu ve önemi belirtilecek.";
                        baslik2 = "Gazlar (Nisan 5. Hafta)";
                        icerik2 = "3. Saf maddelerin hâl değişim grafiklerini yorumlar. \n" +
                                "a. Hâl değişim grafikleri üzerinden erime-donma, buharlaşma-yoğuşma ve kaynama süreçleri incelenir. \n" +
                                "b. Gizli erime ve buharlaşma ısılarıyla ısınma-soğuma süreçlerine ilişkin hesaplamalara girilmez. \n" +
                                "c. Örnek bir saf maddenin hâl değişim grafiğinin çizdirilmesi ve yorumlanması sağlanır.";
                    }
                    if (sinifno == 10)
                    {
                        baslik1 = "Hayatımızda Asitler ve Bazlar";
                        icerik1 = "c. Aşırı temizlik malzemesi ve lavabo açıcı kullanmanın sağlık, çevre ve tesisat açısından sakıncaları üzerinde durulur. \n" +
                                "ç. Mutfak gereçlerinde oluşan kireçlenmeyi ve metal eşyaların paslarını gidermek için yöntem ve malzeme seçiminde dikkat edilmesi gereken hususlar üzerinde durulur\n";
                        baslik2 = "Tuzlar (Nisan 5. Hafta)";
                        icerik2 = "1. Tuzların özelliklerini ve kullanım alanlarını açıklar. \n" +
                                "Sodyum klorür, sodyum karbonat, sodyum bikarbonat, kalsiyum karbonat ve amonyum klorür tuzları üzerinde durulur.\n";
                    }
                    if (sinifno == 11)
                    {
                        baslik1 = "";
                        icerik1 = "";
                        baslik2 = "";
                        icerik2 = "";
                    }
                    if (sinifno == 12)
                    {
                        baslik1 = "";
                        icerik1 = "";
                        baslik2 = "";
                        icerik2 = "";
                    }
                }
            }
            if (ayno == 4)
            {
                if (haftano == 1)
                {
                    baslik = (donem + ". Dönem " + sinifno + ". Sınıf Mayıs Ayı " + haftano + ". Hafta").toString();
                    if (sinifno == 9)
                    {
                        baslik1 = "Plazma";
                        icerik1 = "1. Plazma hâlini açıklar. \n" +
                                "Sıcak ve soğuk plazma sınıflandırmasına girilmez.";
                        baslik2 = "";
                        icerik2 = "";
                    }
                    if (sinifno == 10)
                    {
                        baslik1 = "Yaygın Günlük Hayat Kimyasalları";
                        icerik1 = "1. Temizlik maddelerinin özelliklerini açıklar. \n" +
                                "a. Yapısal ayrıntılara girmeden sabun ve deterjan aktif maddelerinin kirleri nasıl temizlediği belirtilir. \n" +
                                "b. Kişisel temizlikte kullanılan temizlik maddelerinin (şampuan, diş macunu, katı sabun, sıvı sabun) fayda ve zararları vurgulanır. \n" +
                                "c. Hijyen amacıyla kullanılan temizlik maddeleri (çamaşır suyu, kireç kaymağı) tanıtılır.\n";
                        baslik2 = "";
                        icerik2 = "";
                    }
                    if (sinifno == 11)
                    {
                        baslik1 = "";
                        icerik1 = "";
                        baslik2 = "";
                        icerik2 = "";
                    }
                    if (sinifno == 12)
                    {
                        baslik1 = "";
                        icerik1 = "";
                        baslik2 = "";
                        icerik2 = "";
                    }
                }
                if (haftano == 2)
                {
                    baslik = (donem + ". Dönem " + sinifno + ". Sınıf Mayıs Ayı " + haftano + ". Hafta").toString();
                    if (sinifno == 9)
                    {
                        baslik1 = "DOĞA VE KİMYA 9.5.1. Su ve Hayat";
                        icerik1 = "1. Suyun varlıklar için önemini açıklar. \n" +
                                "Su kaynaklarının ve korunmasının önemi açıklanır.\n" +
                                "Osmanlılar döneminde kullanılması güç olan arşın, dirhem, okka gibi uzunluk ve ağırlık birimleri ile ölçü sistemleri yerine daha kolay kullanılır pratik metrik sistemin, gram ve kilogram ölçülerinin konulmasının Atatürk’ün emirleri ile gerçekleştirildiği açıklanmalı ve bunların önemine değinilmelidir.";
                        baslik2 = "";
                        icerik2 = "";
                    }
                    if (sinifno == 10)
                    {
                        baslik1 = "Yaygın Günlük Hayat Kimyasalları";
                        icerik1 = "2. Yaygın polimerlerin kullanım alanlarına örnekler verir. \n" +
                                "a. Polimerleşme olayı açıklanarak monomer, polimer ve -mer kavramları üzerinde durulur. \n" +
                                "b. Kauçuk, polietilen (PE), polietilen teraftalat (PET), kevlar, polivinil klorür (PVC), politetraflor eten (TEFLON) ve polistirenin (PS) yapısal ayrıntılarına girilmeden başlıca kullanım alanlarına değinilir. \n" +
                                "c. Polimerlerin farklı alanlarda kullanımlarına ilişkin olumlu ve olumsuz özellikleri vurgulanır. \n" +
                                "ç. İçerisinde polimer malzeme kullanılan oyuncak ve tekstil ürünlerinin zararlarına değinilir.\n";
                        baslik2 = "";
                        icerik2 = "";
                    }
                    if (sinifno == 11)
                    {
                        baslik1 = "";
                        icerik1 = "";
                        baslik2 = "";
                        icerik2 = "";
                    }
                    if (sinifno == 12)
                    {
                        baslik1 = "";
                        icerik1 = "";
                        baslik2 = "";
                        icerik2 = "";
                    }
                }
                if (haftano == 3)
                {
                    baslik = (donem + ". Dönem " + sinifno + ". Sınıf Mayıs Ayı " + haftano + ". Hafta").toString();
                    if (sinifno == 9)
                    {
                        baslik1 = "Su ve Hayat";
                        icerik1 = "2. Su tasarrufuna ve su kaynaklarının korunmasına yönelik çözüm önerileri geliştirir. \n" +
                                "Suyu tasarruflu kullanmanın her vatandaşın ülkesine ve dünyaya karşı sorumluluğu/görevi olduğu vurgulanır.";
                        baslik2 = "";
                        icerik2 = "";
                    }
                    if (sinifno == 10)
                    {
                        baslik1 = "Yaygın Günlük Hayat Kimyasalları";
                        icerik1 = "3. Polimer, kâğıt, cam ve metal malzemelerin geri dönüşümünün ülke ekonomisine katkısını açıklar. 10.4.1.4. Kozmetik malzemelerin içerebileceği zararlı kimyasalları açıklar. \n" +
                                "Kişisel bakım ve estetik amacıyla kullanılan parfüm, saç boyası, kalıcı dövme boyası ve jöle üzerinde durulur.\n";
                        baslik2 = "";
                        icerik2 = "";
                    }
                    if (sinifno == 11)
                    {
                        baslik1 = "";
                        icerik1 = "";
                        baslik2 = "";
                        icerik2 = "";
                    }
                    if (sinifno == 12)
                    {
                        baslik1 = "";
                        icerik1 = "";
                        baslik2 = "";
                        icerik2 = "";
                    }
                }
                if (haftano == 4)
                {
                    baslik = (donem + ". Dönem " + sinifno + ". Sınıf Mayıs Ayı " + haftano + ". Hafta").toString();
                    if (sinifno == 9)
                    {
                        baslik1 = "Su ve Hayat";
                        icerik1 = "3. Suyun sertlik ve yumuşaklık özelliklerini açıklar.\n" +
                                "Atatürk’ün bilim ve fende, fen’in uygulaması olan tekniğe ne kadar önem verdiğini ifade eden Bursa nutuklarındaki ‘’ Hakiki rehberimiz ilim ve fen olacaktır.’’ şeklindeki sözleri üzerinde durulacaktır.";
                        baslik2 = "";
                        icerik2 = "";
                    }
                    if (sinifno == 10)
                    {
                        baslik1 = "Yaygın Günlük Hayat Kimyasalları";
                        icerik1 = "5. İlaçların farklı formlarda kullanılmasının nedenlerini açıklar. \n" +
                                "a. Piyasadaki ilaç formlarının (hap, şurup, iğne, merhem) temel özelliklerine değinilir. \n" +
                                "b. Yanlış ve gereksiz ilaç kullanımının insan sağlığına, ülke ekonomisine ve çevreye verdiği zararlar vurgulanır.\n";
                        baslik2 = "";
                        icerik2 = "";
                    }
                    if (sinifno == 11)
                    {
                        baslik1 = "";
                        icerik1 = "";
                        baslik2 = "";
                        icerik2 = "";
                    }
                    if (sinifno == 12)
                    {
                        baslik1 = "";
                        icerik1 = "";
                        baslik2 = "";
                        icerik2 = "";
                    }
                }
            }
            if (ayno == 5)
            {
                if (haftano == 1)
                {
                    baslik = (donem + ". Dönem " + sinifno + ". Sınıf Haziran Ayı " + haftano + ". Hafta").toString();
                    if (sinifno == 9)
                    {
                        baslik1 = "Çevre Kimyası";
                        icerik1 = "1. Hava, toprak ve su kirliliğinin sebeplerini açıklar. \n" +
                                "a. Hava kirleticiler olarak azot oksitler, karbon dioksit ve kükürt oksitleri üzerinde durulur. \n" +
                                "b. Sera etkisi ve ozon tabakasının incelmesi konusu işlenirken bilişim teknolojilerinden (animasyon, simülasyon, video vb.) yararlanılır. \n" +
                                "c. Su ve toprak kirleticiler olarak plastikler, deterjanlar, organik sıvılar, ağır metaller, piller ve endüstriyel atıklar üzerinde durulur.";
                        baslik2 = "";
                        icerik2 = "";
                    }
                    if (sinifno == 10)
                    {
                        baslik1 = "Gıdalar";
                        icerik1 = "1. Hazır gıdaları seçerken ve tüketirken dikkat edilmesi gereken hususları açıklar. \n" +
                                "a. Hazır gıdaların doğal gıdalardan başlıca farklarına (koruyucular, renklendiriciler, emülsiyonlaştırıcılar, tatlandırıcılar, pastörizasyon, UHT sütün işlenmesi) değinilir. \n" +
                                "b. Hazır gıda etiketlerindeki üretim ve son kullanım tarihlerinin önemi vurgulanır. \n" +
                                "c. Yapay tatlandırıcıların kullanılmasının sağlık üzerindeki etkilerine değinilir. \n" +
                                "ç. Günlük tüketim maddelerindeki katkı maddesi içeriği ve katkı maddesi kodlarına ilişkin okuma verilir.\n";
                        baslik2 = "";
                        icerik2 = "";
                    }
                    if (sinifno == 11)
                    {
                        baslik1 = "";
                        icerik1 = "";
                        baslik2 = "";
                        icerik2 = "";
                    }
                    if (sinifno == 12)
                    {
                        baslik1 = "";
                        icerik1 = "";
                        baslik2 = "";
                        icerik2 = "";
                    }
                }
                if (haftano == 2)
                {
                    baslik = (donem + ". Dönem " + sinifno + ". Sınıf Haziran Ayı " + haftano + ". Hafta").toString();
                    if (sinifno == 9)
                    {
                        baslik1 = "Çevre Kimyası";
                        icerik1 = "2. Çevreye zararlı maddelerin etkilerinin azaltılması konusunda çözüm önerilerinde bulunur. \n" +
                                "a. Atmosferin, canlılar için taşıdığı hayati önem vurgulanarak tüketim maddelerini seçerken ve kullanırken canlılara ve çevreye karşı duyarlı olmanın gerekliliği vurgulanır.\n" +
                                "b. Öğrencilerin kimyasal maddelerin çevreye zararlarının azaltılması konusunda yapılan araştırmalar, çalışmalar ve sonuçları hakkında bilişim teknolojiler ini kullanarak bilgi toplamaları ve sınıfta paylaşmaları sağlanır. Literatür araştırmalarında elde edilen bilgi ve bilgi kaynaklarının geçerliliği ve güvenilirliğinin sorgulanmasının gerekliliği hatırlatılır.";
                        baslik2 = "";
                        icerik2 = "c. Çevre temizliği konusunda farkındalık oluşturmak amacıyla öğrencilerin, grup arkadaşlarıyla birlikte kampanya veya etkinlik önerileri geliştirmeleri sağlanır. Görev dağılımı yapmanın ve herkesin üzerine düşen sorumluluğu yerine getirmesinin grup çalışmalarının başarıya ulaşmasındaki önemi hatırlatılır.";
                    }
                    if (sinifno == 10)
                    {
                        baslik1 = "Gıdalar";
                        icerik1 = "2. Yenilebilir yağ türlerini sınıflandırır. \n" +
                                "a. Yağ türlerinden katı (tereyağı, margarin) ve sıvı (zeytin yağı, ayçiçek yağı, mısır özü yağı, fındık yağı) yağlara değinilir. \n" +
                                "b. Yağ endüstrisinde kullanılan sızma, rafine, riviera ve vinterize kavramları açıklanır. \n" +
                                "c. Yenilebilir yağların yanlış kullanımının sağlık üzerindeki etkileri vurgulanır.";
                        baslik2 = "";
                        icerik2 = "";
                    }
                    if (sinifno == 11)
                    {
                        baslik1 = "";
                        icerik1 = "";
                        baslik2 = "";
                        icerik2 = "";
                    }
                    if (sinifno == 12)
                    {
                        baslik1 = "";
                        icerik1 = "";
                        baslik2 = "";
                        icerik2 = "";
                    }
                }
                if (haftano == 3)
                {
                    baslik = (donem + ". Dönem " + sinifno + ". Sınıf Haziran Ayı " + haftano + ". Hafta").toString();
                    if (sinifno == 9)
                    {
                        baslik1 = "";
                        icerik1 = "";
                        baslik2 = "";
                        icerik2 = "";
                    }
                    if (sinifno == 10)
                    {
                        baslik1 = "";
                        icerik1 = "";
                        baslik2 = "";
                        icerik2 = "";
                    }
                    if (sinifno == 11)
                    {
                        baslik1 = "";
                        icerik1 = "";
                        baslik2 = "";
                        icerik2 = "";
                    }
                    if (sinifno == 12)
                    {
                        baslik1 = "";
                        icerik1 = "";
                        baslik2 = "";
                        icerik2 = "";
                    }
                }
                if (haftano == 4)
                {
                    baslik = (donem + ". Dönem " + sinifno + ". Sınıf Haziran Ayı " + haftano + ". Hafta").toString();
                    if (sinifno == 9)
                    {
                        baslik1 = "";
                        icerik1 = "";
                        baslik2 = "";
                        icerik2 = "";
                    }
                    if (sinifno == 10)
                    {
                        baslik1 = "";
                        icerik1 = "";
                        baslik2 = "";
                        icerik2 = "";
                    }
                    if (sinifno == 11)
                    {
                        baslik1 = "";
                        icerik1 = "";
                        baslik2 = "";
                        icerik2 = "";
                    }
                    if (sinifno == 12)
                    {
                        baslik1 = "";
                        icerik1 = "";
                        baslik2 = "";
                        icerik2 = "";
                    }
                }
            }
        }
        TextView tv = (TextView) findViewById(R.id.textView6);
        TextView tv1 = (TextView) findViewById(R.id.textView7);
        TextView tv2 = (TextView) findViewById(R.id.textView8);
        TextView tv3 = (TextView) findViewById(R.id.textView9);
        TextView tv4 = (TextView) findViewById(R.id.textView10);

        tv.setText(baslik);
        tv1.setText(baslik1);
        tv2.setText(icerik1);
        tv3.setText(baslik2);
        tv4.setText(icerik2);
    }
}