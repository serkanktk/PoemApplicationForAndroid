package com.example.poemapplication;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Poem implements Serializable {
    private String poem;
    private String poemName;
    private String poet;

    public String getPoemName() {
        return poemName;
    }

    private int img;

    public void setPoemName(String poemName) {
        this.poemName = poemName;
    }

    public Poem(String poem, String poemName, String poet, int img) {
        this.poem = poem;
        this.poemName = poemName;
        this.poet = poet;
        this.img = img;
    }

    public void setPoem(String poem) {
        this.poem = poem;
    }

    public void setPoet(String poet) {
        this.poet = poet;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getPoem() {
        return poem;
    }

    public String getPoet() {
        return poet;
    }

    public int getImg() {
        return img;
    }


    public static List<Poem> getAllPoems(){
        List<Poem> poemArrayList = new ArrayList<>();


        Poem poem = new Poem("Beni hor görme gardaşım\nSen altınsın ben tunç muyum?\nAynı vardan var olmuşuz\nSen gümüşsün ben sac mıyım?\n\nNe varsa sende bende,\nAynı varlık her bedende\nYarın mezera girende,\nSen toksun da ben aç mıyım?\n\nKimi molla kimi derviş\nAllah bize neler vermiş\nKimi arı çiçek dermiş\nSen balsın da ben cec mıyım\n\nTopraktandır cümle beden\nNefsini öldür ölmeden\nBöyle emretmiş yaradan\nSen kalemsin ben uç muyum?\n\nTabiata Veysel aşık\nTopraktan geldik gardaşık\nAynı yolcuyuz yoldaşık\nSen yolcusun ben bac mıyım?", "Topraktan Geldik Gardaşık", "Aşık Veysel", R.drawable.asikveysel);
        poemArrayList.add(poem);

        poem = new Poem("Öyle günler gördüm ki, aydın gökler kararıp\nBahtım bir bulut gibi üstüme çöker oldu,\nHer gözümü yumunca tanıdık yüzler görüp,\nHayaller alev alev beynimi yakar oldu.\nÜmitsizlik, gariplik dört tarafımı sarıp\nYüzüm sırıtsa bile, içim yaş döker oldu.\n\nHer sabah ilk ışıklar gözlerimi oyardı,\nUyanan taş duvarlar iniltimi duyardı.\n\nÖyle günler gördüm ki, duvarlar gelir dile,\nGözümde canlanırdı eşkiya masalları.\nVarlığımı sarardı, hain bir isteyişle\nGörmediğim yumuşak bir düşmanın elleri\nKafada çelik gibi fikirler dursa bile\nKalplerin eksik olmaz böyle zayıf halleri.\n\nBazen kendi kendimin elinden kurtulurdum,\nKalbimi bir çamurda çırpınırken bulurdum.\n\nÖyle günler gördüm ki, dost dediğim insanlar\nBen yanına varınca dudağını kıvırdı.\nBir zamanlar yanımda ağız açmayanlar\nSırtımı sıvazladı, bana öğüt savurdu.\nSilahsız gördüğüne saldıran kahramanlar\nEn alçak tekmelerle beni yere devirdi.\n\nRuhum bir heykel gibi düşüp parçalanırdı.\nBu sesleri duyanlar gülüyorum sanırdı.\n\nÖyle günler gördüm ki, tabanca sakağımda\nTasarladım aydınlık dünyayı bırakmayı\nGönlüm acıklı buldu, en ateşli çağımda\nSönük bir yıldız gibi boşluklara akmayı\nTabancanın namlusu ısındı yanağımda,\nParmağım istemedi tetiğini çekmeyi\n\nBir sonbahar yağmuru gibi içim ağlardı\nBir şeyler fakat beni yaşamağa bağlardı.\n\nEy bir tane sevgilim, ben bugün yaşıyorsam\nSanma ki hayat tatlı, insanlar hoş olmuştur,\nDağ başında bir kaya gibiyim şöyle dursam\nEtrafım eskisinden daha bomboş olmuştur\nYalnız sana borçluyum bugün dünyada varsam,\nSeni her andığımda gözlerim yaş olmuştur\n\nYaşlar ki bir ırmaktır, dertleri sürür gider,\nGözyaşları içinde seneler yürür gider.\n\nYok olmak isteğiyle kalbim attığı zaman,\nBana: Yaşa der gibi gülen senin yüzündü.\nDizlerim bir batakta yorgun yattığı zaman\nBacaklarıma kuvvet veren senin hızındı.\nYaşaran gözlerimde, güneş battığı zaman\nSıcak bir yuva gibi tüten senin dizindi.\n\nSen aklıma gelince her şey gülümserdi.\nAğaçlar şarkı söyler, rüzgar tatlı eserdi.\n\nEy sevgilim, bilirsin benim ne çektiğimi,\nGarip başımın derdi bir yürek taşıyorum.\nAnlarsın niçin uzak yerlere baktığımı,\nİçinde yaşanmaz bir dünyada yaşıyorum.\nGörünce gülme sakın çırpınıp aktığımı,\nIlık ve aydınlık bir denize koşuyorum.\n\nSen benim sevgilimsin, sevsen de, sevmesen de,\nAradığım yerlere benzeyiş buldum sende.\n", "Öyle Günler Gördüm ki", "Sabahattin Ali", R.drawable.sabahattinali);
        poemArrayList.add(poem);
        poem = new Poem("Bir çıkmaza girdi bugün yolumuz\nGeçit vermez sağımızla solumuz\nKalır gayrı bizim burda ölümüz\nMert ağlasın namert olan utansın", "Namert olan Utansın", "Dadaloğlu", R.drawable.dadaloglu);
        poemArrayList.add(poem);
        poem = new Poem("Cennedinde duramadım\nBen bu aşka doyamadım\nGül kokundan kopamadım\nGel geri dön Cennedim\n\nSıradı geçtim cehennemdeyim\nNar bahçelerinde gezmekteyim\nSensiz dünyayı ben neyleyim\nGel geri dön Cennedim\n\nAşkınla adaşlardayım\nVarın Cennedime söyleyin\nHer cefasına razıyım\nGel geri dön Cennedim.", "Gel Geri Dön Cennedim", "Aşık Serkan", R.drawable.serkanhaci1);
        poemArrayList.add(poem);
        poem = new Poem("İlim ilim bilmektir\nİlim kendin bilmektir\nSen kendin bilmezsin\nYa nice okumaktır\n\nOkudum bildim deme\nÇok taat kıldım deme\nEğer Hak bilmez isen\nAbes yere gelmektir\n\nDört kitabın mânâsı\nBellidir bir elifte\nSen elifi bilmezsin\nBu nice okumaktır\n\nYunus Emre der hoca\nGerekse bin var hacca\nHepisinden iyice\nBir gönüle girmektir", "Yunus Emre", "İlim İlim Bilmektir", R.drawable.yunusemre);
        poemArrayList.add(poem);
        poem = new Poem("Allah der ki \"Kimi benden çok seversen onu senden alırım\"\nVe ekler; \"Onsuz yaşayamam deme, seni onsuz da yaşatırım.\"\n\nVe mevsim geçer, gölge veren ağarçların dalları kurur, sabır taşar.\nCanından saydığın yar bile bir gün el olur, aklın şaşar.\n\nDostun düşmana dönüşür, düşman kalkar dost olur.\nÖyle garip bir dünya.\n\nOlmaz ne dediğin ne varsa hepsi olur...\n\"Düşmem\" dersin düşersin, \"Şaşmam\" dersin şaşarsın.\nEn garibi de budur ya,\n\"Öldüm\" der durur, yine de yaşarsın.", "Allah der ki", "Mevlana", R.drawable.mevlana);
        poemArrayList.add(poem);
        poem = new Poem("Ya İslam'la büyürsün\nYa inkarla çürürsün\nYol mezarda bitmiyor\nGittiğinde görürsün", "Yol Mezarda Bitmiyor", "Necip Fazıl Kısakürek", R.drawable.necipfazilkisakurek);
        poemArrayList.add(poem);
        poem = new Poem("Yalan dünya işte senden\nAha geldim gidiyorum\nKalanlara selam benden\nAha geldim gidiyorum\n\nVar mı sana gelip kalan\nBaştan başa murad alan\nVarın yoğun hepsi yalan\nAha geldim gidiyorum\n\nDereyi aş tepeyi aş\nSonu yoktur dolaş dolaş\nGünden güne yavaş yavaş\nAha geldim gidiyorum\n\nYalan dünya sana böyle\nKimler konup göçtü söyle\nBen de işte aynen öyle\nAha geldim gidiyorum\n\nGülemedim şöyle bir gün\nSenelerim geçti sürgün\nGönül sevdiğine dargın\nAha geldim gidiyorum\n\nArif der ki bunca yıl ay\nGeldi geçti vay dünya vay\nYaşamaksa yaşadım say\nAha geldim gidiyorum", "Aha Geldim Gidiyorum", "Ozan Arif", R.drawable.ozanarif);
        poemArrayList.add(poem);
        poem = new Poem("Bak, İstiklâl Harbi’nde bu vatanı,\nBaşı başa vere vere kurtardık!\nİnanmazsan git konuştur atanı,\nKara günler göre göre kurtardık!\n\nTürk kadını koştu kazma kürekle,\nMermi çekti kucağında bebekle,\nKara barut derme çatma tüfekle,\nTopa karşı dura dura kurtardık!\n\nPes demedik devletlerin birine,\nNöbet tuttuk subayından erine,\nTop, tüfek, süngü, mermi yerine,\nDeğnek ile vura vura kurtardık!\n\nSırrımızı yad ellere açmadık,\nCandan geçtik bu vatandan geçmedik,\nKurşunlardan süngülerden kaçmadık,\nGöğsümüzü gere gere kurtardık!\n\nYedi iklim dört köşede her yanda,\nKim duymamış Türk’ü ulu cihanda,\nKars’ta, Van’da, Erzurum’da, Afyon’da,\nYüzbin şehit vere vere kurtardık!\n\nAbdülvahap; Türk’ün aslı nereli?\nTarihinde kahramanlık sıralı,\nHedefimiz Akdeniz’dir ileri,\nDüşmanları kıra kıra kurtardık!", "Vatanı Nasıl Kurtardık", "Abdulvahap Kocaman", R.drawable.abdulvahapkocaman);
        poemArrayList.add(poem);
        poem = new Poem("Gurbetten gelmişim, yorgunum hancı\nŞuraya bir yatak ser yavaş yavaş.\nAman karanlığı görmesin gözüm!\nBeyaz perdeleri ger yavaş yavaş.\n\nSıla burcu burcu ille ocağım\nÇoluk çocuk hasretinde kucağım\nSana her şeyimi anlatacağım,\nOtur baş ucuma sor yavaş yavaş.\n\nGüç belâ bir bilet aldım gişeden\nYolculuk başladı Haydarpaşa’dan!\nHancı n’olur elindeki şişeden,\nBirkaç yudum daha, ver yavaş yavaş...\n\nBen o gece, hem ağladım hem içtim,\nİki gün diyardan diyara uçtum\nKayseri yolundan, Niğde’yi geçtim;\nUzaktan göründü Bor yavaş yavaş.\n\nGaribim her taraf bana yabancı,\nDertliyim, çekinme doldur be hancı!\nİlk önce kımıldar hafif bir sancı\nAyrılık sonradan kor yavaş yavaş.\n\nBende bir resmi var yarısı yırtık\nOn yıldır evimin kapısı örtük\nGarip, bir de sarhoş oldu mu artık,\nBütün sırlarını der yavaş yavaş.\n\nİşte hancı ben her zaman böyleyim,\nÖteyi ne sen sor, ne ben söyleyim!\nYollar Nihâi'yi bekler neyleyim,\nŞu bizim hesabı gör yavaş yavaş.", "Hancı", "Bekir Sıtkı Erdoğan", R.drawable.bekirsitkierdogan);
        poemArrayList.add(poem);
        poem = new Poem("Desem ki vakitlerden bir nisan akşamıdır\nRüzgarların en ferahlatıcısı senden esiyor\nSende seyrediyorum denizlerin en mavisini\nOrmanların en kuytusunu sende görmekteyim\nSenden kopardım çiçeklerin en solmazını\nToprakların en bereketlisini sende sürdüm\nSende tattım yemişlerin cümlesini\nDesem ki sen benim için,\nHava kadar lazım,\nEkmek kadar mübarek,\nSu gibi aziz bir şeysin;\nNimettensin, nimettensin.\nDesem ki...\nİnan bana sevgilim inan\nEvimde şenliksin, bahçemde bahar;\nVe soframda en eski şarap.\nBen sende yaşıyorum,\nSen bende hüküm sürmektesin.\nBırak ben söyleyeyim güzelliğini,\nRüzgarla nehirlerle, kuşlarla beraber.\nGünlerden sonra bir gün,\nŞayet sesimi fark edemezsen\nRüzgarların nehirlerin kuşların sesinden,\nBil ki ölmüşüm.\nFakat yine üzülme müsterih ol\nKabirde böceklere ezberletirim güzelliğini\nVe neden sonra\nTekrar duyduğun gün sesimi gök kubbede\nHatırla ki mahşer günüdür\nOrtalığa düşmüşüm seni arıyorum", "Desem ki", "Cahit Sıtkı Tarancı", R.drawable.cahitsitkitranci);
        poemArrayList.add(poem);
        poem = new Poem("Ortalığa düşmüşüm seni arıyorum\nDüşlerim sade sen,\nDemlikte nefesin, bardakta gamzen...\nSızılarım diner, uyur dertlerim,\n Çayı sen demlersen.\nGelirsen çayımı seninle bölüşürüm,\nGelmezsen ömür billah üşürüm...\n", "Benim Şiirlerim Çay Kokar", "Cemal Süreya", R.drawable.cemalsureyya);
        poemArrayList.add(poem);
        poem = new Poem("Dörtnala gelip Uzak Asya'dan\nAkdeniz'e bir kısrak başı gibi uzanan\nbu memleket, bizim.\n\nBilekler kan içinde, dişler kenetli, ayaklar çıplak\nve ipek bir halıya benziyen toprak,\nbu cehennem, bu cennet bizim.\n\nKapansın el kapıları, bir daha açılmasın,\nyok edin insanın insana kulluğunu,\nbu dâvet bizim....\n\nYaşamak bir ağaç gibi tek ve hür\nve bir orman gibi kardeşçesine,\nbu hasret bizim...","Davet", "Nazım Hikmet Ran", R.drawable.nazimhihmetran);
        poemArrayList.add(poem);
        poem = new Poem("Ruhun mu ateş, yoksa o gözler mi alevden?\nBilmem bu yanardağ ne biçim korla tutuştu?\nPervane olan kendini gizler mi hiç alevden?\nSen istedin ondan bu gönül zorla tutuştu.\n\nGün, senden ışık alsa da bir renge bürünse,\nAy, secde edip çehrene, yerlerde sürünse,\nHer şey silinip kayboluyorken nazarımdan,\nYalnız o güzel gözlerinin nuru görünse...", "Geri Gelen Mektup", "Hüseyin Nihal Atsız", R.drawable.huseyinnihalatsiz);
        poemArrayList.add(poem);
        poem = new Poem("Bu gün yollanıyorken bir gurbete yeniden\nBelki bir kişi bile gelmeyecektir bize.\nBir kemiğin ardında saatlerce yol giden\nİtler bile gülecek kimsesizliğimize...","Yolların Sonu", "Hüseyin Nihal Atsız", R.drawable.huseyinnihalatsiz);
        poemArrayList.add(poem);
        poem = new Poem("Tanrı senin hamurunu\nNecasetle yoğurmuş,\nAnan seni sıçar iken\nYanlışlıkla doğurmuş.", "Yanlışlıkla doğurmuş", "Neyzen Tevfik", R.drawable.neyzen);
        poemArrayList.add(poem);
        poem = new Poem("Avşar içinde bir güzel gördüm\nKozan arasında çeker göçünü\nKınalamış ayağını başını\nSırma ile örmüş sümbül saçını\n\nHer sabah her sabah kendini öğer\nAltın saç bağları topuğu döğer\nSade kaşı ile gözleri değer\nAcem ülkesinin tahtla tacını\n\nDadaloğlu'm al yanağın gülünden\nMis kokuyor saçlarının telinden\nİnce belli nazlı yarin elinden\nÜç beş sene bekleyelim Hacın'ı", "Avşar İçinde Bir Güzel", "Dadaloğlu", R.drawable.dadaloglu);
        poemArrayList.add(poem);


        return poemArrayList;
    }
}
