package com.example.himbaza;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class SampleData {

    public static List<Cantique> getSampleCantique() {
        Cantique[] cantiqueArray = {

                new Cantique(1, "Holy Is the Lord”/ “Wera ni Umwami", "1. Tudugij’ibiganza\n" +
                        "(K’u) munezero wiw'ar'inkomezi\n" +
                        "Twunamye tumuhimbaze\n" +
                        "Ahambaye Aratangaje\n" +
                        "Bridge\n" +
                        "-----------\n" +
                        "Tuvuge tuti:\n" +
                        " R/ Wera n'Umwami Mana Iganje\n" +
                        "Isi yuzuy'Ubgiza Bgiwe (X2)\n" +
                        "Bridge\n" +
                        "Ubgiza Bgiwe Buraserutse\n" +
                        "Tuvyamamaza mu ndirimbo",
                        "Chris Tomlin, Louie Giglio"),
                new Cantique(2, "  Let God Arise/Arahagurutse", "1. Mu gutontoma kwayo kwera\n" +
                        "Amazi atane imbere yacu\n" +
                        "Ehe rab’ivyo yadukoreye\n" +
                        "Bgir’isi ivy’urukundo Rwayo\n" +
                        "Pre-chorus\n" +
                        "Mana Yacu n’Iman’ikiza (X2)\n" +
                        " R/ Uhoraho\n" +
                        "Arahagurutse\n" +
                        "Araganj’ibihe vyose(X2)\n" +
                        "2. Abansi Bayo bazohunga\n" +
                        "Ishengero rishikame\n" +
                        "Niw’ atang’ ubuzima\n" +
                        "Urupfu nta jambo rufise",
                        "Chris Tomlin, Ed Cash, Jesse Reeves"),
                new Cantique(3, "Unchanging/Ntuhinduka", "1) Ubwizigirwa Bgawe\n" +
                        "N'ubg'agahebuza\n" +
                        "Ntuhinduka\n" +
                        "Kandi ntunanirwa\n" +
                        "Amasezeran’utanga\n" +
                        "Niyo aray’ukuri\n" +
                        "Ntuhinduka\n" +
                        "Kandi ntunanirwa\n" +
                        " R/ Tudugij’ibiganza\n" +
                        "Guhimbaz’Uwera\n" +
                        "Yamyeh’ Ariho kand’Aje\n" +
                        "2) Urukundo n’Ubuntu\n" +
                        "Vyawe Biragutse\n" +
                        "Ntuhinduka\n" +
                        "Kandi ntunanirwa (X2)\n" +
                        "Bridge\n" +
                        "Yamyeho\n" +
                        "Ariho\n" +
                        "Azokwamaho",
                        "Chris Tomlin"),
                new Cantique(4, "Glory in The Highest/ Ahasumb’amajuru  ", "1. We wamyeho\n" +
                        "Uri intango\n" +
                        "N’iherezo\n" +
                        "Mwami Ntuhinduka\n" +
                        "Zina rirasira bose\n" +
                        "Amajuru avug’Izina Ryawe\n" +
                        "Uhambaye Uhoraho\n" +
                        "Ub'ahasumb'amajuru\n" +
                        "Uhambay'Uhoraho\n" +
                        "2. Hirya yawe\n" +
                        "Ntayindi Mana\n" +
                        "Muco w’isi\n" +
                        "Inyenyeri ic'ibibatsi\n" +
                        "Izina rizohishurwa\n" +
                        "Niwe Gusa\n" +
                        "We Bgiza Bganje\n" +
                        "Uhambaye Uhoraho\n" +
                        "Uba ahasumba amajuru\n" +
                        "Uhambaye Uhoraho\n" +
                        " R/ Ntawundi ahwanye nawe\n" +
                        "We Mwami\n" +
                        "Isi yose hamwe yature\n" +
                        "Uhambaye Uhoraho\n" +
                        "Ub'ahasumb'amajuru\n" +
                        "Uhambay'Uhoraho\n" +
                        "We Mwami",
                        "Chris Tomlin"),
                new Cantique(5, "Uncreated One/ Uwutaremwe", "1. Ur’Uwera Utaremwe\n" +
                        "Amajuru araguhishura\n" +
                        "Ubwiza bwawe bugagaragarira\n" +
                        "Mumbabazi ziwe\n" +
                        "2. Wewe utaremwe nushimwe\n" +
                        " Wavuye mw’ijuru uza kw’isi\n" +
                        "Wiyambuy’Icubahiro\n" +
                        "Wambar’ububi bgacu\n" +
                        " R/ Mana Nkuru,\n" +
                        " Shirwa Hejuru\n" +
                        " Dutanz’ubugingo\n" +
                        " Ng’ushirwe hejuru\n" +
                        " Mana Nkuru,\n" +
                        " Shirwa Hejuru\n" +
                        " Ntawuhwanye\n" +
                        " Nawe\n" +
                        "3. Mwana w’Imana, Mukiza\n" +
                        "Uwuganje yazutse\n" +
                        "Umuzigamyi w’Ibiriho\n" +
                        "Mubushobozi bg’Ijambo\n" +
                        "R/….\n" +
                        "4. Nitwakubona mu nyonga\n" +
                        "Tuzonyurwa bishitse\n" +
                        "Tuzokwunamira n’imitima ishima\n" +
                        "Kuri Ndiho Ahambaye",
                        "Chris Tomlin, J.D walt"),
                new Cantique(6, "You are God alone/ Ni we Mana wenyene ", "1) We nturi Imana yakozwe\n" +
                        "Namaboko yabantu\n" +
                        "We nturi Imana ikenera\n" +
                        "Umwana wumuntu\n" +
                        "We nturi Imana ikeneye\n" +
                        "Ivyo twoyiha\n" +
                        "Vyose biriho\n" +
                        "Kubw’umugambi wawe (2x)\n" +
                        "R/\n" +
                        "Ni we Mana wenyene\n" +
                        "Kuntango yibihe\n" +
                        "We waruganje\n" +
                        "Niwe Mana wenyene\n" +
                        "Na nubu, mu vyiza mu bibi\n" +
                        "We uranganje\n" +
                        "Niwe mana wenyene (2X)\n" +
                        "2) Uri Imana yubushobozi\n" +
                        "Ntawoguhangara\n" +
                        "Uri Imana izina ryawe\n" +
                        "Rizoshimwa ibihe vyose\n" +
                        "Wewe uri Imana ibereye\n" +
                        "Kwakira ivyacu vyose\n" +
                        "Uri Imana\n" +
                        "Ibihe vyose (1x)\n" +
                        "Bridge\n" +
                        "Ntuhinduka\n" +
                        "Ntunyiganyizwa\n" +
                        "Ntuhagarikwa\n" +
                        "Uko nik’uri (2X)",
                        "Phillips Craig and Dean"),
                new Cantique(7, "You Do All Things Well / Ubikora neza", "1. Waremye imisozi\n" +
                        "Uganza inzuzi\n" +
                        "Kukubona\n" +
                        "Birampimbara\n" +
                        "Ugutazira nyakuri\n" +
                        "Kwuzura mwisi\n" +
                        " R/ Waremeshej’Ijambo\n" +
                        "Uti “Habeho”\n" +
                        "Bibaho\n" +
                        "Nkuko\n" +
                        "Tubibona.\n" +
                        "Ijwi ryawe, n’iBikorwa vyawe\n" +
                        "Vyose ni vyiza\n" +
                        "2. Waremye inyenyeri\n" +
                        "Utegeka imiyaga\n" +
                        "Ubwiza bwawe\n" +
                        "Bukayangana\n" +
                        "Umuco uva mwijuru\n" +
                        "Urasira iyi si\n" +
                        "Bridge\n" +
                        "Ivyiyumviro vyawe vyagutse\n" +
                        "Bihumek’ubuzima\n" +
                        "Mu vyaremwe\n" +
                        " Vyose na hose",
                        "Chris Tomlin, Jesse Reeves, Michael John Clement"),
                new Cantique(8, "Your Grace abounds to me/ Ubuntu bwawe buragwiriye ", "1) Wahevye icubahiro\n" +
                        "Uraza\n" +
                        "Muri iyi si\n" +
                        "Utanga ubuzima bwawe\n" +
                        "Uriha umwenda\n" +
                        "Kubwanje\n" +
                        "R/\n" +
                        "Ubuntu bwawe\n" +
                        "Buragwiye kuuri je\n" +
                        "Yesu, uri vyose nkeneye\n" +
                        "2) Ngabire ntakwiriye\n" +
                        "Wambambiwe\n" +
                        "Ntabereye\n" +
                        "Nshobojwe nubuntu\n" +
                        "Bwawe nzobaho\n" +
                        "Kubwa kristo\n" +
                        "Bridge\n" +
                        "Nyene inkomezi\n" +
                        "Nyene ubwiza\n" +
                        "Nta rindi zina nki rya Yesu\n" +
                        "Nyene inkomezi\n" +
                        "Nyene ubwiza\n" +
                        "Nta zina nkiryawe",
                        "Ben Fielding, Dean Ussher"),
                new Cantique(9, "Elohim/ Elohim", "1. Mpagaze ku Rutare rw’\n" +
                        "Ukwizera muri Kristo\n" +
                        "Kwizigira kuzima\n" +
                        "Ntikuzokurwaho n’ibibazo\n" +
                        "Ndizezwa kw’amasezerano yiwe aray’ukuri\n" +
                        "Azokwama ar’umwizigirwa\n" +
                        " R/ Irihangana\n" +
                        "Igira neza\n" +
                        "Ntabgo yifuza\n" +
                        "Nk’ivyo twirata\n" +
                        "Inzira zayo zirut’izanje, Ivyo yiyumvira ntawobimenya\n" +
                        "Sinkekeranya namba\n" +
                        "Imana ni Rukundo\n" +
                        "2. Duhem’umuyaga uvamu\n" +
                        "Mw’ijuru yaremye\n" +
                        "Ndazi ko nzama nizeye\n" +
                        "Ubuzima bganje bgose\n" +
                        "Ntasiba guhamagara abana murugo\n" +
                        "Urukundo ruba mu runganwe rwose\n" +
                        "Bridge\n" +
                        "N’Imana ihambaye, Elohim\n" +
                        "N’umuremyi w’isi.\n" +
                        "N’Umwami w’ingabo, nuw’ijuru\n" +
                        "Abariho ubarush’agaciro,\n" +
                        "N’ubgami Bgawe burut’inganji\n" +
                        "zose, Urukundo rukayaNganira bose nk’izuba",
                        "Hillsong Worship"),
                new Cantique(10, "His Name shall / Azokwitwa", "1. Iyo ndirimbo y’abamarayika\n" +
                        "Umv’uko iryoheye ugutwi\n" +
                        "Umuco n'umudihow' ijuru\n" +
                        "Imbabazi zitujeko\n" +
                        "Baririmba bati: “Icubahiro\n" +
                        "kibe ahasumba amajuru”\n" +
                        "N’amahoro abe kw'isi yose\n" +
                        "2. Yaje kutwerek' urukundo rwa Data\n" +
                        "Kugira neza n' ubuntu\n" +
                        "Kugaragaz’ ugukayangana kwiwe\n" +
                        "N' ubwiza bw’inyonga ziwe\n" +
                        "Baririmba bati: “Icubahiro\n" +
                        "kibe ahasumba amajuru”\n" +
                        "N’amahoro abe kw'isi yose\n" +
                        " R/ Azokwitwa\n" +
                        "Gitangaza,\n" +
                        "Umujanama,\n" +
                        "Nyen'ubushobozi,\n" +
                        "Data uhoraho, Mwami w' amahoro,\n" +
                        "Ibihe bidashira\n" +
                        "Ooh, Uko niko azokwitwa\n" +
                        "3. Yaje guhaguruts’abaremerewe\n" +
                        "No kubaha akaruhuko\n" +
                        "Kudutur'imitwaro yacu\n" +
                        "Aduh'ingabire y'agaciro\n" +
                        "Baririmba bati: “Icubahiro\n" +
                        "kibe ahasumba amajuru”\n" +
                        "N’amahoro abe kw'isi yose\n" +
                        "Bridge\n" +
                        "Izina rimwe hejuru y'ayandi\n" +
                        "Zina ryaje kudukiza\n" +
                        "Ririmba,\n" +
                        "Izina ryiwe ni\n" +
                        "Izina ryiwe ni Yesu",
                        "Jonas Myrin, Matt Redman"),
                new Cantique(11, "Meekness and Majesty/ Aganje aca bugufi", "Igitero ca 1\n" +
                        "Aganje aca bugufi, umuntu kandi Imana\n" +
                        "Mukunywana gushitse, Mana yigize umuntu\n" +
                        "Mwami w’ibihe bidashira, wabanye n’abantu\n" +
                        "Yapfukamy’aca bugufi, atwoz’ibirenge\n" +
                        "Chorus\n" +
                        "Mbega ikinyegezwa, aganje aca bugufi\n" +
                        "Mupfukamire n’Imana Yawe\n" +
                        "Niyo Mana yawe\n" +
                        "Igitero ca 2\n" +
                        "Shusho ya Data yuzuye, itagira agasembga\n" +
                        "Ariko arumvira ashitsa ku rupfu\n" +
                        "Yababajwe ngo tube bazima\n" +
                        "Anesha mu kwitanga\n" +
                        "Asabir’abamubamba ngo Data abaharire\n" +
                        "Igitero ca 3\n" +
                        "Ubgenge atawoserangura, Imana itaboneka\n" +
                        "Rukundo rutamenwa, rwihishuye rwiyoroheje\n" +
                        "Umwami ahorahoyaciye bugufi\n" +
                        "Ng’ashikan’ abantu mu bgiza bgawe",
                        "Graham Kendrick"),
                new Cantique(12, "To the King eternal/ K’Umwami ahoraho Graham K", "Igitero ca 1\n" +
                        "K’Umwami adashira\n" +
                        "Adapfa Ataboneka\n" +
                        "Ntayindi Mana (X2)\n" +
                        "R/Bgiza n’Icubahiro ibihe n’ibihe (X2)\n" +
                        "Igitero ca 2\n" +
                        "K’Umwami Muremyi\n" +
                        "W’abera n’abamarayika\n" +
                        "Aganje Vyose\n" +
                        "Ahamagar’amahanga\n" +
                        "Kwegera ameza Yayo\n" +
                        "Ashoboye vyose\n" +
                        " R/ Bgiza n’Icubahiro ibihe n’ibihe\n" +
                        "Bridge\n" +
                        "a. Kuri WE, Uriho, wamyeho kandi Uje\n" +
                        "Ntango n’iherezo kandi azokwamaho\n" +
                        "Rek’ isi yose n’amoko yos’aririmbe\n" +
                        "Ibihumeka vyose biduz’ishimwe\n" +
                        "b. Kuri w’uriho, wamyeho kandi Uje\n" +
                        "Ntango n’iherezo kandi azokwamaho\n" +
                        "Bgiza! Ibihe Vyose!\n" +
                        "Nganji! Ibihe Vyose! Amen! (X2)\n" +
                        "R/Bgiza n’Icubahiro ibihe n’ibihe (X2)",
                        "Graham Kendrick"),
                new Cantique(13, " The Earth shakes / Isi iranyiganyiga", " R/ Is’inyigazwa n’Ijwi Ryayo\n" +
                        "N’amahanga amujugumirira\n" +
                        "Ibigirwamana vyikubita\n" +
                        "Kubirenge vy’Umwami Imana\n" +
                        "Kubirenge vy’Imana yacu\n" +
                        "1. Umwami n’intwari nta bgoba afise\n" +
                        "N’umunyabushobozi mu nrwano\n" +
                        "Ingabo ziwe ziruta abansi biwe\n" +
                        "Akaruru kavuze ibisika vya Satani birabomoka\n" +
                        "Babuloni irakomvomvotse yose\n" +
                        "2. Umwami n’umukiza yuzuy’ubuntu\n" +
                        "Kand’arafis’imbabazi\n" +
                        "Ingabo ziwe n’umuryango wiwe\n" +
                        "Akaruru kavuze ibisika vya Satani birabomoka\n" +
                        "Babuloni irakomvomvotse yose\n" +
                        "3. Mubgami bgiwe, Yesu niwe Mwami\n" +
                        "Niwe aganjey’ ibihe vyose\n" +
                        "Yaduhaye ububasha n’ubushobozi\n" +
                        "Akaruru kavuze ibisika vya Satani birabomoka\n" +
                        "Babuloni irakomvomvotse (X3) yose",
                        " Don Moen"),
                new Cantique(14, "Unstoppable God / Imana idatangirwa", "1. Ijuru rivuga\n" +
                        "Isi irabaho\n" +
                        "Ubuzima butangurira\n" +
                        "Mw’ivu wabumvye\n" +
                        "Kukwizera wewe\n" +
                        "Gukur’imisozi\n" +
                        "Vyizigiro muri wewe\n" +
                        "Bihind’ubgoba\n" +
                        " R/ Man’idatangirwa\n" +
                        "Ubgiza bgawe ni buboneke\n" +
                        "Ibidashoboka\n" +
                        "Mw’izina ryawe birakorwa\n" +
                        "2. Twarons’ukubohoka\n" +
                        "Uc’imigozi\n" +
                        "Icaha gitsindwa aho\n" +
                        "Yesu yanesheje\n" +
                        "Buntu bgagaragaye\n" +
                        "Ku musi wa gatatu\n" +
                        "Umwijima ukurwaho\n" +
                        "Hamwe naca kibuye\n" +
                        "Bridge\n" +
                        "Ntakitagushobokera\n" +
                        "Bgami bgawe ntibutangirwa\n" +
                        "Turirimb’ishimw’ibihe vyose\n" +
                        "Yesu, Mana yacu idatangirwa",
                        "Steven Furtick, Wade Joye, Christopher Joel Brown"),

                new Cantique(15, "God of Wonders /Mana uhebuje-PAUL BALOCHE", "1. Muremyi wa vyose\n" +
                        "W'inzuzi, isi n'ibicu\n" +
                        "Amajuru n'ihema ryawe\n" +
                        "Hashimwe Umwami ari hejuru\n" +
                        " R/ Man'uhebuje ahasumba inyenyeri\n" +
                        "Ur'Uwera, Uwera\n" +
                        "Isi yose ivuga ubukuru bwawe\n" +
                        "Ur'Uwera, Uwera\n" +
                        "Mwami w'Ijuru n'isi\n" +
                        "Kare mu gatondo\n" +
                        "Nzokwigina mu muco\n" +
                        "Ninanyerera mu mwiza\n" +
                        "Mw'ijoro nzoguhamaga\n" +
                        "Haleluya (Ku Mwami w'ijuru n'isi)",
                        "Carey Marcus, Hindalong Steve J"),
                new Cantique(16, ". Indescribable/ Mutagereranywa", "1. Kuva mumajuru n’i bgina mukiyaga\n" +
                        "Ivyaremwe vyerekan’ubukuru bgawe\n" +
                        "Uko imvura n’izuba bibisanya\n" +
                        "Vyose vyigenga mu kukugaragaza\n" +
                        "Ariko bivuga\n" +
                        "R/Ntugereranywa, ntac’ukwirwamwo\n" +
                        "Washiz’inyenyeri kw’ijuru uziz’amazina\n" +
                        "ManaUratangaje!\n" +
                        "Urakomeye kandi ntuneshwa\n" +
                        "Mu kurengerwa dupfukamye duciye bugufi\n" +
                        "Mana Uratangaje!\n" +
                        "2. Ninde yigeze kwerek’inzira inkuba\n" +
                        "Canke akabona aho shelegi ibikwa\n" +
                        "Uwiyumviriy’izuba nk’isoko ry’umuco\n" +
                        "Akanarinyegeza ng’azane akayaga k’ijoro\n" +
                        "Ntawobitahura\n" +
                        "R2/ Ntawusa nawe kandi ntuhinduka\n" +
                        "Umbon’i bgina mumutima ukagum’unkunda\n" +
                        " Mana Uratangaje",
                        "Chris Tomlin "),

                new Cantique(17, "Great things/ Ukor’ibikomeye by Don Moen", "R/Umushaha wanj’uvuge ubukuru bwawe\n" +
                        "Nezererewe mu mukiza wanje\n" +
                        "Ubuntu n’ubw’abubaha Umwana wawe\n" +
                        "Wabahaye umugisha ibihe vyose\n" +
                        "Pre-chorus\n" +
                        "Ukwera n’ukwiwe\n" +
                        "Ukwera n’ukwiwe\n" +
                        "1. Niwe ukor’ibikomeye\n" +
                        "Ntaco nokwishimira\n" +
                        "Mwami w’abami, Nyen’inkomezi Yesu\n" +
                        "Niwe ukor’ibikomeye\n" +
                        "Kubw’ijambo riba muri je\n" +
                        "Mwami w’abami, Nyen’inkomezi Yesu\n" +
                        "Bridge\n" +
                        "Nizina ryawe\n" +
                        "Dusemerera",
                        "Don Moen "),
                new Cantique(18, "Creator king / Mwami muremyi", "1. We waremye imisozi n’ibiyaga\n" +
                        "Wageze ayandi masi maz’urandema\n" +
                        "We jwi ryahamagaye amasi kubaho\n" +
                        "Ibihe n’ibihe, nanje riranshikira\n" +
                        "Mwami wanje muremyi\n" +
                        "2. We waremye ibiyaya n’amajuru\n" +
                        "Mbon’urukundo muri vyose waremye\n" +
                        "Uhiraho igitondo, uh’umuc’inyenyeri\n" +
                        "Uzihamagara mwizina, nanj’uranzi\n" +
                        "Mwami wanje muremyi\n" +
                        " R/ Mbe ndi iki? Kunyiyumvirako\n" +
                        "Jewe ndi iki? Kunsukak’urukundo\n" +
                        "Mwami wanje muremyi\n" +
                        "3. We waremye umwiza n’umuco\n" +
                        " Izubu n’ukwezi ngo biganze umurango n’ijoro\n" +
                        "Ikiganza cawe cashanj’amajuru\n" +
                        "Kinkingira kandi kikandamira\n" +
                        "Mwami wanje muremyi",
                        "Maclean Mary"),
                new Cantique(19, "Your Love never fails /Urukundo rwawe ntaho rushira", "1. Ntacotuma uhinduka\n" +
                        "Naho jewe nohunga\n" +
                        "Urukundo rwawe ntaho rushira\n" +
                        "Haracari ibingora\n" +
                        "Imbabazi zawe zamaho\n" +
                        "Urukundo rwawe ntaho rushira\n" +
                        " R/ Wewe ntuhindugwa nibihe\n" +
                        "Rukundo rudahinduka\n" +
                        "Hoba amarira mwijoro\n" +
                        "Impundu mu gatondo zikavuga\n" +
                        "Kandi mu bihuhusi\n" +
                        "Singira ico ntinya \n" +
                        "Kuko nzi wewe k’unkunda\n" +
                        "Urukundo rwawe ntaho rushira\n" +
                        "2. Mu muyaga nibihuhusi\n" +
                        "Mu mwuzure si ndi jenyene\n" +
                        "Rukundo rwawe ntaho rushira\n" +
                        "Imanga ni nini\n" +
                        "Sinibaza ko noyisimba\n" +
                        "Rukundo rwawe ntiruhinduka\n" +
                        "Ukora vyose ku bwineza yanje",
                        "Mcclarney Christopher Andrew, Skinner Anthony Warren"),
                new Cantique(20, "Unfailing Love / Urukundo rutananirwa", "1. Wandeheje\n" +
                        "Nd’uwaw’ Ibihe Vyose\n" +
                        "Nkomezi zanje\n" +
                        "Mana y’Ubuntu Iganje\n" +
                        "Bridge\n" +
                        "-------------\n" +
                        "N’ibintu vyose mu kiganza cawe\n" +
                        "Undonker’umwanya\n" +
                        "Sintahura\n" +
                        "R/\n" +
                        "Ushimwe Mwami w’isi n’ijuru\n" +
                        "Eh’ubgiza\n" +
                        "Bg’Urwo Rukundo\n" +
                        "Rutananirwa\n" +
                        "Ntuhinduka, Man’uracari\n" +
                        "Uwera Cane\n" +
                        "Urwo Rukundo\n" +
                        "Rutananirwa\n" +
                        "2. We Rutare\n" +
                        "Rwanje Numirako\n" +
                        "Indirimbo\n" +
                        "Yanje Niwe ndirimba\n" +
                        "Bridge\n" +
                        "....\n" +
                        "R/...\n" +
                        "Wewe Rukundo Rwanje Rutananirwa",
                        "Cary Pierce, Chris Tomlin, Ed Cash"),
                new Cantique(21, " Let Your Mercy Rain/ Imbabazi zawe zitunyagire", "1. Man’ ukor’ibihambaye\n" +
                        "Ukomez’ uwutabasha\n" +
                        "Kuw’ukomerets’utanga\n" +
                        "Indirimbo zo gushima\n" +
                        "2. Wamanutse ng’utuduze\n" +
                        "Waje wihuta kudusanga\n" +
                        "Ubu nta kintu,\n" +
                        "Nta munt’ Utokunda\n" +
                        " R/ Ni wewe soko\n" +
                        " Y’umutima wanje\n" +
                        " Rek’imbabazi\n" +
                        " Ziturweko nk’imvura\n" +
                        " Mwizigirwa\n" +
                        " Iy’isi icuz’umwiza\n" +
                        " Rek’imbabazi\n" +
                        " Ziturweko nk’imvura\n" +
                        "Bridge\n" +
                        "Eh’Uburebure\n" +
                        "Ubg’amajepfo\n" +
                        "Bg’urukundo Rwawe\n" +
                        "Eh’ Ubgaguke\n" +
                        "N’ubunini\n" +
                        "Bg’urukundo Rwawe Mwami",
                        "Chris Tomlin, Ed Cash, Jesse Reeves"),
                new Cantique(22, " Whom shall I fear? / Nzotinya nde? ", "1) Unyumva ntabaje\n" +
                        "Nkuririmba bugica\n" +
                        "Naho umwiza woza\n" +
                        "Ntiwohisha umuco\n" +
                        "Nzotinya nde?\n" +
                        "2) Wewe uneshereza\n" +
                        "Abansi banje\n" +
                        "Nkota ninkinzo yabje\n" +
                        "Nsugerejwe nivyago\n" +
                        "Nzotinya nde?\n" +
                        "R/\n" +
                        "Je ndazi uwundongora\n" +
                        "Je ndazi uwundinda\n" +
                        "Imana nyene ingabo\n" +
                        "Yama irikumwe nanje\n" +
                        "Uwuganje ibihe vyose\n" +
                        "Niwe ncuti yanje\n" +
                        "Imana nyene ingabo\n" +
                        "Yama irikumwe nanje\n" +
                        "3) Izina ryawe ninkomezi zanje\n" +
                        "Ko ariwe ushoboye gukiza\n" +
                        "Uzoneshereza\n" +
                        "Intsinzi niyawe\n" +
                        "Nzotinya nde?*2\n" +
                        "Bridge\n" +
                        "Ntakizogira ico kingira\n" +
                        "Wewe ufise isi mu kiganza\n" +
                        "Nizeye amasezerano yawe\n" +
                        "Urumyzigigwa urumwizigigwa",
                        " Chris Tomlin / Ed Cash / Scott Cash"),
                new Cantique(23, " Your ways / Inzira zawe", "1. Twe mukungungu duhem’ubuntu bgiwe\n" +
                        "Bakunzi bayo, ntitukiri babandi\n" +
                        "Izina rikuru uri mwiza cane\n" +
                        "Uzigam’isezerano\n" +
                        " R/ Uburyo udukunda\n" +
                        "Buhambaye\n" +
                        "Uburyo udukunda\n" +
                        "Buragutse\n" +
                        "Bumanuka n’i bgina\n" +
                        "Ntibuhinduka kandi dukunda\n" +
                        "Inzira zawe\n" +
                        "2. Kuk’uhagije ubugingo bgacu\n" +
                        "Tuzan’ivyo dukenye twizey’uwo mutima\n" +
                        "Izina rikuru uri mwiza cane\n" +
                        "Uzigam’isezerano\n" +
                        "Ntuzokwiger’uhemuka\n" +
                        "Bridge\n" +
                        "Uzama uri mwiza kuri bose\n" +
                        "Ur’ubuntu bgacu uko buca\n" +
                        "Ndazi nezako namenywe, mpfumbatiwe kandi nkunzwe\n" +
                        "Buhungiro bg’umutim’urushe\n" +
                        "Uturirimbiran’umunezero\n" +
                        "Ndazi neza ko namenywe, mpfumbatiwe kandi nkunzwe",
                        "Matt Redman, Nick Herbert, Sam Bailey"),
                new Cantique(24, "You are the Living Word / Ur’Ijambo Rizima", "1. Mutsima w’ubugingo wavuye\n" +
                        "Mw’ijur’uza kuba mw’isi\n" +
                        "Ub’umubaji war’Umwami\n" +
                        "We Jambo Rizima (X3)\n" +
                        "2. Umutwar’aganje, Mucunguzi mwiza\n" +
                        "Mana muri twe, ukuri kuzima\n" +
                        "Mbeg’umukunzi dufise muri we\n" +
                        "We Jambo rizima (X3)\n" +
                        "3. Yesu Yesu niryo zina ryawe\n" +
                        "Wavukiye Mu bgato bg’inka\n" +
                        "Upfa kugiti ng’ukiz’abantu\n" +
                        "We Jambo Rizima (X3)\n" +
                        " R/ Ooohh, Ooohhhh, Ooooooooohhhhhhhhhh\n" +
                        "We Jambo rizima",
                        "Fred Hammond / Noel Christopher Hall"),
                new Cantique(25, "You are faithful/ Ur’Umwizigirwa", "Igitero ca 1\n" +
                        "Muvyo twibaza\n" +
                        "Turondera inyishu\n" +
                        "Igihe turwana\n" +
                        "Ntuduheba\n" +
                        "Mu bituzazanira\n" +
                        "Mu vyiyumviro birusha\n" +
                        "Tubuze uburagamo\n" +
                        "Uraturinda\n" +
                        "Mwami, ndizera naho bingoye\n" +
                        "Chorus:\n" +
                        "Urengeye ibibazo\n" +
                        "Mu ntambara, uraganje\n" +
                        "Harico nzi kitazohinduka\n" +
                        "Ur’umwizigirwa\n" +
                        "Igitero ca 2\n" +
                        "Vyose bihindutse\n" +
                        "We ntuhinduka\n" +
                        "Uri uwo kwizerwa, Mana yanjee\n" +
                        "Mu bituzazanira\n" +
                        "Mu bidutera ubwoba\n" +
                        "Uri kumwe natwe, mu mipfunda\n" +
                        "Repeat chorus (×2)\n" +
                        "Bridge:\n" +
                        "Mwami, ndizera naho bingoye\n" +
                        "Mwami, ndizera mfasha kubona\n" +
                        "Mwizigirwa mwizigirwa\n" +
                        "Mwizigirw'ibihe vyose\n" +
                        "Mwizigirwa mwizigirwa\n" +
                        "Mwizigirw'ibihe vyose",
                        "Matt Redman, Jonas Myrin"),
                new Cantique(26, "River of Love/ (U)Ruzi Rw’Urukundo ", "1. Nyotewe birushirije\n" +
                        "Mpwemu wawe no kumeny’ukuri\n" +
                        "Nyuhagira icaha cose\n" +
                        "Subir’unyuzuze Mpwemu wawe\n" +
                        " R/ Niwe Ruzi rw’urukundo\n" +
                        "Ritemb’ imbabazi n’ubuntu\n" +
                        "Rwuzuz’umushaha\n" +
                        "N’amahoro y’umutima\n" +
                        "N’uruzi rw’urukundo\n" +
                        "Nk’iriba mu bugaragwa\n" +
                        "Ritang’ubuzima\n" +
                        "N’urukundo ngo mbohoke\n" +
                        "2. Nkiza, mbone gukira\n" +
                        "Mbohora mbone kwidegemvya\n" +
                        "Wanyujuje indirimbo z’ishimwe\n" +
                        "Ibihe vyose nzoririmb’ubuntu\n" +
                        "R/\n" +
                        "Bridge\n" +
                        "Nimba har’unyotewe naze yinjire\n" +
                        "Anywe amazi y’ubuzima\n" +
                        "Ntuzonyoterw’ukundi",
                        "David Foster, Rick Hahn, George Thatcher"),
                new Cantique(27, "What a Glorious God /Mbeg’Imana Y’Ubgiza", " R/ Mbeg’Imana y’ubwiza\n" +
                        "Mbeg’umukiza akomeye\n" +
                        "Ivyaremwe bisemerera\n" +
                        "Bit: “Uwera n’Umwami”\n" +
                        "Mbeg’Imana y’Ubgiza\n" +
                        "Mbeg’Imana y’Ubgiza\n" +
                        "Mbeg’Umukiza akomeye\n" +
                        "Ubuntu n’igikundiro vyawe\n" +
                        "Biragukikuje\n" +
                        "Mbeg’Imana y’Ubgiza\n" +
                        "Mbeg’Umukiza akomeye\n" +
                        "1. Uvuga nk’\n" +
                        "Ingoma y’ijwi ryiza\n" +
                        "Mbeg’Imana y’ubwiza\n" +
                        "Ikiganza cawe\n" +
                        "Kinyiganz’isi\n" +
                        "Mbeg’Imana y’ubwiza\n" +
                        "2. Wazutse mu bapfuye\n" +
                        "Ng’udukize\n" +
                        "Mbeg’Imana y’ubwiza\n" +
                        "Utuma tuguruka\n" +
                        "Nk’inkukuma\n" +
                        "Mbeg’Imana y’ubwiza\n" +
                        "3. Wamenyekanishije\n" +
                        "Agakiza kawe\n" +
                        "Ukwera kwerekanwa\n" +
                        "Ku mahanga yose\n" +
                        "O, Mbeg’Imana y’ubwiza",
                        "P. SMITH, D. BARONI, B. FITTS, C.\n" +
                                "CLONINGER"),
                new Cantique(28, "The Great I Am\"/ Ndiho Ahambaye ", "1. Nshaka kuba\n" +
                        "Hafi yawe\n" +
                        "Ijuru ririho\n" +
                        "Urupfu rwaratsinzwe\n" +
                        "Nshaka kwumva\n" +
                        "Abamarayika baririmbira hamwe\n" +
                        "R/\n" +
                        "Halleluia wera wera\n" +
                        "Mana ihambaye\n" +
                        "Uri ndiho\n" +
                        "Niwe ubereye\n" +
                        "Ntawusa nawe\n" +
                        "Mana Ihambaye\n" +
                        "Uri ndiho\n" +
                        "2. Nshaka kugira\n" +
                        "Wa mutima wawe\n" +
                        "Ukunda abantu\n" +
                        "Ukanka ikibi\n" +
                        "Mbona amagufa yumye\n" +
                        "Asubizwa ubuzima\n" +
                        "Aririmbira hamwe\n" +
                        "R/\n" +
                        "Bridge\n" +
                        "Imisozi ikwikubise imbere\n" +
                        "Mpwemu mbi zirahunga\n" +
                        "Tuvuze izina ryawe\n" +
                        "Mwami wicubahiro\n" +
                        "Nta bubasha bwikuzimu\n" +
                        "Canke uwogereranywa\n" +
                        "Nubushobozi nubwiza bw'Imana ikomeye\n" +
                        "Imana ikomeye",
                        "Anderson Jared Gordon"),
                new Cantique(29, "Plans / Imigambi ", "1. Kuv’umutwenzi utambitse\n" +
                        "Dufashe tubone isi nkawe\n" +
                        "Tubone ubwiza no mu bibi\n" +
                        "Twizere ivyo wasezeranye\n" +
                        " R/ Ufise imigambi yo kuduha ejo h’ ivyizigiro\n" +
                        "Ntitwibagiwe, ntituri twenyene\n" +
                        "Imigambi yo kutwongera iwawe\n" +
                        "Uhorana natwe aho turi hose\n" +
                        "2. Ibihe vyose ur’umwizigirwa\n" +
                        "Mu mwiza hamwe no mu muco\n" +
                        " Iy’amaganya aduteye\n" +
                        "Twizeye kw’atazoducinyiza\n" +
                        "Ibihe vyose urukundo rwawe ntiruhera\n" +
                        "Rutumurikira, ntiruterekura\n" +
                        "Ibihe vyose urukundo rwawe ruzodukiza\n" +
                        "No mumwijima tuzokwizigira",
                        "Nick Herbert, Tim Hughes"),
                new Cantique(30, "Echo / Urukundo Rusamirana ", "1. Iyo bwije ngiz'ubwoba\n" +
                        "Urampamagara\n" +
                        "Ntaye ukwizera, ivyizigiro vyaheze\n" +
                        "Uri inkomezi zanje\n" +
                        "Pre-chorus\n" +
                        "Iyo nibwiye nti sinkwiriye\n" +
                        "Mana urampagije\n" +
                        "Nahisemwo kutahagarika\n" +
                        "Kuko utazompeba\n" +
                        "Ch/\n" +
                        "Urukundo ruhangamye ntirurekura\n" +
                        "Ndumva rusamirana mu mitima\n" +
                        "Ooooh ooooh\n" +
                        "2. Mu bihe vyose\n" +
                        "Unsubiriramwo amasezerano\n" +
                        "Ntaguhagarika\n" +
                        "Ico watanguye\n" +
                        "Uragitunganya\n" +
                        "Pre-chorus\n" +
                        "..",
                        "Alexander Pappas"),
                new Cantique(31, " The Creed/ Ukwizera kw’Intumwa", "1) Data wacu wamyeho\n" +
                        "Muremyi wa vyose\n" +
                        "Mana ihambaye\n" +
                        "Kubwa mpwemu wawe\n" +
                        "Christo aba umuntu\n" +
                        "Mucunguzi wacu\n" +
                        "R1/\n" +
                        "Ndizera Imana data\n" +
                        "Ndizera Imana mwana\n" +
                        "Ndizera mpwemu yera\n" +
                        "Imana mu butatu\n" +
                        "Ndizera nizuka\n" +
                        "Tuzogigwa bazima\n" +
                        "Kuko nizera izina rya yesu\n" +
                        "2) Mucamanza numutabazi\n" +
                        "Wababajwe urabambwa\n" +
                        "Ni wewe uharira\n" +
                        "Wamanutse mu mwiza\n" +
                        "Uzukana ubwiza\n" +
                        "Uganje mu nkomezi\n" +
                        "Bridge\n" +
                        "Je ndakwizera\n" +
                        "Ndizera ko wazutse\n" +
                        "Ndizera ko yesu aru mwami\n" +
                        "R1/….\n" +
                        "R2/ Ubugingo budashira\n" +
                        "Gusamwa atacaha\n" +
                        "Isangira ryabera\n" +
                        "Shengero rimwe ryera\n" +
                        "Nizera izuka ryabera\n" +
                        "Yesu niyagaruka\n" +
                        "Muri yesu nivyo twizera",
                        "Fielding Benjamin David, Crocker Matthew\n" +
                                "Philip"),
                new Cantique(32, "We believe/ Twizera", "1. Twizeye Imana Data\n" +
                        "Yaremye isi n’ijuru\n" +
                        "Mwana wiwe, Krist’ Umukiza\n" +
                        "Yavyawe kubga Mpwemu Yera\n" +
                        "Yapfuye ngo akiz’abantu\n" +
                        "Kubg’ivyaha arabambga\n" +
                        "Twizeye ko yazukany’intsinzi\n" +
                        "Aduga kwa Se mw’ijuru\n" +
                        "2. Twizera ko yarungitse Mpwemu\n" +
                        "N’ingabire mw’ishengero\n" +
                        "Kugir’atwemeze Ijambo Ryiwe\n" +
                        "Akadutuma mumahanga\n" +
                        "Azogarukan’Ubgiza bginshi\n" +
                        "Ngo acir’imanza abantu\n" +
                        "Amavi yos’amupfukamire\n" +
                        "N’indimi zose zature\n" +
                        " R/ Yesu\n" +
                        "N’Umwami\n" +
                        "Aganje vyose (X4)\n" +
                        "Bridge\n" +
                        "Zina riruta\n" +
                        "Ayandi yose (X2)\n" +
                        "Response",
                        "Richie Fike, Matt Hooper, Travis Ryan"),
                new Cantique(33, "Made to Worship/ Twaremewe Guhimbaza", "1) Mbere y'iremwa ry'umuco\n" +
                        "Nukw'iyi si izunguruk'izuba\n" +
                        "Mana nkuru\n" +
                        "Yinjiye mu gihe\n" +
                        "Yandikira bos'inkuru y'urukundo\n" +
                        "Yatwujuj'igitinyiro\n" +
                        "Kugira ngo bitwibutse\n" +
                        " R/ Ko twaremwe guhimbaza\n" +
                        "Ko twaremewe gukunda\n" +
                        "Twahariwe turabohorwa\n" +
                        "Mu kwumvira tubikunze\n" +
                        "Muguhitamwo kwizera\n" +
                        "Niho tuzotahuzwa ico twaremewe\n" +
                        "2) Ico turi\n" +
                        "Ico dufise\n" +
                        "N'ingabire twahawe na We\n" +
                        "Twarazuwe\n" +
                        "Duhumurw'amaso\n" +
                        "Kubon'Icubahiro n'Ubgiza Bgiwe\n" +
                        "Yatwujuj'igitinyiro\n" +
                        "Kugira ngo\n" +
                        "bitwibutse\n" +
                        "Bridge\n" +
                        "Amabuye n'ijuru\n" +
                        "Bizosemerera\n" +
                        "Bihimbaz'izina Ryiwe\n" +
                        "Amajw’aririmbe\n" +
                        "Amavi apfukame\n" +
                        "Kukw'ari we abereye",
                        "Chris Tomlin, Ed Cash, Stephan Sharp"),
                new Cantique(34, " Your Love for me/ Ntangazwa N’urukundo Rwawe ", "1. Mbon'Ukuboko kwawe\n" +
                        "Muc'ukora cose\n" +
                        "Mw'isi n'ijuru niw'uri Mwiza\n" +
                        "Ungirira neza\n" +
                        "Muri vyose ncamwo\n" +
                        "Bridge\n" +
                        "------------\n" +
                        "Nuzuy'umutima\n" +
                        "Manitse n'ibiganza nshima\n" +
                        "R/Ur'Imana yanje\n" +
                        "Nd'umusavyi wawe\n" +
                        "Ntangazwa n'Urukundo Rwawe\n" +
                        "Ubuntu ni bginshi\n" +
                        "Ntabubereye\n" +
                        "Ndabisemereye\n" +
                        "Ntangajwe n'Urukundo Rwawe\n" +
                        "2. Ndizera sinyiganzwa\n" +
                        "Kuva ndakumenye\n" +
                        "Ico nifuza\n" +
                        "Nico ungombako\n" +
                        "Nywako ku gikombe\n" +
                        "C'Ubuntu Bguzuye",
                        "Geoffrey William Bullock"),
                new Cantique(35, " All the Earth/ ISI YOSE", "1) Data\n" +
                        "Nzoza Mubirimba vyawe\n" +
                        "Muremyi w’isi n’ijuru\n" +
                        "Imbere yawe\n" +
                        "Nuzuye igitinyiro\n" +
                        "2) We bgiza\n" +
                        "Bguzuye mu ngoro yawe\n" +
                        "Akayanagana kandi aganje\n" +
                        "Kubgivyo\n" +
                        "Tazirwa n’ivyaremwe\n" +
                        " R/ Isi yose\n" +
                        "Amamaza\n" +
                        "Ko yuzuy’urukundo\n" +
                        "Nzuzi n’imirima\n" +
                        "semerera\n" +
                        "Umv’ibiti bishima\n" +
                        "Nanje nuko\n" +
                        "Nzoririmba\n" +
                        "Indirimbo nsha\n" +
                        "Mwami nzotazir’\n" +
                        "Izina Ryawe Ryera",
                        "Jack Hayford, Wayne Puano Huirua, Siaosi Andrew\n" +
                                "Ulugia."),
                new Cantique(36, "Mighty God / IMANA IHAMBAYE  ", "1. Nzoririmba icubahiro\n" +
                        "Nerekane ubwiza bwawe\n" +
                        "Gutamba ntibimpagije\n" +
                        "Gusemerera ntibimpagije\n" +
                        "R1/ Kuko ur'Imana ihambaye\n" +
                        "Niwe uganza amahanga\n" +
                        "Ubereye amashimwe\n" +
                        "Ukwiriye kwamamazwa\n" +
                        "2. Uri Alpha na Omega,\n" +
                        "Iri sengesho ni ryawe\n" +
                        "Niwe nizigiye nzohimbaza izina ryawee\n" +
                        "#Isi n'ijuru biririmbe ubwiza bwawe\n" +
                        "Urukundo n'ubwizigirwa vyawe bimbera bisha\n" +
                        "R2/ Kuko ur'Imana ihambaye\n" +
                        "Ubereye amashimwe\n" +
                        "Uri mwiza mu bihe vyose\n" +
                        "Ur'umunezero w'isi\n" +
                        "Yesu yesu urumunezero w'isi.",
                        "Joe Praise"),
                new Cantique(37, "Glory to the Lord / SHIRWA HEJURU ", " inyenyeri mu nkomezi z’Ijambo?\n" +
                        "Agahumeka mu muntu\n" +
                        "Agatum’isi yose isemerera\n" +
                        " R/ Shirwa hejuru\n" +
                        "Himbazwa\n" +
                        "Mana gakiza kacu\n" +
                        "N’ashirwe hejuru\n" +
                        "Yubahwe, aganje\n" +
                        "Atwara amahanga\n" +
                        "N’uwugororotse abereye\n" +
                        "Guhimbazwa no gushimwa\n" +
                        "Tuduz’amajwi tuvuge\n" +
                        "Shirwa hejuru\n" +
                        "2. Ninde ashigikiy’abera?\n" +
                        "Ninde nzira muriki gihe?\n" +
                        "Akorosh’umutima w’umuntu?\n" +
                        "Agatum’abera bose basemerera",
                        "Lynn Deshazo"),
                new Cantique(38, "Arise / Haguruka", "Prelude\n" +
                        "Hagu-ruka, Hagu-ruka\n" +
                        "Uhaw’iKaze\n" +
                        "Wime Mu\n" +
                        "Mashimwe yacu\n" +
                        "1. Nico tugusaba\n" +
                        "Kand-ico twifuza\n" +
                        "Mwami tugisenga\n" +
                        "Ngwin’ uduhindure\n" +
                        "R/ Hagu-ruka, Hagu-ruka\n" +
                        "Uhaw’iKaze\n" +
                        "Wime Mu\n" +
                        "Mashimwe yacu\n" +
                        "Mwami Ma-na/yera\n" +
                        "Himbazwa\n" +
                        "Hagu-ruka (X2)\n" +
                        "2. Turagushize hejuru\n" +
                        "Wime Mu\n" +
                        "Mashimwe yacu",
                        "Baloche Paul Joseph, Moen Donald James"),
                new Cantique(39, " Love So Great / URUKUNDO RUHAMBAYE", "1. Mu Rukundo\n" +
                        "Ahambaye Yesu\n" +
                        "Nabony’umutima wawe\n" +
                        "Mumyaka igihumbi\n" +
                        "Nzoba nkirimba\n" +
                        "Nogushimira nte\n" +
                        "Muburyo buhagije\n" +
                        "R/ Uri Umwami wa vyose\n" +
                        "Urush’ ubgiz’inyenyenyeri kw’ijuru\n" +
                        "Urukundo rwawe ni nk’ikiyaga\n" +
                        "Ntaco mwogereranywa\n" +
                        "2. Ivyaremwe\n" +
                        "Ku mukiza wacu\n" +
                        "Turiho kubg’ishimwe ryawe\n" +
                        "Mw’isi n’ijuru\n" +
                        "Ntawukuruta\n" +
                        "Mwami ukor’ibitangaje\n" +
                        "Niwewe gus’ Uganje\n" +
                        "Bridge\n" +
                        "Tudugij’ishimwe\n" +
                        "Kuri wewe wenyene\n" +
                        "Atari kubgacu\n" +
                        "Shimwe ryose kuri wewe (X2)",
                        "Jamie Snell, Joshua Grimmett, Reuben Morgan"),
                new Cantique(40, " PRAISE ADONAI/ SHIMWA ADONAI", "Ninde ahwanye nawe\n" +
                        "Ur’ intambwe n'intama\n" +
                        "Uvyagiye ku ntebe\n" +
                        "Imisozi irunama\n" +
                        "Inzuzi zikivuga\n" +
                        "Imbere y'Umwami\n" +
                        "Shima Adonai\n" +
                        "Izuba riserutse\n" +
                        "Gushika rirenge\n" +
                        "Shima Adonai\n" +
                        "Amahanga yo mw'isi\n" +
                        "Abamalayika n’abera bashime",
                        "Paul Baloche"),
                new Cantique(41, "We've Seen a Light / TWABONYE UMUCO ", "1. Twabony’ umuco mu mwiza\n" +
                        "Waka neza\n" +
                        "Ivyo twari twarifuje\n" +
                        "Biratwegereye\n" +
                        "Twumvis'indirimbo\n" +
                        "Mwijoro icecekesh' ubgoba bgacu\n" +
                        "Mbeg’ indirimbo y'urukundo yo mwijuru urayumva?\n" +
                        "Ku bicu habonekana\n" +
                        "Abamarayika baririmba\n" +
                        "Bungere mukanguke\n" +
                        "N'igitondo c’umunezero\n" +
                        "R/Gloria Gloria\n" +
                        "In excelsisDeo\n" +
                        "Amahoro ngayo yaraje\n" +
                        "Kand'abe mwisi\n" +
                        "2. Ririmba kuko Twaributswe\n" +
                        "Iman'irihafi\n" +
                        "Ririmba ko yuguruy'ijuru\n" +
                        "Akaturongorerayo\n" +
                        "Uriteguriye uyo munsi\n" +
                        "Kare cane\n" +
                        "Mugatondo\n" +
                        "Tegur'inzira y'umutima wawe\n" +
                        "Haj'umunsi mushasha\n" +
                        "Da dada etc",
                        "Graham Kendrick"),
                new Cantique(42, "Light of the World- (U)MUCO W’ISI ", "1. Isi yitez’igitangaza\n" +
                        "Umutima uripfuz’ivyizigiro\n" +
                        "Ngwino Imanuweli\n" +
                        "Umwana azany’ayo mahoro\n" +
                        "Umuvyeyi wiwe ari ku bise vyinshi\n" +
                        "Ngwino Immanueli\n" +
                        "Abamarayika baririmba bati:\n" +
                        " R/ Uberey’icubahiro\n" +
                        "Wewe Muco w’isi(X2)\n" +
                        "Uri Hano\n" +
                        "2. Amarira y’umuvyeyi aratemba\n" +
                        "Haseruk’urukundo mururwo ruyoya\n" +
                        "Ngwino Imanuweli\n" +
                        "Niwe ndirimbo y’abarushe\n" +
                        "Ni messiya, Mwami w’amahoro\n" +
                        "Yaraje Imanuweli\n" +
                        "R/….\n" +
                        "Bridge\n" +
                        "Ku barindiriye\n" +
                        "No kubashonje\n" +
                        "Kubasenze\n" +
                        "N’abakekeranya\n" +
                        "Rab’Umwami\n" +
                        "Raba Messiya\n" +
                        "Imanuweli (X2)",
                        "LAUREN DAIGLE, PAUL DUNCAN, PAUL\n" +
                                "MABURY "),
                new Cantique(43, "Jesus Saves / YESU ARAKIZA Lyrics", "1. Umv’ijuru rivuga riti:\n" +
                        "Yes’arakiza (X2)\n" +
                        "N’uguhinda kw’imbabazi ziwe\n" +
                        "Yes’arakiza (X2)\n" +
                        "Abamarayika isinzi baRirimbir’Umwami yavutse\n" +
                        "Ijuru ntirisiba\n" +
                        "Kuvuga ko Yes’akiza\n" +
                        "2. Imitim’iciye bugufi ihimbaza\n" +
                        "Yes’arakiza (X2)\n" +
                        "Abanyabgenge baramwunamira\n" +
                        "Yes’arakiza (X2)\n" +
                        "Ijuru ryuzuy’ishimwe\n" +
                        "Umwijim’urahunga\n" +
                        "Har’ubugingo budashira\n" +
                        "Yes’arakiza\n" +
                        "3. Yasangiye umubabaro natwe\n" +
                        "Yes’arakiza (X2)\n" +
                        "Yapfuye yikorey’imitwaro yacu\n" +
                        "Yes’arakiza (X2)\n" +
                        "Yasemereye: “Birarangiye!”\n" +
                        "Kristo yaraducunguye\n" +
                        "N’imva iri gusa irabivuga\n" +
                        "Yes’arakiza\n" +
                        "Bridge\n" +
                        "Ukwidegemvya kurashitse\n" +
                        "Ivyizigiro biraserutse\n" +
                        "Igitondo gikuyeh’ijoro\n" +
                        "Imana irik’irema bisha (X2)\n" +
                        "Yes’arakiza\n" +
                        "4. Mbeg’Ubuntu butangaje\n" +
                        "Yes’arakiza (X2)\n" +
                        "Abera basemerere\n" +
                        "Yes’arakiza(X2)\n" +
                        "Ubuntu buduhagurutsa \n" +
                        "Mu nkomezi tugatazira\n" +
                        "Uwacunguwe ahor’aririmba\n" +
                        "Yes’arakiza",
                        "David Moffitt and Travis Cottrell"),
                new Cantique(44, "Come Thou long expected Jesus / KAZE YESU", "1. Kaze Yesu uje witezwe.\n" +
                        "Wavutse gukiza abawe\n" +
                        "Dukure mu vyaha n'ubwoba.\n" +
                        "Muri wewe turuhuke\n" +
                        "Muhoza nkomezi z'Isirayeli.\n" +
                        "Vyizigiro vy'abaremwe\n" +
                        "Witezwe n'amahanga yose.\n" +
                        "Vyirato vy'abakwifuza.\n" +
                        "2. Wavukiye gukiza abawe.\n" +
                        "Nk'umwana arik'ur'umwami.\n" +
                        "Wavukiye kutwiganzira.\n" +
                        "Mu bwami bw'ubuntu bwawe.\n" +
                        "Kubw'impwemu yaw'ihoraho.\n" +
                        "N'utwiganzire mukiza.\n" +
                        "Nk'uko ari wew'ubibereye.\n" +
                        "Tujane kubana nawe (×2).",
                        "Charles Wesley, Allan Robert Petker, Ralph R.\n" +
                                "Prim"),
                new Cantique(45, "You saw me /Nikubganje  ", "1. Bgiza bgawe bguzuye\n" +
                        "Mwisi no mwijuru\n" +
                        "Mug'uraca bugufi\n" +
                        "Uranyitangira\n" +
                        "2. Mana y'agakiza\n" +
                        "Niwe vyizigiro\n" +
                        "Wapfuye ngo mbohoke\n" +
                        "Kugiti wenyene\n" +
                        " R/ Himbaz'Imana\n" +
                        "Ibihe vyose\n" +
                        "Tazir'izina\n" +
                        "Izina Ryera\n" +
                        "Nikubganje\n" +
                        "Wambay’igitsibo c'amahwa\n" +
                        "Wanyezeshej' amaraso\n" +
                        "Warankunze\n" +
                        "Igihe wacumiswe\n" +
                        "Wanyezeshej'amaraso\n" +
                        "3. Ntanuhwanye nawe\n" +
                        "(Mu)Buntu budashira\n" +
                        "Ushits'ijambo ryawe\n" +
                        "Wapfuy' urazuka",
                        "BEN FIELDING, MIA FIELDES, REUBEN\n" +
                                "MORGAN"),
                new Cantique(46, "Beautiful & Terrible Cross/ UMUSARABA MWIZA UTEYE UBWOBA ", "1. Umusaraba mwiza utey’ubgoba\n" +
                        "Nah’utigez’ ucumura\n" +
                        "Mukiza ubabazwa nk’inkozi yikibi kugiti c’agashinyaguro\n" +
                        "Kumusaraba mwiza utey’ubgoba\n" +
                        "Wakoz’ ibishoboka vyose ngukure mwineza yanj mukibi Satani yari yagabiye\n" +
                        "Chorus 1\n" +
                        "Mbeg’urukundo ruhambaye\n" +
                        "Es’uguheb ubuzima\n" +
                        "Dupfukamye dutangajwe\n" +
                        "Numusaraba mwiza utey’ubgoba\n" +
                        "2. Kumusaraba mwiza utey’ubgoba\n" +
                        "Umwijima wari mwinshi\n" +
                        "Ntiwagutey ubgoba ntiwanyiganze washikije neza vyose\n" +
                        "Chorus 1\n" +
                        "Mbeg’urukundo ruhambaye\n" +
                        "Es’uguheb ubuzima\n" +
                        "Dupfukamye dutangajwe\n" +
                        "Numusaraba mwiza utey’ubgoba\n" +
                        "Chorus 2\n" +
                        "Warish’ikiguzi gikomeye\n" +
                        "Ngo ndonk umwandu wijuru\n" +
                        "Narahaririwe ndatazira\n" +
                        "Umusaraba mwiza utey’ ubgoba",
                        "Chad Robert Cates, James Todd Smith, Tony W.\n" +
                                "Wood"),
                new Cantique(47, "At the foot of the cross / MUNSI Y’UMUSARABA ", "1. Musi y’umusaraba\n" +
                        "Mubuntu numubabaro\n" +
                        "Wanyerets urukundo mugihano warons \n" +
                        "Pre-chorus\n" +
                        "Warehej umutima\n" +
                        "None ubu\n" +
                        "Chorus:\n" +
                        "Nzany’ubu bubi ndonk ubgiza\n" +
                        "Guharirwa nk igitsibo\n" +
                        "Nje kubirenge vy umukiza\n" +
                        "Nsinzeho uyu mutwaro\n" +
                        "Musi y umusaraba\n" +
                        "2. Musi y umusaraba\n" +
                        "Aho nuzurizwa\n" +
                        "Wamperej ubuzima\n" +
                        "Mugihano warons\n" +
                        "Pre-chorus\n" +
                        ".....\n" +
                        "Chorus\n" +
                        "....",
                        "Graham Kendrick"),
                new Cantique(48, "Servant King/ UMWAMI N’UMUSHUMBA ", "1. Wiyambuy’ ubgiza uvuka\n" +
                        "Nkuruhinja mwisi yacu\n" +
                        "Uca buguf’ uradukorera\n" +
                        "Utangubugingo ngo tubeho\n" +
                        "Chorus:\n" +
                        "Nguy’ Umwami n’umushumba\n" +
                        "Arik’arahamagara\n" +
                        "Ngo dutange vyose nk’ikimazi\n" +
                        "Buri musi tumuhimbaza\n" +
                        "2. Arira i Getsemane\n" +
                        "Umutwaro umuvuna\n" +
                        "Yuzuye n’akabonge\n" +
                        "Aseng’ ati: “Bib’uk’ugomba!”\n" +
                        "3. Rab’inkovu zukwitanga\n" +
                        "Mubiganza nibirenge\n" +
                        "Vy’Uwaremy inyenyeri\n" +
                        "Acumitw’imisumari\n" +
                        "4. Tumwigireko ubusuku\n" +
                        "Aganz’ ubuzima bgacu\n" +
                        "Dukoreranire\n" +
                        "Nkuko twokorera Kristo\n" +
                        " Bridge\n" +
                        "Tuguhaye vyose\n" +
                        "Turakwishikanye\n" +
                        "Urukundo nyakuri\n" +
                        "Nirwo rumpindura",
                        "Lacey Sturm"),
                new Cantique(49, "Mercy Tree/ IGITI C’IMBABAZI", "1. Kumusozi i Karuvari\n" +
                        "Hashinz’ igiti c’imbabazi\n" +
                        "Umutima wos’uremerewe\n" +
                        "Nih’uruhukira ukuzuzwa\n" +
                        "Amaraso acuzuyeko\n" +
                        "Yasutswe kubg’isoni zacu\n" +
                        "Urukundo ruva mu nkovu\n" +
                        "Agakiza kubgico giti\n" +
                        "2. Hagati y’ibisuma bibiri\n" +
                        "Habambge Umwami w’amahoro\n" +
                        "Ajanjagura, aracumitwa\n" +
                        "Imisumari mu biganza\n" +
                        "Asemerer’ati: “Birarangiye!”\n" +
                        "Umwagazi yarabambge\n" +
                        "We Kimazi, ntsinzi yacu\n" +
                        "Yahisemw’igiti c’imbabazi\n" +
                        "3. Kur’uwo musi w’umwiheburo\n" +
                        "Is’inyiganzwa nurwo Rukundo\n" +
                        "Umubiri waremewe ubgiza\n" +
                        "Umara iminsi itatu I kuzimu\n" +
                        "BgizaBg’ijuru, Bgiza Bg’ijuru (X4)\n" +
                        " Kuruwo musi w’ubgiza\n" +
                        " Ijuru ryugurur’iyo mva\n" +
                        "Ni muzima koko yazutse\n" +
                        "Shimwa giti c’imbabazi\n" +
                        " R/ Urupfu rwarakuweho\n" +
                        "Halleluya! Halleluya!\n" +
                        "Yesu Kristo yanesheje\n" +
                        "Yazutse mu bapfuye\n" +
                        "4. Vuba tuzomubona munyonga\n" +
                        "Ahanagure amosozi\n" +
                        "Nta gahinda kazongera\n" +
                        "Shimwa giti c’imbabazi",
                        "Lacey Sturm"),
                new Cantique(50, "Wonderful Cross / UMUSARABA MWIZA - Michael W. Smith", "1. Nitegerej’umusaraba mwiza\n" +
                        "Umwami w’ubgiza yapfiriyeko\n" +
                        "Inyungu y’agaciro yamberey’ubusa\n" +
                        "Nca nsuzugur’ivyo nari nishimiye\n" +
                        "Raba mu mutwe, mubiganza, mu birenge\n" +
                        "Umubabaro n’urukundo bitemba hamwe\n" +
                        "Mbega vyari bgigere bihuzwa na hamwe\n" +
                        "Cank’amahw’ akab’ubgiza bg’igitsibo\n" +
                        " R/ Musaraba mwiza (X2)\n" +
                        "Umpamagarira gupfa maze ndonke\n" +
                        "Ubuzima bg’ukuri\n" +
                        "Musaraba mwiza (X2)\n" +
                        "Abakoranye hano\n" +
                        "Begera mubuntu\n" +
                        "Bakaguhimbaza\n" +
                        "2. Naho nobaye nganje kamere kanje\n" +
                        "Gasanzwe ari gato kagatanga bike\n" +
                        "Urukundo rw’Imana rutangaje\n" +
                        "Runsab’umutima, ubuzima, nanje wese",
                        "Chris Tomlin"),
                new Cantique(51, "Forever / IBIHE VYOSE ", "1. Izuba n'ukwezi vyacuz'umwiza\n" +
                        "Umucungusi wisi yacikanye\n" +
                        "Yamanitswe kugiti\n" +
                        "Aradupfira\n" +
                        "Yikorey’ umuvumo wose\n" +
                        "2. Umutima uraca\n" +
                        "Ijuru ririhisha\n" +
                        "Ashirwa no mumva mumwijima\n" +
                        "Arwan'intambara\n" +
                        "Rupfu na kuzimu\n" +
                        "Abimar'inkomezi zose\n" +
                        "Bridge\n" +
                        "Is'iranyiganyiga\n" +
                        "Ikibuye gikurwaho\n" +
                        "Urukundo Rwiwe Ntirwotangirwa\n" +
                        "Wa ruboyi rw'urupfu\n" +
                        "None ubu uri he? K'Umwami yakunesheje!\n" +
                        "Chorus:\n" +
                        "N'ahimbazw'\n" +
                        "Ibihe vyose\n" +
                        "Ashirwe hejuru \n" +
                        "Ibihe vyose\n" +
                        "Ibihe vyose yarazutse!\n" +
                        "Ni muzima (X2)\n" +
                        "Turirimbe halleluya\n" +
                        "Umwagazi yanesheje (2)",
                        "Jenn & Brian Johnson, Gabriel Wilson, Joel Taylor, Kari\n" +
                                "Jobe"),
                new Cantique(52, "Risen / YARAZUTSE  ", "1. Wa mva urihe ubu?\n" +
                        "Ko waneshejwe\n" +
                        "Ruboyi rw’urupfu\n" +
                        "Watsinzwe n’Umwami\n" +
                        "2. Eh’Uwazutse\n" +
                        "Akayangana nk’izuba\n" +
                        "Agakurah’ubgoba\n" +
                        "Iyo n’intsinzi, iri kumwe natw’ubu!\n" +
                        "Pre-chorus\n" +
                        "Oh-oh, oh-oh, halleluya\n" +
                        "Oh-oh, oh-oh, halleluya\n" +
                        "Yesu shirwa hejuru\n" +
                        "Dukorer’ Uwazutse\n" +
                        " R/ Yarazutse, Yarazutse\n" +
                        "Himbazw’ibihe vyose\n" +
                        "Yarazutse, Yarazutse\n" +
                        "Mwami Yesu, Mwami Yesu ni muzima\n" +
                        "Bridge\n" +
                        "Bga bushobozi nyene\n" +
                        "Bganeshej’ Umwansi\n" +
                        "Nibgo bushobozi\n" +
                        "Bunesha muri je",
                        "Israel Houghton"),
                new Cantique(53, "Best for me/ UNDUTIRA VYOSE", "1. Yesu uri muzima\n" +
                        "Uri muzima\n" +
                        "Uruwazutse\n" +
                        "Yesu uri muzima\n" +
                        "Uri ubugingo n'ukuzuka\n" +
                        "[x2]\n" +
                        "Oh oh oh\n" +
                        " R/ Mbayeho nguhimbaze\n" +
                        "Mbayeho nguhimbaze\n" +
                        "Nguhaye vyose\n" +
                        "Nguhaye vyose\n" +
                        "Witanze kubwanje\n" +
                        "Mbayeho nshinge intahe\n" +
                        "Ndiho kuko we wapfuye\n" +
                        "Nguhaye vyose\n" +
                        "Nguhaye vyose\n" +
                        "We Witanz’ kubwacu\n" +
                        "Ntawusa naw Yesu\n" +
                        "Ntawusa nawe Yesu\n" +
                        "2. Yesu niwewe gusa nshaka\n" +
                        "Uri impamvu mbayeho\n" +
                        "Yesu uri uwera\n" +
                        "Icubahiro niciwawe\n" +
                        "Oh oh oh\n" +
                        "R/…\n" +
                        "Ntanumwe\n" +
                        "Ntanumwe\n" +
                        "Ntawusa nawe Yesu\n" +
                        "[x4]\n" +
                        "R/…",
                        "Israel&Meleasa Houghton"),
                new Cantique(54, "The Glories of Calvary / Ibitangaza vy’I Karuvari", "1. Mwami urampamagara\n" +
                        "Nitegereze umusaraba mwiza\n" +
                        "Mbona ubuntu bginshi\n" +
                        "Bwasavy’ikiguzi kinini\n" +
                        "Aho urukundo rwinshi\n" +
                        "Rwatsinze ivyaha vyanje\n" +
                        "Nakirwa n’amaboko yimbabazi\n" +
                        " R/ Umutima wuzuye indirimbo\n" +
                        "Zibitangaza vy’I Karuvari\n" +
                        "Jewe weseMwami nifuza\n" +
                        "Kuvuga yesu yambambiwe\n" +
                        "Mwami mpishurira\n" +
                        "Ibitangaza vy I Karuvari\n" +
                        "2. Mu mishishagu yawe\n" +
                        "Uh’abanyavyaha umunezero\n" +
                        "Kubwamaraso yumwami wacu\n" +
                        "Uburake bwarakuweho\n" +
                        "Twifatanije nabo mw’ijuru\n" +
                        "Tunezererwa umwagazi yazutse",
                        "Sovereign Grace"),
                new Cantique(55, "He has risen / Kristo yarazutse", "1. Kare cane mu gitondo\n" +
                        "Bashitse ku mva\n" +
                        "Biyumvira bumiwe\n" +
                        "Uwakuye ikibuye\n" +
                        "Izuba riserutse\n" +
                        " Baraba mu mva batangaye\n" +
                        " Umumarayika ababwira ati\n" +
                        "Humura, ni muzima\n" +
                        " R/ Yarazutse\n" +
                        "Halleluya, halleluya\n" +
                        "Kristo yarazutse\n" +
                        "Isi n’ririmbe\n" +
                        "Yarazutse\n" +
                        "Yarazutse mu bapfuye\n" +
                        "2. Turirimbane n’ivyaremwe\n" +
                        "Ivy’isi izonagurwa\n" +
                        "Muriwe natwe turabaho\n" +
                        "Tuvuye mu rupfu\n" +
                        "Twizigiye kubona\n" +
                        "Umwami ahangamye ku ngoma\n" +
                        "Urukundo rwiwe rushimagijwe\n" +
                        "Nezerwa, tugiye kumubona ",
                        "Graham Andrew Kendrick, Paul Baloche"),
                new Cantique(56, "To Know Your Name/ MENYE IZINA RYAWE", "Nacunguwe namaraso yawe\n" +
                        "Narahariw’ubu ndidegemvya\n" +
                        "Icubahiro ciwe kiba muri Je\n" +
                        "Mbayeho nizera (X2)\n" +
                        "Nahinduwe nukuri nukwera \n" +
                        "Ubuntu bgaw bgarandengeye\n" +
                        "Nemejwe na Mpwmu, ngazwa n’Ijambo\n" +
                        "Urukundo Rwamaho\n" +
                        "Chorus:\n" +
                        "Ndazi ko watanz Umwana waw ngo ampfire\n" +
                        "Meny’eizina ryiw\n" +
                        "Mbe murukundo Rwiw\n" +
                        "Yangirie mugishingo arampfira\n" +
                        "Yarankunze ntabibereye",
                        "Joel Houston, Marty Sampson, Matthew Tennikoff"),
                new Cantique(57, "How deep the Father’s Love / Urukundo rurengey’igipimo", "1) Mbeg'urukundo rw'Imana\n" +
                        "Rurengey’ igipimo\n" +
                        "Yatanz'ikinege ciwe\n" +
                        "Ngwahindur'intabwa uwiwe.\n" +
                        "Mbeg'umubabaro urenze\n" +
                        "Dat’ amutey'umugongo\n" +
                        "Yamar’inguma ziwe Zizana benshi kubwiza\n" +
                        "2) Eh’amanitswe kugiti\n" +
                        "Yikorey’icaha canje\n" +
                        "Nibimaramare, ndamuhema\n" +
                        "Maramazwa n’ijwi Ryanje\n" +
                        "Yabambge n’icaha canje\n" +
                        "Gushika ah’acikana\n" +
                        "Kubgiwe narons’ Ubugingo\n" +
                        "Vyose vyararangiye.\n" +
                        "3) Ntaco nzirata nakimwe,\n" +
                        "Ntangabire ntan'ubwenge\n" +
                        "Nzirata Kristo wenyene, urupfu rwiwe no kuzuka,\n" +
                        "Kuki twosangir’impera?\n" +
                        "Ivyo birandengera\n" +
                        "Iconzi ntakekeranya\n" +
                        "Umwenda wanje wararishwe",
                        "Selah"),
                new Cantique(58, "At the cross /KURUWO MUSARABA ", "1. Eh'imbabazi\n" +
                        "Aho ziganje ntizishire\n" +
                        "Ubuntu nk'uruzi\n" +
                        "Ruratemba\n" +
                        "N'urukundo rwonyene\n" +
                        "Nzi\n" +
                        "Rutemba\n" +
                        "Nk'umwuzure\n" +
                        " R/ Kur'uwo musaraba\n" +
                        "Ntanz'ubugingo bganje\n" +
                        "Nkwitegereje\n" +
                        "Urandengera\n" +
                        "Urukundo rwuzuye\n" +
                        "Icaha cogejwe\n" +
                        "Mbikesha wewe\n" +
                        "2. Ntasoni cank'ivyaha\n" +
                        "Vyotsindisha\n" +
                        "Aho nujujwe n'Imana nkaharirwa\n" +
                        "R/....\n" +
                        "Bridge:\n" +
                        "Hano Ahera cane\n" +
                        "Ndonk'ivyizigiro\n" +
                        "Niho mpfukamye\n" +
                        "Niho wankirije\n" +
                        "Niho nakiriwe\n" +
                        "Niho mpfukamye",
                        "Matt Redman, Myrin Jonas Carl Gustaf, Cash Ed, Chris Tomlin, Armstrong Matthew\n" +
                                "Ross"),
                new Cantique(59, "What a Savior / EHE UMUKIZA ", "1) Eh'umukiza umucunguzi\n" +
                        "Incuti yabansi nkanje\n" +
                        "Mumbabazi yababajwe\n" +
                        "Arankiza\n" +
                        "Arambohora\n" +
                        "2) Bwiza bwijuru wuzuy'imbabazi\n" +
                        "Waruzi ivyanj\n" +
                        "Arik'urankunda\n" +
                        "Ukwidegemvya gutangaje\n" +
                        "Narahariwe\n" +
                        "Nd'uwazuwe\n" +
                        "R/Mbeg'ubuntu nabonye muri Yesu,\n" +
                        "kumpa kukwihweza nkahimbarwa,\n" +
                        "umushaha wanje wumire kuriwe, nzoguhimbaz'ibih vyose.\n" +
                        "Bridge:\n" +
                        "Reka mbeho\n" +
                        "Ataco mfash atari wa musaraba\n" +
                        "Nzotazira nshiz’ubgoba\n" +
                        "Nibingize nzoririmba",
                        "Chris Davenport"),
                new Cantique(60, "Thank You Jesus WARAKOZE YESU ", "1.Ubuntu butemba\n" +
                        "Bukantyorora\n" +
                        "Soko ry'urukundo\n" +
                        "Rutemba muri Je\n" +
                        "R/Warakoze\n" +
                        "Kumbohora\n" +
                        "Mukiza wanje\n" +
                        "Wandokoye\n" +
                        "2.Umutima ubohotse\n" +
                        "Userur’urukundo\n" +
                        "Niyeguriye kubona\n" +
                        "Ubwami bwawe\n" +
                        "R/\n" +
                        "Br/wampaye ubuzima\n" +
                        "Umpumura amaso\n" +
                        "Mwami wanje\n" +
                        "Ndagukuna\n" +
                        "Bridge\n" +
                        "Wangereyemwo\n" +
                        "Ungira inyegu\n" +
                        "Mwami wanje ndagukunda",
                        "Hannah Hobbs / Matt Crocker"),
                new Cantique(61, " Anchor / IKIGUMY’ UMUTIMA ", "1. Vyizigiro\n" +
                        "Bimpumuriza umutima\n" +
                        "Mu bingora\n" +
                        "Nzisunga wewe\n" +
                        "We rukundo\n" +
                        "Muri wewe ndarema\n" +
                        "Muri vyose\n" +
                        "Nzokwizigira\n" +
                        " R/ Har’ivyizigiro ku musaraba\n" +
                        "Aho wiguz’iyi si wakunze\n" +
                        "Ivyo bigumya umutima wanje\n" +
                        "Imana yacu\n" +
                        "Ntihinduka\n" +
                        "2. Ntuhinduka\n" +
                        "Wamyeho ugira uze\n" +
                        "Iy’usezerany’\n" +
                        "Urashitsa\n" +
                        "Bridge\n" +
                        "Zina rikuru\n" +
                        "Zina rihambaye\n" +
                        "Ni wewe nizeye\n" +
                        "Jambo rizima\n" +
                        "Uvuze urashitsa\n" +
                        "Ni wewe nizeye",
                        "Fielding Benjamin David"),
                new Cantique(62, "Resting Place / NDUHUKIYE ", "1) Ico nizera gishitse\n" +
                        "Atari mu bikorwa\n" +
                        "Nizigiy'Uwuhoraho\n" +
                        "Kubwiwe singitsinzwe\n" +
                        "R/Ntajambo ryokunyemeza\n" +
                        "Ntanuwomvugira\n" +
                        "Birakwiye ko yapfuye\n" +
                        "Kand'apfira jewe\n" +
                        "2) Birakwiye ko Yes'akiza\n" +
                        "Biramar'ubwoba\n" +
                        "Umubi nkanje nja kuriwe\n" +
                        "Ntaziger'ampeba\n" +
                        "Bridge\n" +
                        "Musaraba mwiza\n" +
                        "Amaraso yeza\n" +
                        "Ikimazi gikwiriye\n" +
                        "Wanyoboreye ku musaraba n'ubu uracanyobora",
                        "Adam Palmer, Jacob Sooter, Matthew Hein, Lindsey, Lindsey\n" +
                                "Sweat"),
                new Cantique(63, "Perfect Love / URUKUNDO RWUZUYE", "1. Uba mumutima wanje\n" +
                        "Warankuze kuva kera\n" +
                        "Naho nakwanse kenshi\n" +
                        "Wagumy’undondera\n" +
                        "2. Nariye k’urukundo rwawe\n" +
                        "Sinshobora kuruhaga\n" +
                        "Narakwegukiye\n" +
                        "Waranyigaruriye\n" +
                        "Pre-chorus 1\n" +
                        "N’urukundo rutemba mumutima wanje\n" +
                        "Iminsi yose nzokwama ndakwegera\n" +
                        " R/\n" +
                        "Mbeg’urukundo rwinshi\n" +
                        "Ingen’umpagurutsa\n" +
                        "Aramurikira\n" +
                        "Umwijim’urahunga\n" +
                        "Turi kumwe, vyose bicika vyiza\n" +
                        "Turi kumwe, nd’aho nagenewe\n" +
                        "Eh’uko rutunganye\n" +
                        "3. Ivyo nocamwo vyose\n" +
                        "Nzohora nguhanz’amaso\n" +
                        "Ur’umwizigirwa\n" +
                        " Kand’urashoboye\n" +
                        "Pre-chorus 1\n" +
                        "N’urukundo rutemba mumutima wanje\n" +
                        "Iminsi yose nzokwama ndakwegera\n" +
                        " R/ ….\n" +
                        "Pre-chorus 2\n" +
                        "Umutima wanje wose uruguruye\n" +
                        "Ingo uwubemwo urahawe ikaze\n" +
                        " R/ ….",
                        "Andy Harrison"),
                new Cantique(64, " None but Jesus/ ATARI YESU ", "1. Mu gutuza no mu gacerere\n" +
                        "Menya k’Uri Imana\n" +
                        "Mpishijwe mu Bwiza bwawe\n" +
                        "Menya kuzonagura\n" +
                        "Umpamagaye nzumvira\n" +
                        "Rya jwi ryawe uko buca\n" +
                        "R/Ntawundi wo kumbumba\n" +
                        "Atari yesu\n" +
                        "Wabambwe ngo nidegemvye\n" +
                        "Ndiho ngutazire\n" +
                        "2.Vyose vyanse\n" +
                        "Nzazaniwe menya\n" +
                        "Ko wew’ Uganje\n" +
                        "Ndi mu ntege nke\n" +
                        "Wew’ump’ubuntu ngo ngukorere\n" +
                        "Umpamagaye sinzoteba\n" +
                        "Iyi n’indirimb’ idaca\n" +
                        "R/…\n" +
                        "Bridge\n" +
                        "Ibihambaro Vyanje ni we Mwani\n" +
                        "We vyizigiro\n" +
                        "N’inkomezi zanje",
                        "Brooke Frazer"),
                new Cantique(65, "In your Freedom / NDIDEGEMVYA ", "1. Nyeninkomezi ndakurondera\n" +
                        "Nciye bugufi ndapfukamye\n" +
                        "Ntawundi Mwami yoje nkawe\n" +
                        "Ng’ankiz’umutima ancungure\n" +
                        "Pre-chorus:\n" +
                        "Ntakindi mfise\n" +
                        "Kirets’icumpaye\n" +
                        "Ntakindi mfise c’agaciro\n" +
                        "Chorus:\n" +
                        "Ndagukunda wancunguye\n" +
                        "Uri vyose nshaka\n" +
                        "Vyose nkeneye\n" +
                        "2 Ndakwituye We Mahoro\n" +
                        "Nduhukiye muri Wewe\n" +
                        "Pre-Chorus...\n" +
                        "Chorus...\n" +
                        "Bridge:\n" +
                        "Muri Wewe ndidegemvya (X2)\n" +
                        "Ndakwiyegurie (X2)",
                        "Marty Sampson / Raymond Badham"),
                new Cantique(66, " Savior King / MWAMI MUKIZA    ", "#.1 Munyantegenk’\n" +
                        "Avuge ndakomeye\n" +
                        "Kubga Mpwemu Yera\n" +
                        "Yazuye Kristo mumva\n" +
                        "Umuken avuge at’ “Uhoraho\n" +
                        "Niwe Mwandu wanj narahezagiwe”\n" +
                        "Pre-chorus:\n" +
                        "Rek imitima yacu\n" +
                        "Yak umuriro\n" +
                        "Kubg izina Ry’\n" +
                        "Umwana wawe\n" +
                        "Hamw nijuru twemeze\n" +
                        "Kur Umwami\n" +
                        "R1/:\n" +
                        "Turagukunda\n" +
                        "Turakwubashe\n" +
                        "Ur’Imana Yacu\n" +
                        "Niwe gusa wera\n" +
                        "#.2 Ishengero\n" +
                        "Risayangane nk’umugeni\n" +
                        "Wacunguy’igihe\n" +
                        "Watang’ubugingo bgawe\n" +
                        "Abazimiye\n" +
                        "Biyegerezwe murugo\n" +
                        "N’abera bagizwe inyegu n’abacunguwe\n" +
                        "Pre-Chorus:\n" +
                        "………\n" +
                        "-R1\n" +
                        "Turagukunda\n" +
                        "Turakwubashe\n" +
                        "Ur’Imana Yacu\n" +
                        "Niwe gusa wera\n" +
                        "R2/: Watanze Yesu\n" +
                        "Ngo yikorere\n" +
                        "Umusaraba\n" +
                        "Kubg’ ivyaha vyacu\n" +
                        "R3/: Turagukunda\n" +
                        "Turakwubashe\n" +
                        "Vyizigiro vyanje\n" +
                        "Vyagizwe bisha\n" +
                        "R4/: Ntanz’ ubugingo\n" +
                        "Nk’icemezo\n" +
                        "Rukundo rwa Kristo\n" +
                        "Mwami Mukiza",
                        "Marty Sampson / Mia Fieldes"),
                new Cantique(67, "Father me / MBER’UMUVYEYI ", "1. Muvyeyi w'impfuvyi\n" +
                        "Uhezagir’ imiryango\n" +
                        "Ndakund'ubuvyeyi bwawe\n" +
                        "Ump'ubugingo\n" +
                        "Uramparira\n" +
                        "Muri wewe har'impore\n" +
                        "Ndakund'ubuvyeyi bwawe\n" +
                        "2. Iyo menetse\n" +
                        "Nkakwegera\n" +
                        "Umpanagur'amarira\n" +
                        "Ndakund'ubuvyeyi bwawe\n" +
                        "Ubgoba bugah'inzira umutim'ukuyobotse\n" +
                        "Ndakund'ubuvyeyi bwawe\n" +
                        " R/Muvyeyi,\n" +
                        "Wam’umber' umuvyeyi\n" +
                        "Mugikiriza cawe\n" +
                        "Nzohora ndemye\n" +
                        "Ndakund’ubuvyeyi bwawe (x2)\n" +
                        "3. Mukugarariza iyo ngutaye\n" +
                        "Ngarutse nuzuy'isoni\n" +
                        "Ndakund'ubuvyeyi bwawe\n" +
                        "Mu gishingo c’ububi nkambikw’\n" +
                        " Imyambar' ikayangana\n" +
                        "Ndakund'ubuvyeyi bwawe\n" +
                        "4. Iyo nihwej’ inyonga zawe\n" +
                        "Umutim'uraririmba\n" +
                        "Ndakund'ubuvyeyi bwawe\n" +
                        "Nkarengerwa nurwo Rukundo\n" +
                        "Ruzamah'ibihe vyose\n" +
                        "Ndakund'ubuvyeyi bwawe",
                        "Graham Kendrick"),
                new Cantique(68, "I'll Just Say Yes / EGO MWAMI ", "Ego Mwami\n" +
                        "N'unyobore\n" +
                        "Kandi sintewe ubwoba no kuvuga ko\n" +
                        "Ubuzima wampaye eka s'ubwanje\n" +
                        "Nizigiye k’unyakira ng’unyobore\n" +
                        " R/ Ego Mwami\n" +
                        "Ndakwihaye\n" +
                        "Bridge\n" +
                        "Ndonk’amahoro iyo nkwihaye\n" +
                        "Naho ntobibon’ubu\n" +
                        "Nzi ko wabikiye\n" +
                        "Ivyiz’abakwizigiye\n" +
                        "Ni wewe nyishu\n" +
                        "Idateba",
                        "Brian Wilson / Aaron Lindsey"),
                new Cantique(69, "In Christ Alone / MURI KRISTO WENYENE", "1. Muri Kristo, Vyizigiro Vyanje\n" +
                        "N’umuco, inkomezi, n’indirimbo\n" +
                        "N’ibuye rigumy’imfuruka\n" +
                        "Ntirinyiganyiga mu bihuhusi\n" +
                        "Mbeg’urukundo, n’amahoro\n" +
                        "Bihambaye, bihoz’ubgoba\n" +
                        "Niw’andemesha, niwe vyose\n" +
                        "Nshinzwe mur’uru rukundo rwa Kristo\n" +
                        "2. Kristo wenyene, yambay’umubiri\n" +
                        "Ubumana bguzuye mu ruyoya\n" +
                        "Ngabire y’ukugororoka\n" +
                        "Yishwe nabo yaje gukiza\n" +
                        "Ku musaraba aho Yesu yapfuye\n" +
                        "Uburake bg’Imana buhwamitswe\n" +
                        "Icaha cose yagishizweko\n" +
                        "Murupfu rwiwe niho nibera\n" +
                        "3. Umubiri wishwe urahambga\n" +
                        "Muco w’isi wishwe n’umwiza\n" +
                        "Ku musi w’ubgiza, n’umenezero\n" +
                        "Arazuka aho yava mu mva\n" +
                        "Kuk’ahagaze mu kunesha\n" +
                        "Sinkir’umuja w’inkomezi z’icaha\n" +
                        "Kuko nd’uwiwe nawe n’uwanje\n" +
                        "Naguzwe n’amaraso ya Yesu\n" +
                        "4. Ntacagiriji, n’ubgoba bg’urupfu\n" +
                        "N’ubushobozi bga Kristo muri je\n" +
                        "Kuva mvutse naho nzopfira\n" +
                        "Yesu niwe herezo ryanje\n" +
                        "Nta kuzimu cank’umuntu\n" +
                        "Yonkura mu kuboko kwiwe\n" +
                        "Gushik’ agaruke canke mpfuye\n" +
                        "Nzoshikamishwa n’inkomezi za Kristo\n" +
                        "Bridge\n" +
                        "Ndonk’inkomezi\n" +
                        "N’ivyizigiro\n" +
                        "N’ugutabarwa\n" +
                        "Muri Kristo\n" +
                        "Ntewe n’ubgoba,\n" +
                        "Mu mwijima,\n" +
                        "Ndonk’amahoro\n" +
                        "Muri Kristo\n" +
                        "Ntanz’ubugingo\n" +
                        "Ntanze vyose\n" +
                        "Ndirimbira\n" +
                        "Kristo wenyene\n" +
                        "Mwami w’abami\n" +
                        "Mwami nkunda\n" +
                        "Juru rishima\n" +
                        "Kristo Gusa",
                        "Stuart Townend , Keith Getty"),
                new Cantique(70, "This Is Amazing Grace / BUNTU BUTANGAJE ", "1. Uwo nind’anesh’inguvu z’icaha\n" +
                        "Afis’inkomezi z’Urukundo nyinshi\n" +
                        "Mwami w’ubgiza, Aganj’abami bose\n" +
                        "Nind’anyiganza isi n’inkuba\n" +
                        "Akadusiga tumutangariye\n" +
                        "Mwami w’ubgiza, Aganj’abami bose\n" +
                        " R/ Buntu butangaje\n" +
                        "Rukundo ruhamye\n" +
                        "Aho wanyigura\n" +
                        "Kand’ukambambirwa\n" +
                        "Watanz’ubugingo\n" +
                        "Kugira mbohoke, ooh!\n" +
                        "Yesu ndirimba\n" +
                        "Ivyo wankoreye\n" +
                        "2. Nind’aseruka azany’urutonde\n" +
                        "Akab’umuvyeyi w’impfuvyi zose\n" +
                        "Mwami w’ubgiza, Aganj’abami bose\n" +
                        "Aganj’amahanga mu butungane\n" +
                        "Akanyangana kurush’izuba\n" +
                        "Mwami w’ubgiza, Aganj’abami bose\n" +
                        "Bridge\n" +
                        "Haberey’Umwagazi\n" +
                        "Yacumiswe n’Umwami yazutse (X3)\n" +
                        "Haberey’Umwagazi\n" +
                        "Arabereye!",
                        "Jeremy Riddle, Josh Farro, Phil Wickham"),
                new Cantique(71, "Grace so marvelous/ (U)BUNTU BW’IGITANGAZA ", "1. Rek’uyu mutima ushima\n" +
                        "Uhor’utakarira\n" +
                        "Mukuvuga ivyo wampaye vyose\n" +
                        "Rek’impwemu zanje\n" +
                        "Zikoreshwe zose\n" +
                        "Nishura ico ntabereye\n" +
                        " R/ Buntu bw’igitangaza\n" +
                        "Bwikwije bwidegemvya\n" +
                        "Ubgo burakwiye\n" +
                        "Kunkiza no kuncungura\n" +
                        "2. Rek’ikimazi cawe\n" +
                        "Name ndaciyumvira\n" +
                        "Kugira sinze nibagire\n" +
                        "Amaraso yawe\n" +
                        "Yaguz’ubuzima bganje\n" +
                        "Azokwam’ari ay’agaciro kambere\n" +
                        "3. Iri shimwe ryanje\n" +
                        "Name ndariririmba\n" +
                        "Gushika nkubonye munyonga\n" +
                        "Reka ryumvikane\n" +
                        "Mw’ijwi rinini cane\n" +
                        "Nshima ko nanje wankijije",
                        "Michael Farren, Rick Briscoe, Jordan, Stephen Miller"),
                new Cantique(72, " All to Us / VYOSE KURI TWE(BWE )", "1. Rutare Rwiza, Gitandara\n" +
                        "Mwizigirw’ibihe vyose\n" +
                        "Turakwiteze, ewe Yesu\n" +
                        "Niwe Vyose kuri Twe(bwe)!\n" +
                        "2. Mwana w’Imana yavuye mw’Ijuru\n" +
                        "Vyizigiro n’imbabazi\n" +
                        "Uri Vyose, Uri isezerano\n" +
                        "Yesu uri vyose kuri twe(bwe)!\n" +
                        "3. Ah’iyi si ihita izorangirira\n" +
                        "Tuzokubona mu nyonga\n" +
                        "Ibihe vyose tuzoguhimbaza\n" +
                        "Yesu Uri Vyose kuri Twe(bwe)\n" +
                        " R/ Rek’ubgiza bg’Umwami bub’ishaka ry’ishengero\n" +
                        " Rek’ukugororoka kub’urubeya rwaka\n" +
                        " Urukundo rukiza rub’urugezo rwacu\n" +
                        " Twizera kw’ari Wewe Vyose\n" +
                        "Vyose kuri Twe(bwe)! (x3)\n" +
                        "Ni wewe",
                        "Chris Tomlin, Jesse Reeves, Matt Maher, Matt Redman"),
                new Cantique(73, "Jesus at the center of it all/ YESU MUSHINGE WA VYOSE", "1. Yesu ur'uwambere\n" +
                        "Muri vyose vyo muriyi si\n" +
                        "Ntango n'iherezo,\n" +
                        "Vyose vyamyeho,\n" +
                        "Biriho kubgawe Yesu, Yesu\n" +
                        " R/ Ntakindi c'agaciro\n" +
                        "Mw'isi Ntawundi nkawe\n" +
                        "Ivyaremwe vyose\n" +
                        "Biriho kubgawe Mwami\n" +
                        "Yesu, uuu\n" +
                        "Wew ur'uwambere\n" +
                        "Wew ur'uwambere\n" +
                        "2. Yesu nub'uwambere\n" +
                        "Mu buzima bwanje bwose\n" +
                        "Ntango n'iherezo\n" +
                        "Vyose vyamyeho,\n" +
                        "Biriho kubgawe Yesu, Yesu\n" +
                        "R/...\n" +
                        "3. Yesu nub'uwambere\n" +
                        "No mw' ishengero ryawe, amav'apfukame\n" +
                        "Indimi zose zature Wewe Yesu\n" +
                        "Yesu, yesu, yesu\n" +
                        "Bridge\n" +
                        "Murije no mumajuru\n" +
                        "Yesu ur'uwambere\n" +
                        "Nta wundi nkawe\n" +
                        "Ooh nta wundi nkawe\n" +
                        "R/...",
                        "Adam Ranney, Israel Houghton, Micah Massey"),
                new Cantique(74, "Christ is enough/ KRISTO ARAMPAGIJE", "Kristo niwe mpera Yanje\n" +
                        "Niwe niha wese\n" +
                        "Ubu ntakiriho mur’iyi si\n" +
                        "Cokwigera kimpaza\n" +
                        "Mubingora\n" +
                        "Nzoririmba\n" +
                        "Simpindukira\n" +
                        "Narabohowe\n" +
                        " R/ Kristo niwe vyose\n" +
                        "Kandi arampagije\n" +
                        "Vyose nkeneye ni Wewe\n" +
                        "Uri vyose nkeneye\n" +
                        "Kristo ni vyose muri vyose\n" +
                        "N’umunezero wanje\n" +
                        "Niwe vyizigiro bihoraho\n" +
                        "Mwijuru niho iwacu\n" +
                        "Mubihuhusi\n" +
                        "Nzoririmba\n" +
                        " (Nti)Yesu nihari\n" +
                        "Icubahiro n’ic’Imana\n" +
                        "Je nahisemwo kub’uwa Yesu\n" +
                        "Sinshobora kumuvako\n" +
                        "Ndab’umusaraba\n" +
                        "Nsiz’isi inyuma\n" +
                        "Sinshobora kumuvako\n" ,
                        "Jonas Myrin, Ruben Morgan"),
                new Cantique(75, "Only Jesus/ YESU GUSA ", "1. Ntuhinduka mubibazo\n" +
                        "Unyobora murugendo\n" +
                        "Ur impamba mubihe vyose\n" +
                        "Yesu niwe gusa\n" +
                        "R/Umutima ushaka wewe gusa (X2)\n" +
                        "Ubutunzi bgisi ntibgompaza namba\n" +
                        "Umutima ushaka wewe\n" +
                        "Yesu\n" +
                        "2. Ungarura nazimiye\n" +
                        "Waranaguye niwe buzima\n" +
                        "Buri musi mubihe vyose\n" +
                        "Yesu niwe gusa\n" +
                        "R/\n" +
                        " - Yesu Yesu we we gusa (/3)",
                        "Jason Ingram, Hank Bentley & Joel Tayloro"),
                new Cantique(76, "Crowns (My wealth is in the cross) / UBUTUNZI", "#.1 Harumusozi nkunda washinzwe kw’igiti\n" +
                        "Kimenyetso c agakiza I Kaluvali\n" +
                        "Es’inyungu je ndonka\n" +
                        "Mukubambga kwiwe\n" +
                        "Aho yakw’ubuzima narabugabiwe.\n" +
                        "Chorus:\n" +
                        "Uyo musaraba niwo butunzi mfise\n" +
                        "Meny’urukundo rwiwe ndamuh’umutima\n" +
                        "Vyose n’ubuhombe ibitsibo vyanj’ubu ntaco bivuze\n" +
                        "Naraharuy’ikiguzi Uyo musaraba nivyose.\n" +
                        "#.2 Sinzirat’ubutunzi canke inzahabu\n" +
                        "Nzirat Umwami Yesu\n" +
                        "Hamwe n’izina Ryiwe\n" +
                        "#.3 Igihe nzorenguka\n" +
                        "Imbere y’Umwami\n" +
                        "Nshiz’ibitsibo hasi\n" +
                        "Nirat’umusaraba",
                        "Benjamin Hastings, Michael Fatkin, Scott Groom"),
                new Cantique(77, "Knowing you Jesus/ KUKUMENYA YESU", "1. Ivyo nishimira\n" +
                        "Nubakiyeko\n" +
                        "Ivy isi ikunda\n" +
                        "Kand’inrwanira\n" +
                        "2. Ivyari inyungu\n" +
                        "Vyahindutse ubusa\n" +
                        "Ntaco bikimaze\n" +
                        "Ugereranije\n" +
                        "R/kukumenya yesu kukumenya\n" +
                        "Ntakibiruta\n" +
                        "Umbera vyose,uri mwiza\n" +
                        "We munezero, nukugororoka\n" +
                        "Ndagukunda mwami\n" +
                        "Non’ico nifuza\n" +
                        "Nukukumenya rwose\n" +
                        "Nisange muriwe\n" +
                        "Menywe nawe\n" +
                        "Ndonswe mu kwizera\n" +
                        "Ico ntabereye\n" +
                        "Ingabire y’iruta vyose\n" +
                        "Y’ukugororoka\n" +
                        "Menye ubushobozi\n" +
                        "Bwizuka ryawe\n" +
                        "Nkumenye no mu\n" +
                        "Mumibabaro\n" +
                        "Nshushanywe mu rupfu\n" +
                        "Rwawe mwami\n" +
                        "Ngo mbe muri wewe\n" +
                        "Ibihe vyose",
                        "Graham Kendrick"),
                new Cantique(78, "Lead me to the cross / NSHITSA KU MUSARABA", "1. Mwami ndaje\n" +
                        "Numutima utuje,\n" +
                        "nibuka\n" +
                        "Wa musozi\n" +
                        "(Aho) washeshe amaraso\n" +
                        "Ngo uncungure\n" +
                        "Vyose vyamber’inyungu\n" +
                        "Vyahinduts ubusa\n" +
                        " R/ Nshitsa ku musaraba\n" +
                        "Wurukundo rwawe\n" +
                        "Uncishe bugufi\n" +
                        "Ndakwihay mwami\n" +
                        "Ndekuye ivyanje\n" +
                        "Ngo mbe uwawe wese\n" +
                        "Undongore\n" +
                        "Ku musaraba\n" +
                        "2. Waje usa nkanje\n" +
                        "Urageragezwa\n" +
                        "Nk'umuntu\n" +
                        "Wambar’umubiri\n" +
                        "Unesh’ icaha\n" +
                        "N’urupfu urazuka\n" +
                        "Vyose vyamber’inyungu\n" +
                        "Vyahinduts’ubusa",
                        "Brooke Ligertwood"),
                new Cantique(79, " I surrender / NDAKWIHAYE  ", "1. Ndihano ku mavi ndakwiha\n" +
                        "Nkwegurira ivyanj vyose\n" +
                        "Ndonderera hano nkwiyegereza\n" +
                        "Kunywana nzw nico kizany\n" +
                        "Bridge\n" +
                        "Ndakwihaye\n" +
                        "Twar'uyumushaha n'uruzi rw'imbabazi\n" +
                        "Ndakwifuza\n" +
                        "Ndakunyotewe\n" +
                        "2. Eh'ay amaboko\n" +
                        "Umv'ir isengesho\n" +
                        "Vuga Mwami icungombako\n" +
                        "\n" +
                        "R/Ndakwihaye/2x\n" +
                        " Nshaka kukumenya/2x\n" +
                        "Bridge\n" +
                        "Nkacagihinda Yesu humeka\n" +
                        "Muri jewe korico wifuza\n" +
                        "Nkigihuhusi ngwin'unyiganz muri jewe korico wifuza.",
                        "Matt Crocker"),
                new Cantique(80, "Come fill my heart / NGWINO UNYUZURE ", "1.Ngwino unyuzure\n" +
                        "Umurikire mu mwijima\n" +
                        "Numpaze mazunagure\n" +
                        "Ndagukeneye ngunkize\n" +
                        "R/\n" +
                        "Ing’unkize inyota\n" +
                        "Nditeguye mwami\n" +
                        "Ndi imbere yawe\n" +
                        "Nunyuzure\n" +
                        "Ni wewe gusa\n" +
                        "Womar’inyota\n" +
                        "Ndi imbere yawe\n" +
                        "N’ unyuzure\n" +
                        "2.Nuze muri je\n" +
                        "Maz’unyuzure\n" +
                        "Unyuzuze rwa rukundo\n" +
                        "Ni wewe gusa jewe nkeneye\n" +
                        "Undutire ibindi vyose",
                        "BRUCE STEVENS, LANETTE W. CRUTE, TIFFANY\n" +
                                "DEONNA MARTIN"),
                new Cantique(81, "I will bow to you / NZUNAMIRA by Women of faith ", "1. Nta yindi Mana\n" +
                        "Nzunamira\n" +
                        "Atari wewe\n" +
                        "Nta cakozwe n'abana b’abantu\n" +
                        "Nzohimbaza\n" +
                        "R/Nziyambura ibigirwamana\n" +
                        "Nivyo nashize ku ngoma\n" +
                        "Nivyo vyose vyantway’umutima\n" +
                        "Nta yindi Mana nzunamira\n" +
                        "Ni wewe gusa",
                        "Pete Episcopo"),
                new Cantique(82, " Gracefully broken/ NJANJAGUWE MU BUNTU ", "Igitero ca 1\n" +
                        " Akir'ivyo mfise vyose\n" +
                        "Unyagure, ungwize impande zose\n" +
                        "Maz'umutima wanje ub'ikimazi\n" +
                        "Mvugutira, mvugutira\n" +
                        "Refrain\n" +
                        "Ndi hano, Mwami\n" +
                        "Ntez'ibiganza\n" +
                        "Nsuts'ubugingo\n" +
                        "Njanjaguwe mubuntu\n" +
                        "Igitero ca 2\n" +
                        "Umutima ushinzwe kuri wewe\n" +
                        "Urukundo rwawe rwama ruhangamye\n" +
                        "Uzoshits'ivy'ungombako vyose\n" +
                        "Ntabw'uzonta\n" +
                        "Uzobana nanje\n" +
                        "Bridge\n" +
                        "Nguhaye vyose x2\n" +
                        "Ntaco nsigaje x2\n" +
                        "Ndakwihaye\n" +
                        "Kuk'ukorera muri je\n" +
                        "Unjanjagurira mu buntu\n" +
                        "Mu ntege nke mba nkomeye\n" +
                        "Nzidegemvya",
                        "Matt Redman, Katie Torwalt, Jonas Myrin, Bryan Torwalt, Tasha\n" +
                                "Cobbs"),
                new Cantique(83, " Restore My Soul / N’UNAGURE  ", "1. N’unagur’ unkangure\n" +
                        "Ngira musha muri vyose\n" +
                        "Nyerek’ icaha cihishije\n" +
                        "Ungarukane ku musaraba (X2)\n" +
                        " R/ Ku musaraba, mparonk’inzira\n" +
                        "Yo kubaho nkuk’uvyifuza\n" +
                        "Mwami Hansange, umfashe kuguma\n" +
                        "Mu kukwumvira, muri vyose Mukiza\n" +
                        "2. Cana wa muriro, wahora waka cane\n" +
                        "Unyibuts’ ivyo wakoze\n" +
                        "Cipfuzo canje n’uguhindurwa\n" +
                        "Ungarukane ku musaraba",
                        "Rozier Andi"),
                new Cantique(84, "I’m not alone/ SINDI JENYENE ", "1. Iyo ngendera mu mazi menshi\n" +
                        "Ndazi k'uzobana nanje\n" +
                        "Iyo mpagaze mu muriro\n" +
                        "Ndazi yuko ntazosha\n" +
                        "Mu mwonga w'umwiza mwinshi\n" +
                        "Sinzotinya\n" +
                        " R/ Sindi jenyene (×2)\n" +
                        "Ni wew'uzondongora\n" +
                        "Ntuzontererana\n" +
                        "2. Iyo ndi mumubabaro mwinshi\n" +
                        "Mbona umuco waw’urasa\n" +
                        "Umwijima ntuzondengera\n" +
                        "Mpungira kuri Wewe\n" +
                        "Mwami ungwanira intambara\n" +
                        "Kandi sinzotinya\n" +
                        "R/\n" +
                        "Bridge\n" +
                        "Urantangaza\n" +
                        "Urankiza\n" +
                        "Unyit’uwawe (×3)\n" +
                        "3. Nkomezi\n" +
                        "Uranrwanira\n" +
                        "Bgihisho mu mipfunda\n" +
                        "Mu bibazo Wam’\n" +
                        "umber’umwizigirwa\n" +
                        "Ukiz’umutima wanje",
                        "Austin Davis / Ben Davis / Dustin Sauder / Grant Pittman / Kari Jobe / Marty\n" +
                                "Sampson / Mia Fieldes"),
                new Cantique(85, ". Jesus the Son of God and I press/MWANA W’IMANA&NDAKOBEJE", "A. Jesus the Son of God /MWANA W’IMANA\n" +
                        "1. Nind’ashobora\n" +
                        "Kugendagenda\n" +
                        "Ku Kiyaga (X2)\n" +
                        "Yesu Mwana w’Imana\n" +
                        "R/Nshigikira,\n" +
                        "Nshikame\n" +
                        "Mwami ndizeye\n" +
                        "K’unshoboza\n" +
                        "Tugendane\n" +
                        "Ntundekure\n" +
                        "Yesu Mwana w’Imana\n" +
                        "Bridge\n" +
                        "Mbeg’urizera Yesu\n" +
                        "Ego (X3)\n" +
                        "Yaranteruye anshira ku rutare\n" +
                        "B. I Press / NDAKOBEJE\n" +
                        "Ndakovya mu gusiganwa mumuhamagaro urut’iyindi.\n" +
                        "Ndakobeje gushikir’intumbero\n" +
                        "Yayo Ndakobeje\n" +
                        " R/ Nibagir’ibir’inyuma yanje\n" +
                        "Nkagumbir’ivy’ibihe bidashira\n" +
                        "Ndakobeje gushikir’intumbero\n" +
                        "Yayo Ndakobeje\n" +
                        "Bridge\n" +
                        "Oya Sinzoreka (X4)\n" +
                        "Ndakobeje gushikir’intumbero\n" +
                        "Yayo Ndakobeje",
                        "1. NQUBEKO MBATHA, LINDELANI MKHIZE, NTOKOZO\n" +
                                "MBAMBO\n" +
                                "2. Diedericks Nevill"),
                new Cantique(86, "Give me faith / MP’UKWIZERA", "1. Ngukeneye ng’unyorosh’umutima\n" +
                        "Uwumenagure\n" +
                        "Ngukeneye, unyugurur’amaso\n" +
                        "Menye k’urik’ urampingura\n" +
                        "Pre- Chorus\n" +
                        "Nico ndi cose\n" +
                        "Ndakwihaye\n" +
                        "2. Ngukeneye ng’unyorosh’umutima\n" +
                        "Uwumenagure\n" +
                        "Ngukeneye ng’umurike mumwijima\n" +
                        "Kandi untunganye wese\n" +
                        "Pre- Chorus\n" +
                        "Nico ndi cose\n" +
                        "Ndakwihaye\n" +
                        " R/ Mp’ukwizera ivy’uvuga vyose\n" +
                        "K’uri mwiza kand’unkunda cane\n" +
                        "Ndananiwe nguhay’ubuzima\n" +
                        "Bridge\n" +
                        "Nobur’ inkomezi\n" +
                        "Mpwem’akanshoboza\n" +
                        "Nonanirwa\n" +
                        "Uzoneshereza",
                        "Christopher Joel Brown / London Weidberg Gatch / Mack Donald Iii Brock /\n" +
                                "Wade Joye"),
                new Cantique(87, "Running/ DUSIGANIRWA", "1. Turahagaze twiteguye\n" +
                        "Dushiz’amaso ku bizoza\n" +
                        "Ahobose bazatur’izina Ryawe\n" +
                        "Dukovya kubg’ubguwo musi\n" +
                        "Ntituzohagarika (X2)\n" +
                        "2. Turiyambuy’amakosa\n" +
                        "N’ibitwitambik’imbere\n" +
                        "Mug’igikizogukwamaho\n" +
                        "N’umwete kubgawe\n" +
                        "Turiko turasiganwa\n" +
                        "Ntituzohagarika (X4)\n" +
                        " R/ Dusiganirwa\n" +
                        "Dukurikir’ic’uri cose\n" +
                        "Turasiganwa\n" +
                        "Kuko ico uri\n" +
                        "Nico twifuz’ubu.\n" +
                        "3. Mu ntambuko yose y’ukwizera\n" +
                        "Dushobozwa n’ubuntu bgawe\n" +
                        "Twikorey’umusaRaba tudatinya\n" +
                        "Dutanze vyose kubgawe\n" +
                        "Ntituzohagarika (X2)\n" +
                        "Bridge\n" +
                        "Wo wa wo wo wo-o (x3)\n" +
                        "Twegerey’umuco wawe\n" +
                        "Turondera kukumenya rwose\n" +
                        "Duhazwa n’ukwitegereza\n" +
                        "K’urukundo Rwawe",
                        "Matt Crocker / Scott Ligertwood"),
                new Cantique(88, " The River/Ku Ruzi", "1. Ndi mu nzir'ija ku ruzi\n" +
                        "Nzany’ivyaha binanije\n" +
                        "Ngwin'unyeze, umbabarire\n" +
                        "Nipfuza guhura nawe\n" +
                        "2. Har'imbabazi zibohora\n" +
                        "N'umwidegemvyo, kubihebuye\n" +
                        "Ndi mu nzira, ngan’urwo ruzi\n" +
                        "Nifuza guhura nawe\n" +
                        "R/Yesu Mwiza, nditeguye\n" +
                        "Kurekur'ibingoye\n" +
                        "Mfat'ukuboko, undongore\n" +
                        "Nipfuza guhura nawe.\n" +
                        "3. Ni muze mwese, mur’urwo ruzi\n" +
                        "Muronk’ubuzima busha\n" +
                        "Arahamagara, arakwiteze\n" +
                        "Yipfuza guhura nawe",
                        "Brian Eno"),
                new Cantique(89, "Lord, have mercy/ NGIRIRA IMBABAZI ", "1. Yesu naribagiye amajambo wavuze\n" +
                        "Amasezerano yankomezayatakaj’uburyohe\n" +
                        "Mbitewe n’ugukekeranyanakurikiy’ubgenge bgisi\n" +
                        "Mparir’ukutizera maze wonger’unyatse\n" +
                        " R/ Mwami wanje\n" +
                        "Kristo aganje\n" +
                        "Ngirir’imbabazi (X2)\n" +
                        "2. Nubats’igicaniro nseng’ ivy’abantu bahurumbira\n" +
                        "Nafash’ingendo zinjana kure yawe\n" +
                        "Ngarutse ku mbabazi zawe zihora zitemba\n" +
                        "Mparir’ivyaha umfashe\n" +
                        "Kwongera kugukunda\n" +
                        "3. Narifuje kukumenya n’imbabazi utanga\n" +
                        "Nk’uruzi rw’uguharira rutemba rudakama\n" +
                        "Mpfukamy’imbere yawe murukwo kugiraneza\n" +
                        "N’Ubuntu bgama burashe\n" +
                        "Nk’itara mw’ijoro",
                        "Luis Resto / Curtis Jackson / Marshall B. Mathers Iii / Jeffrey Bass / Steven\n" +
                                "King / Darryl Richardson Ii"),
                new Cantique(90, " Nasempini and Wangilelwa (as one song)", "A. Nasempini /NIWE NKINZO\n" +
                        "1. Naho noca mu\n" +
                        "Mwiza w’igitutu c’urupfu\n" +
                        "Sinzotinya kuko\n" +
                        "Yesu n’urutare rwanje\n" +
                        " R/ Niwe nkinzo mu ntambara\n" +
                        "N’umunara mpungirako\n" +
                        "Niwe nkinzo mu ntambara\n" +
                        "N’agatutu nduhukiramwo\n" +
                        "2. Yesu n’urutare Ruhoraho\n" +
                        "Kandi vyongeye\n" +
                        "Niwe nzohora\n" +
                        "Nihishamwo\n" +
                        "B. Wangilwela/ YARANGWANIYE by Joyous Celebration\n" +
                        "1. Ewe Yesu waranesheje\n" +
                        "Ni Wewe uri nyen’ intsinzi (X2)\n" +
                        " R/ Waranrwaniye Yesu\n" +
                        " Uri Nyen’intsinzi\n" +
                        " Waranrwaniye Yesu\n" +
                        " Waranesheje\n" +
                        "2. Oh Yesu Nyen’ushobozi\n" +
                        "Muriyi si ntawonganya nawe (X2)\n" +
                        "Bridge\n" +
                        "Mwana w’Imana\n" +
                        "Nyenyeri y’amahoro\n" +
                        "Rutare rw’amahanga\n" +
                        "Ndakwizigiye rwose\n" +
                        "Mwana w’Imana\n" +
                        "Nyenyeri y’amahoro\n" +
                        "Rutare rw’amahanga\n" +
                        "Waranrwaniye",
                        "Ntzani Ayanda ,Sibongiseni Mbehele, Spirit of\n" +
                                "Praise"),
                new Cantique(91, "Face to face/ UBWIZA BWAWE", "1. Muriki kibanza\n" +
                        "Uyu niwo mwanya\n" +
                        "N’uvuge\n" +
                        "Nd’imbere yawe\n" +
                        "Nd’iminwe misa\n" +
                        "Ndakurondera\n" +
                        "2. Bino bihome\n" +
                        "Biruhiye gusenyuka\n" +
                        "Ntaco dutanduKanya hagati yacu\n" +
                        "Mpebey’umutima\n" +
                        "Mu buntu Bgawe\n" +
                        " R/ Ndakwegereye\n" +
                        "Kurut’uko nigeze\n" +
                        "Waranyihanganiye\n" +
                        "Ubu ndagarutse\n" +
                        "Yesu\n" +
                        "Ndaretse kwirwanira\n" +
                        "Ubu nshaka we gusa\n" +
                        "3. Nkir’ubgoba\n" +
                        "Mpumurijwe nawe\n" +
                        "Ubgiza Bgawe\n" +
                        "Bumar’ isoni\n" +
                        "Ubu nemejwe\n" +
                        "Ko nkeneye we gusa\n" +
                        "Extended chorus\n" +
                        "1. Ur’umwizigirwa\n" +
                        "Wam’unyakira\n" +
                        "Umutim’ ugushime\n" +
                        "Mana, mugabane wanje\n" +
                        "Yesu\n" +
                        "Ndaretse kwirwanira\n" +
                        "Ubu nshaka we gusa\n" +
                        "2. Ndabon’\n" +
                        "Ubgiza Bgawe\n" +
                        "Urangumbira\n" +
                        "Mu Rukundo\n" +
                        "Iyo ntoneshejwe\n" +
                        "Menyako\n" +
                        "Nkunzwe na Yesu (x2)\n" +
                        "Nanje nguhaye\n" +
                        "Ishimwe rikwiye\n" +
                        "Nzoguhimbaza\n" +
                        "Ibihe vyose\n" +
                        "Nkwitegereje\n" +
                        "Menyako\n" +
                        "Ari wewe nkeneye",
                        "Steph Ling & Mitch Wong"),
                new Cantique(92, "Close R/ TWEGERE AHO URI ", "1) Ntabuzima ntagufise\n" +
                        "Ufise vyose dukeneye\n" +
                        "Ahur'ubwoba burahera\n" +
                        "Kand'umwijim'urahunga\n" +
                        " R/Tweger’aho uri, dushaka kukumenya\n" +
                        "Nivyo turondera\n" +
                        "Hano mubwiza bwawe, twipfuz’I bgina mumuco wawe,\n" +
                        "Igaragaze\n" +
                        "2) Ntanumwe ahwanye nawe\n" +
                        "Wewe gus'urahagije\n" +
                        "Umutima wawe wam'ukinguye\n" +
                        "Turarengerwa murukundo rwiwe\n" +
                        "Bridge\n" +
                        "Tuzokwirukirako\n" +
                        "Muri we twumva twakiriwe\n" +
                        "Duhazwa murukundo rwawe",
                        "Braden Lang, Jason Ingram, Joel Davies, Ruben\n" +
                                "Morgan"),
                new Cantique(93, " Lord Make Me Pure in Heart/ NYEZA MU MUTIMA", "1) Ndazi inzira imwe yotuma nezwa\n" +
                        "Ni mumaraso yawe\n" +
                        "Yawe gusa\n" +
                        "Nunyuzuz'ukwizera n'ubuntu ngo mbone\n" +
                        "Ivyiza vyurukundo rwawe rwinshi\n" +
                        "R/Mwami nyeza mumutima\n" +
                        "Mp'ubuzima bg’ubwizigirwa n’ukuri\n" +
                        "Iy’undavy'umbonemwo ukugororoka kwawe\n" +
                        "Mwami nyeza mumutima",
                        "Lenny LeBlanc"),
                new Cantique(94, "All for You/ VYOSE NIVYAWE", "1) Mu ntambwe yose y’ukwizera\n" +
                        "Nikimazi cose\n" +
                        "Isengesho ryose\n" +
                        "Riva mumutima wukuri\n" +
                        "Niwe gusa ubereye\n" +
                        "Ugutazirwa kwose\n" +
                        "Nifuza kuvuga ukuntu uhambaye\n" +
                        " R/Indirimbo yose y’ishimwe\n" +
                        "Ibiganza vyose bidugije\n" +
                        "Ico ndi cose\n" +
                        "Ivyo nkora vyose\n" +
                        "Vyose nivyawe nivyawe\n" +
                        "2) Nshaka kukubgira\n" +
                        "Ko Yesu ur'umuhizi\n" +
                        "Nuzuy’ishimwe\n" +
                        "Kuko wacunguye\n" +
                        "Ivyaremwe biririmbe\n" +
                        "Isi iguhimbaze\n" +
                        "Kuva mumajuru\n" +
                        "N’i bgina mubiyaga\n" +
                        " R/",
                        "BALOCHE PAUL JOSEPH, LE BLANC\n" +
                                "LEONARD J"),
                new Cantique(95, "All my ways are known to you/ INZIRA ZANJE", "1. Mu bihe mba ntuje ntekanye\n" +
                        "Mu gupfusha cank' ubunyakamwe\n" +
                        "Ijambo n’ukuri ntunga, nkena\n" +
                        "Yukw' inzira zanje zose uzizi\n" +
                        "2. Ntacangeragejeutarekuye\n" +
                        "Ntaho noca Atari integuro yawe\n" +
                        "Niyo imbere yanje hatabona\n" +
                        "Inzira zanje zose urazizi\n" +
                        " R/ Mbeg'amahoro naronse aho noba ndi hose\n" +
                        "Kw'inzira zanje zose uzizi\n" +
                        "Haleluya uzizi zose\n" +
                        "3. Ntabwo ntinya aho nzopfira\n" +
                        "Kuk'urupfu n’inzira y’ubuzima\n" +
                        "Umfat'ukuboko uhancishe\n" +
                        "Kukw'inzira zanje zose uzizi\n" +
                        "Bridge\n" +
                        "Mpumur' amaso maze mbone\n" +
                        "Ko wampitiyemw’inzira\n" +
                        "Mpumur'amaso maze mbone\n" +
                        "Ko wewe Mana ugendana nanje\n" +
                        "R/",
                        "Jonny Robinson, Rich Thompson,Michael Farren, Dustin\n" +
                                "Smith"),
                new Cantique(96, "Christ is mine/ KRISTO N’UWANJE ", "1. Imana yampaye iminsi yo kubaho\n" +
                        "Ngo nze ngendane nayo\n" +
                        "Ariko ndonder’ ubutunzi bwisi\n" +
                        "Nibagir’ umwami w’abami\n" +
                        "None ndizigira umucunguzi\n" +
                        "Naho nogwa we ntahinduka\n" +
                        "Kristo yarish’ikiguzi caho nanirwa\n" +
                        "Nduwiwe ibihe vyose\n" +
                        "2. Ngir’amarira n’umubabaro\n" +
                        "Nkaca mumwiza mwinshi\n" +
                        "Ngategerezwa guca mu mwonga\n" +
                        "Aho ata ciza mbona\n" +
                        "Ariko Yesu amp’amahoro\n" +
                        "N’inkomezi iyo naniwe\n" +
                        "Imibabaro yanje siy’ubusa\n" +
                        "NaKristo ashitsa igikorwa ciwe\n" +
                        "3. Mbayeho nk’inyambukira\n" +
                        "Nd’ingenzi mu nzira ipfunganye\n" +
                        "Ndikumwe naKristo nzohora mbona\n" +
                        "Guhamwa kubg’izina ryiwe\n" +
                        "Ariko muriyi nrwano mfise\n" +
                        "Inkinzo imfasha kutaneshwa\n" +
                        "Yavuze yuko azonshikana\n" +
                        "Impore iyo mw’ijuru\n" +
                        "Nzinjiramumurwa I Siyoni\n" +
                        "Nzoba ndi kumwe n’Umwami\n" +
                        "Kubgivyo narons’ubutunzi\n" +
                        "Kristo nuwanje ibihe vyose\n" +
                        " R/ Nezerwa mushaha wanje\n" +
                        "(U) rukundo rwiwe n’impera yanje\n" +
                        "Ntabwoba, mfise ivyizigiro\n" +
                        "Kristo nuwanje, ibihe vyose",
                        "Jonny Robinson | Rich Thompson"),
                new Cantique(97, "God Is for Us / MU RUHANDE RWACU", "1. Ntituzotinya intambara\n" +
                        "Canke mw’ijoro\n" +
                        "Tuzoca mu mwonga\n" +
                        "Uri kumwe natwe\n" +
                        "Uzotuja imbere\n" +
                        "Utwereke inzira\n" +
                        "Ur’ubwihisho bwacu\n" +
                        "Niwe wenyene ukiza\n" +
                        "Ririmba nezerwa\n" +
                        "Iri kumwe natwe\n" +
                        "Urukundo rwa Data\n" +
                        "N’ubwihisho bukomeye\n" +
                        "Duz’ijwi uvuge\n" +
                        "Ko ata rukundo nk’uru\n" +
                        "Ninde yoturwanya\n" +
                        "Imana iri ku ruhande rwacu\n" +
                        "2. Naho ntsitara\n" +
                        "N’igihe ntemba \n" +
                        "Nsubiy’inyuma\n" +
                        "Ntureka kunkunda\n" +
                        "Ntaziger’umpeba,\n" +
                        "Kandi kutazonta\n" +
                        "Uzompa kubandanya\n" +
                        "Mubuntu budahera\n" +
                        "Bridge\n" +
                        "Nta kintu na kimwe\n" +
                        "Codutandukanya\n" +
                        "Satani n’urupfu ntibizodutsinda\n" +
                        "Uwatanze umwana ngw’atubohore\n" +
                        "Amfise mu rukundo rwiwe",
                        "Michael Farren, James Ferguson, Tiarne Kleyn, Jesse Reeves, Jonny Robinson,\n" +
                                "James Tealy, Rich Thompson"),
                new Cantique(98, "He Has Won /YARANESHEJE", "1. Yemwe abarushe n' abaremerewe\n" +
                        "Haje ivyizigiro\n" +
                        "Abumva uburemere bw'umutima umenetse\n" +
                        "Haje ivyizigiro\n" +
                        "Pre-chorus\n" +
                        "Unamura amaso\n" +
                        "Mumwitegereze\n" +
                        "Ubushobozi bw'icaha bwakuweho\n" +
                        "R/\n" +
                        "Yaranesheje\n" +
                        "Urupfu rwarakuweho n’intsinzi\n" +
                        "Biciye mu mwana w’Imana,\n" +
                        "Sinkigumye mu mva nk’imbohe\n" +
                        "Nivyo yaranesheje\n" +
                        "2. Yemwe abifuza urukundo rw’umuvyeyi atunganye\n" +
                        "Haje ivyizigiro\n" +
                        "Ku bitegereza umuco w'umukiza yazutse\n" +
                        "Haje ivyizigiro\n" +
                        "Bridge\n" +
                        "Yesu yaraje 2*\n" +
                        "Semerera 2*\n" +
                        "Yaranesheje 2*\n" +
                        "Semerera 2*",
                        "Vertical Church Band"),
                new Cantique(99, "I'd Rather Have You/ UBIRUSHA AGACIRO ", "1. Imisozi izokurwaho\n" +
                        "Ubutunzi buzohera\n" +
                        "Ivyiza vyo muriyi si\n" +
                        "Bihambanwa n' abami bavyo\n" +
                        "Mw’isi s’iwacu\n" +
                        "Yuzuye ubwibone n' ukwikunda\n" +
                        "Yesu uri vyose\n" +
                        "Uri vyose nkeneye\n" +
                        "Urusha agaciro vyose (X2)\n" +
                        "Ntaco nokwipfuza\n" +
                        "Cogereranywa n' ivyo mfise muri wewe\n" +
                        "Ubutunzi nahisemwo\n" +
                        "N'ubutunzi bwamaho\n" +
                        "K’ ubirusha agaciro\n" +
                        "Bridge\n" +
                        "Mparira kuvyipfuzo\n" +
                        "N’impamvu zihishije\n" +
                        "N’intumbero zanje\n" +
                        "Sinshaka ibitari mubugombe bgawe\n" +
                        "Ntavyo nkeneye\n" +
                        "Ubu ndakwihaye\n" +
                        "K’ubirusha agaciro",
                        "Jon Reddick & Tommee Profitt"),
                new Cantique(100, "Come to the Altar/ NGWINO KU GICANIRO", "1.Woba ubabaye, ukomeretse\n" +
                        "Uremerewe n’icaha cawe\n" +
                        "Yes’ati: Ngwino\n" +
                        "Wob’ugezaho wihebura?\n" +
                        "Unyotewe amazi yo kwiriba\n" +
                        "Yes’ati: Ngwino\n" +
                        " R/ O ngwino kugicaniro\n" +
                        "Data agutez’amaboko\n" +
                        "Ikimazi c’imbabazi\n" +
                        "Mu maraso ya Kristo Yesu\n" +
                        "2. Sig’ivyaha vyawe inyuma\n" +
                        "Nta mvo nimwe yo kurindira\n" +
                        "Yes’ati Ngwino\n" +
                        "Muzanire iyo mibabaro\n" +
                        "Uyiguze n'umunezero\n" +
                        "Yes’ati Ngwino\n" +
                        "Bridge\n" +
                        "Mbega umukiza\n" +
                        "Mwiza ahebuje\n" +
                        "Ririmba Hallelluya, Kristo yazutse\n" +
                        "Mumwunamire\n" +
                        "N'umwami w'abami\n" +
                        "Ririmba hallelluya, yarazutse\n" +
                        "Ihangan’urindiriy’impera\n" +
                        "Wamamaze k’uri umuhirwe",
                        "Christopher Brown / Wade Joye / Steven Furtick / Mack\n" +
                                "Brock"),
                new Cantique(101, " Come Ye Sinners/ MU MABOKO Y’UMUKIZA ", "1. Ngwino banyavyaha bumva bagowe\n" +
                        "Bakomeretse barwaye\n" +
                        "Yes’ ari hano ngo abakize\n" +
                        "N’urukundo n’ubushobozi\n" +
                        "2. Abanyotewe ngwino kw’iriba\n" +
                        "Aha niho mugirirwa neza\n" +
                        "Ukwizera n’ukwihana\n" +
                        "N’ubuntu bginshi bubegereza\n" +
                        " R/ Nzohaguruka nje kuri Yesu\n" +
                        "Azongumbira nk’uwiwe\n" +
                        "Mumaboko y’Umukiza\n" +
                        "Har’ubuzima budashira\n" +
                        "(Ur’ ubuzima budashira)\n" +
                        "3. Ngwino wew’uremerewe\n" +
                        "Wazimiye wononwa n’icaha\n" +
                        "Niwarindira ng’ube mwiza\n" +
                        "Ntuziger’uza, eka na mba\n" +
                        "Bridge\n" +
                        "Ntawe mfise nkawe\n" +
                        "Mfise nkawe\n" +
                        "Oya Sinzo\n" +
                        "Hindukira (X4)",
                        "Ingram Jason / Smith Jonathan Lindley / Eddie Hoagland / Miller\n" +
                                "Tyler"),
                new Cantique(102, "Rescue R/ UMUTABAZI ", "1. Har’inkuru nziza kuwuboshwe\n" +
                        "N’uwukozwe n’isoni\n" +
                        "Inkuru nziza ku wangaye\n" +
                        "No kubg’uwukekeranya\n" +
                        "Kuwuremerejwe nivy’idini\n" +
                        "Umwami yazanywe no kudukiza\n" +
                        "R/Niwe mutabazi (X2)\n" +
                        "Twabohow’icaha ibihe vyose\n" +
                        "Biraryoshe kwumva\n" +
                        "N’ubuntu burengeje\n" +
                        "Tuzoshim’Imana niwe mutabazi\n" +
                        "2. Niwe bgiza kuwuhumye\n" +
                        "Ubutunzi k’umukene\n" +
                        "N’umugenzi kuwo isi yirengagiza\n" +
                        "N’akaruhuko kubarushe\n" +
                        "N’abari muntambara\n" +
                        "Umwami mwiza niwe nziranukuri\n" +
                        "Kand’Umwami niwe ar’ubugingo\n" +
                        "Bridge\n" +
                        "Ngwin’ubohorwe\n" +
                        "Umarwe ubgoba\n" +
                        "Ngwino munsi y’umusaraba\n" +
                        "Har’ugucungurwa\n" +
                        "Ku mibabaro yose\n" +
                        "Ngwino munsi y’umusaraba (X2)",
                        "Chris Llewellyn / Benjamin Hastings / Bryan Fowler / Gareth Gilkeson / Rend\n" +
                                "Collective Holding Account"),
                new Cantique(103, "Love is here/ NGUR’URUKUNDO ", "1. Ngwin’unywe ku mazi\n" +
                        "Ufis’ inyota\n" +
                        "Nih’izoshira\n" +
                        "Ngwino kuri Data\n" +
                        "We wibesh’uti:\n" +
                        "“Kora uzokwakirwe”\n" +
                        "Pre-chorus\n" +
                        "Naw’ukorer’ubusa\n" +
                        "Naw’umenets’umutima\n" +
                        " R/ Ng’ ur’ urukundo\n" +
                        "Ruri hano\n" +
                        "Ruva mu nkovu n’igitsibo\n" +
                        "Mumutwe\n" +
                        "Rurakwegereye\n" +
                        "Kandi rurahaza\n" +
                        "N’imbabazi ziva murubavu\n" +
                        "Kuko ruri hano\n" +
                        "2. Wew’urondera\n" +
                        "Ubutunzi\n" +
                        "Ngwin’uzonyurwa\n" +
                        "Kaze k’umukunzi\n" +
                        "W’uburaniwe\n" +
                        "Pre-chorus\n" +
                        "…\n" +
                        "Bridge\n" +
                        "Kuwbababaye, aboshwe n’abarush’umutima\n" +
                        "Ni we Mwami (x2)\n" +
                        "Mumishishagu yiwe\n" +
                        "Twaracunguwe\n" +
                        "Mumaraso yiwe\n" +
                        "Turonk’ agakiza\n" +
                        "Ni we Mwami (x2)",
                        "Drew Middleton / Phillip Larue / Jason Jamison / Michael Donehey / Jason\n" +
                                "David Ingram"),
                new Cantique(104, " . Shine Jesus shine/ Yesu TURASIRE", "1. Mwami umuco w’urukundo rwawe\n" +
                        "Urarashe mu mwijima w’isi\n" +
                        "Yesu muco w’isi turasire\n" +
                        "Tubohoreshe kwakuri kwawe\n" +
                        "Turasire Turasire\n" +
                        " R/ Yesu Turasire\n" +
                        "Igihugu cac’ ucuzuz’ubgiza\n" +
                        "Ni wake Mpwemu\n" +
                        "Wats’imitima\n" +
                        "Temba nk’uruzi\n" +
                        "Twar’amoko n’imbabazi zawe\n" +
                        "Tumurikire mw’Ijambo Ryawe\n" +
                        "2. Mwami ndaje kukwiyegereza\n" +
                        "Mva mu mwiza nza mu muco wawe\n" +
                        "Kubg’amaraso mbe mu Bgiza bgawe\n" +
                        "N’untunganye unkure mu mwiza\n" +
                        "Turasire! Turasire!\n" +
                        "3. Aho twitegerez’uk’ uhambaye\n" +
                        "Tugaragaz’ishusho y’ic’uri\n" +
                        "Tuva mubgiza tuja mubundi\n" +
                        "Tub’aberekan’inkuru yawe kw’isi\n" +
                        " Turasire Turasire",
                        "Graham Kendrick"),
                new Cantique(105, "O lord the clouds are gathering/ GIRA IMBABAZI", "1. Mwami ibicu vyiyegeranije\n" +
                        "Umuriro w’urubanza uratse\n" +
                        "Eh’ingene twaguye!\n" +
                        "Knd’utangazwa no kubon’ Ivyagezwe\n" +
                        "Vy’urukundo bihonyangwa\n" +
                        "Bigatera umuruho\n" +
                        " R/ Gir’imbabazi, (Tubabarire)\n" +
                        "Tubabarire, (Tubabarire )\n" +
                        "Tunagure\n" +
                        "Kand’ ukangur’ishengero\n" +
                        "Ukugororoka, (Ukugororoka)\n" +
                        "Ugutugana, (Ugutugana)\n" +
                        "Bitembe nk’uruzi ubutaruhuka\n" +
                        "2. Mwami, mbega mu mahanga\n" +
                        "Inuma y’amahoro iri he?\n" +
                        "Ivunitse amababa\n" +
                        "Mwami, abana bashonje\n" +
                        "Ibikoresho vy’ingwano bibib’umukate\n" +
                        "3. Mwami, ububasha bg’umwijima\n" +
                        "Butwuzuz’ urwanko, n’ubgoba\n" +
                        "N’udukangure\n" +
                        "Urukundo rukweg’abantu\n" +
                        "Baboshwe n’ivyaha vyabo\n" +
                        "Ubgami bgawe nibuze\n" +
                        "4. Umusaraba wuzuy’ ubgiza\n" +
                        "Uzonesha kino gihugu\n" +
                        "Utsind’ikibi\n" +
                        "Mumubabaro ishengero ryerekan’\n" +
                        "Ubgiza bga Kristo\n" +
                        "Humvikan’ishimwe",
                        "Graham Kendrick"),
                new Cantique(106, "Build Your Kingdom Here / UBWAMI BWAWE", "1. Ing’utegeke kand’uganze\n" +
                        "Mu mitima yacu ukundi\n" +
                        "Dusenga ng’ukuzwe muri twebge\n" +
                        "Hishur’ico twaremewe\n" +
                        "Ingo wats’imitima n’ivyizigiro\n" +
                        "Nk’umuriro mu mishaha yacu\n" +
                        "Mpwemu Yera ngwin’utwiganzire\n" +
                        "Ishengero ryawe\n" +
                        "Dukeney’ubushobozi muri twe\n" +
                        "2. Twitwararika ubwami bwawe\n" +
                        "Turabuhahamiye\n" +
                        "Twanse kwonona ubuzima\n" +
                        "Kuk’ur’umunezero n’impera\n" +
                        "(I)mitima iboshwe ikabohoka\n" +
                        "Impore ku barwaye n’abakene\n" +
                        "Dutanze ubuzima kubw’ijiru\n" +
                        "Ishengero ryawe\n" +
                        "Turasavye ukangure\n" +
                        "Iyi si\n" +
                        " R/ Ingo wubake ubwami bawe\n" +
                        "Rek’umwijima uhunge\n" +
                        "N’ukuboko kw’inkomezi\n" +
                        "Udukiriz’aha hantu\n" +
                        "Atsa umuriro mw’ishengero\n" +
                        "Igarurire iki gihugu\n" +
                        "Hindura ikirere\n" +
                        "Ingo wubake ubwami bwawe Mwami\n" +
                        "3. Suka ubushobozi bw’ubwami\n" +
                        "Kubari hafi n’abari kure\n" +
                        "Gehinomu ntihagarika\n" +
                        "Ubwiza bwawe buhindura imitima\n" +
                        "Waturemeye ibiruta cane ibi\n" +
                        "Vyura imbuto y’ubwami muri twe\n" +
                        "Utwuzuze ukuri n’urukundo rwa Kristo\n" +
                        "Twebw’ishengero\n" +
                        "Turi ivyizigiro\n" +
                        "Mw’isi",
                        "Chris Llewellyn / Gareth Gilkeson / Will\n" +
                                "Herron"),
                new Cantique(107, "Let The Flame Burn/ Rek’umuriro wake Brighter ", "1. Tuzoshika hose\n" +
                        "Twuzuye ishaka\n" +
                        "Twishigikije\n" +
                        "Amasengesho\n" +
                        "Twizigiye\n" +
                        "Ko bugiye guca\n" +
                        "Twuzuy’indirimbo\n" +
                        "Muriki kibanza\n" +
                        "2. Nyuma yimyaka apfuye\n" +
                        "Uwo muriro\n" +
                        "Nubu uracaka\n" +
                        "Kw’isi hose\n" +
                        "Turiteguye\n" +
                        "Dufise inyota\n" +
                        "Y’ikanguro\n" +
                        "Ukundi gusha\n" +
                        " R/ Reka umuriro wake \n" +
                        "Ahari umwijima\n" +
                        "Ahar’ ijoro hab’umurango\n" +
                        "Indirimbo iduge\n" +
                        "Urukundo rugwire\n" +
                        "Umuriro niwake\n" +
                        "3. Turi mukuri\n" +
                        "Tuvuga urukundo\n" +
                        "Mwizina rya yesu\n" +
                        "Tuzoshikama\n" +
                        "Dufashe abacitse\n" +
                        "intege n’ibibondo\n" +
                        "Twuzuze isi yose\n" +
                        "Indirimbo yawe ",
                        "Graham Kendrick"),
                new Cantique(108, "Revive Us Again/ WONGERE UDUKANGURE ", "1. Kangura imitima yacuMwami\n" +
                        "Maze utwuzuzuze umuriro wawe\n" +
                        "Vyura ishaka ryacu kubgawe\n" +
                        "Dukeneye irindi kanguko.\n" +
                        "Duhe inzara yo kukumenya,\n" +
                        "N’inyota yo kukurondera\n" +
                        "Wonger’uh’ishengero ryawe\n" +
                        "Umutima uhimbaza\n" +
                        " R/ Ni wonger’udukangure\n" +
                        "Serur’ubushobozi bgawe\n" +
                        "Ubwami bwawe buze\n" +
                        "Ni wongere udukangure\n" +
                        "Yesu ganza imitima yacu\n" +
                        "Ubwami bwawe buze\n" +
                        "N’udukangure\n" +
                        "2. Duhe umutima n’\n" +
                        " Iyerekwa rimwe,\n" +
                        " Duhez’igikorwa watanguye.\n" +
                        " Duh’impuhwe dushikire\n" +
                        " Abandi dufis’urukundo nk’ingabo\n" +
                        "Nk’umugeni agufatiy’ishaka\n" +
                        "Kugira mukukwiyegurira dutang’ubuzima bgacu",
                        "Andy Park"),
                new Cantique(109, "Bind us togethe R/ TUBE UMWE", "Chorus:\n" +
                        "Tubohe tub’umwe (X2)\n" +
                        "n'umugozi w’urukundo Rwawe\n" +
                        "(X2)\n" +
                        "Igitero ca 1\n" +
                        "Hari imana imwe gusa\n" +
                        "Hari umwami umwe gusa\n" +
                        "Hari umubiri umwe gusa\n" +
                        "Niyo mpamvu turirimba\n" +
                        "Igitero ca 2\n" +
                        "Twaremwe kubg’icubahiro cawe\n" +
                        "Twacunguwe n'umwana wiwe w'agaciro\n" +
                        "Twatoranirijwe ukwera kwawe\n" +
                        "Kuko Yesu yanesheje\n" +
                        "Igitero ca 3\n" +
                        "Muri umuryango w'Imana\n" +
                        "N’isezerano Ryayo\n" +
                        "Muri abatoranijwe nayo\n" +
                        "Muri vino nsha y’akanovera",
                        "John Keys"),
                new Cantique(110, " With One Voice/ N’IJWI RIMWE ", "1. Turaje hamwe n'intumbero yera\n" +
                        "No kubw' impamvu irut’izindi\n" +
                        "N'ururimi rumwe rw’umutima uhimbaza\n" +
                        "Dukoranye turirimba mw’isi\n" +
                        "Icubahiro cawe\n" +
                        " R/ N'ijwi rimwe tuzoririmba\n" +
                        "Ubwoko n' indimi zose\n" +
                        "Vyerekane ubgiza\n" +
                        "N'ijwi rimwe tuzozana\n" +
                        "Hano mw'isi indirimbo iryoshe iva mw’ijuru\n" +
                        "Turirimbir'umwami\n" +
                        "N'ijwi rimwe\n" +
                        "2. Turirimbira hamwe naho tuva ahatandukanye\n" +
                        "Ikituranga n'urukundo rwawe\n" +
                        "Mu mahanga yose no ku mpera z'isi\n" +
                        "Dukoranye turirimba mw’isi\n" +
                        "Icubahiro cawe\n" +
                        "R/\n" +
                        "Bridge :\n" +
                        "Ngwino ngwino turirimbe\n" +
                        "Imana yac'iri ku ngoma\n" +
                        "Ngwino Ngwino turirimbe\n" +
                        "Haleluya 2*\n" +
                        "Haleluya Imana iraganje\n" +
                        "Reka tunezerwe",
                        "Matt Redman & Steven Curtis Chapman"),
                new Cantique(111, "Spirit Lead Me/ MPWEMU NYOBORA ", "1) Umv’uko ntazira n'ishikanwa ryanje\n" +
                        "Ibihe vyose ntaconzisigariz'igigihe cose\n" +
                        "Nziga kukwizera nigih'ataco mbona\n" +
                        "Nomumubabaro, nzokwama nkwizera\n" +
                        "R/\n" +
                        "Niwambuza nzokwumvira\n" +
                        "Unsavye kurekura nzobikora\n" +
                        "Urikumwe nanje nzoter’intambgr\n" +
                        "Unsavye gusimba nzokwemera\n" +
                        "Unsavye gutekana nzorindira\n" +
                        "Unsavye kukwizera nzokwumvira\n" +
                        "Nsinshaka gukurikira inzira zanje\n" +
                        "Singisubir'ukundi\n" +
                        "Mpwemu nyobora\n" +
                        "2) Wa nkumutwaro, ariko aho natahura\n" +
                        "Wanshikanye gusumba aho nasavye\n" +
                        "Kukubona gusa nivyagaciro\n" +
                        "Ndi nk’igicaniro manura umuriro\n" +
                        " R/.......\n" +
                        "Bridge\n" +
                        "Ivyizigiro vyaheze\n" +
                        "Nsigarany ijambo ryawe\n" +
                        "Nkwiye kwizera kukur'amazi mugitandara\n" +
                        "Ngumar'inyota mfise, mu kunkund'uko ndi\n" +
                        "N'igihe ntavyibuka, unyibuts'ivyo nasezeranye\n" +
                        "Sinizerinzira zanje, mpevy'ububi bwanje\n" +
                        "Ndarekuye vyose kuko uri vyose nshaka\n" +
                        "Ndapfukamy’iki nico gikombe umfitiye\n" +
                        "Niyo bidatahuritse, nzoreka Mpwemu anyobore\n" +
                        "Mpwemu nyobora",
                        "Michael Ketterer, Whitney Medina, Graham Moore, Michael Barkulis,\n" +
                                "Melody Hernandez, Gabriel Wilson"),
                new Cantique(112, "Where the Spirit of the Lord is/ AHO MPWEMU W’IMANA ARI ", "Igitero ca 1\n" +
                        "Ur’umuco umurika\n" +
                        "Ur’umuriro waka muri je\n" +
                        "Tugukeneye kuruta vyose\n" +
                        "Urut'indirimbo turirimba\n" +
                        "Urut'amajambo n'ibimazi\n" +
                        "Tugukeneye kuruta vyose\n" +
                        "Pre-chorus\n" +
                        "Niwe dukeneye\n" +
                        "Niwewe twifuza\n" +
                        "Chorus\n" +
                        "Turazi ko aho mpwemu w'Imana ari\n" +
                        "Aho Mpwemu ari hab'umwidegemvyo\n" +
                        "Turazi ko mu mwidegemvyo wawe\n" +
                        "Mumwidegemvyo wawe tuboneray'ubwiza\n" +
                        "Turazi ko aho mpwemu w'Imana ari\n" +
                        "Aho Mpwemu ari hab'umwidegemvyo\n" +
                        "Turi abawe kand’Ubwami n'ubwawe\n" +
                        "Igitero ca 2\n" +
                        "Twegerez' umutima wawe\n" +
                        "Dukweger’ahuri mwami\n" +
                        "Tugukeneye kuruta vyose\n" +
                        "Pre-chorus\n" +
                        "R/",
                        "Chris Tomlin, Christy Nockels, Nathan Nockels"),
                new Cantique(113, "Where the Spirit of the Lord is/ MPWEMU W’IMANA ", "Igitero ca 1\n" +
                        "Twameny’ ukuri\n" +
                        "Nikwo kwatubohoye\n" +
                        "N’izina ryawe\n" +
                        "Ryonyene ryatubohoye\n" +
                        "Uri hano Mwami\n" +
                        "Urikumwe natwe\n" +
                        "Igitero ca 2\n" +
                        "Ntitukiri imbohe\n" +
                        " Twuzuye ivyizigiro\n" +
                        "Ntaguhindukira\n" +
                        "Yesu urumwami wacu\n" +
                        "Twarakwihaye\n" +
                        "Akira vyose\n" +
                        "Chorus/\n" +
                        "Aho mpwemu w'Imana ari\n" +
                        "Har'ukwidegemvya\n" +
                        "Aho mpwemu w'Imana ari\n" +
                        "Imigozi iracika\n" +
                        "Tugahumuka\n" +
                        "Kristo uri hano\n" +
                        "Urikumwe natwe\n" +
                        "Igitero ca 3\n" +
                        "Uw’Umwana yabohoye\n" +
                        "Arabohoka vy’ukuri\n" +
                        "Ntacaha kituriko\n" +
                        "Twaracunguwe\n" +
                        "Yesu yarishe vyose\n" +
                        "Yarabirishe\n" +
                        "Bridge\n" +
                        "Kingur’ amarembo y'ijuru\n" +
                        "Turishikanye duhimbaza/n’utwuzuze (option 2)\n" +
                        "Rek’ubgiza bgawe Mwami\n" +
                        "Bumanuke kuri twebge\n" +
                        "Kingur’amarembo y'ijuru\n" +
                        "Tuzokwama tuguhimbaza\n" +
                        "Ngwin’ubane natwe",
                        "Ben Fielding"),
                new Cantique(114, "Yahweh / YAHWEH", "1. Mpwemu wa Yesu\n" +
                        "Uba muri twebwe\n" +
                        "Ntunanirwa canke ng’uhebe\n" +
                        "Sezerano ryamaho\n" +
                        "We juru muri muri twe\n" +
                        "Ryongorera izina ryawe\n" +
                        " R/ Wera, wera n’Umwami\n" +
                        "Abereye gushimwa\n" +
                        "Yahweh\n" +
                        "2. Nuzuy’ ubgiza bgawe\n" +
                        "Ndarekura vyose\n" +
                        "Mw’ibanga ry’ubuntu ugumije\n" +
                        "Nyegereza ah’uri\n" +
                        "Nshiramw’icifuzo\n" +
                        "Co kuba muzima muri wewe\n" +
                        "R/Wera, wera n’Umwami\n" +
                        "Abereye gushimwa\n" +
                        "Yahweh\n" +
                        "Umuriro waka mu mutima\n" +
                        "Urubeya rutongora\n" +
                        "Yahweh\n" +
                        "Bridge\n" +
                        "Uwamyeho kand’agir’aze\n" +
                        "Niw’aba muri twebwe\n" +
                        "Uhambaye\n" +
                        "Yahweh",
                        "Jane Williams, Matthew Ntlele, Steven Furtick"),
                new Cantique(115, "Speak O Lord/ VUGA MWAMI  ", "1. Vuga Mwami, tuj’iwawe\n" +
                        "Ngo twakir’umukate w’Ijambo\n" +
                        "Rek’ukuri gutembe muri twe\n" +
                        "Tub’ishusho Ryawe Mwami\n" +
                        " R/ Ng’umuco ukayangane\n" +
                        "Mubikorwa vy’urukundo n’ukwizera\n" +
                        "2. Vuga maz’ushitse\n" +
                        "Imigabo yawe\n" +
                        "Kubg’icubahiro cawe\n" +
                        "Twigishe kukwubaha no gutinya kwera\n" +
                        "N’uguca bugufi\n" +
                        "3. Pim’ivyiyumviro vyacu\n" +
                        "Mu gusayangana kw’\n" +
                        "Ukwera kwawe\n" +
                        "Duh’ukwizera\n" +
                        "Duhe kubona ubgiza\n" +
                        "Bg’urukundo\n" +
                        "N’ukuganza kwawe",
                        "Keith Getty, Stuart Townend "),
                new Cantique(116, "Ancient Words/(A)MAJAMBO AHORAHO", "1. Majambo yazigamwe kuva kera\n" +
                        "Kubg’urugendo rwacu kw’isi\n" +
                        "Yumvikanamw’ umutima w’Imana\n" +
                        "Rek’ayo majambo ahindure\n" +
                        "Nay’ubugingo, n’ivyizigiro\n" +
                        "Atang’inkomezi, mubigoye\n" +
                        "Hano kw’isi, aho duca hose\n" +
                        "Azodushikana I muhira\n" +
                        "R/ Majambo ya kera y’ukuri\n" +
                        "Ampindura akaguhindura\n" +
                        "Twuguruy’imitima yacu\n" +
                        "Rek’ayo majambo ahindure\n" +
                        "2. Majambo yera y’ukwizera kwacu\n" +
                        "Yatanzwe muri kino gihe\n" +
                        "Twayaronse kubg’ikimazi\n" +
                        "Mwumv’ amajambo ya Kristo\n" +
                        "Majambo yazigamwe kuva kera\n" +
                        "Kubg’urugendo rwacu kw’isi\n" +
                        "Yumvikanamw’ umutima w’Imana\n" +
                        "Rek’ayo majambo ahindure",
                        "Lynn DeShazo"),
                new Cantique(117, "Word of God/ JAMBO RY’IMANA ", "1. Ijambo ry'Imana ni umuco mu mwiza\n" +
                        "Ivyizigiro bikomeye vy'ukuri\n" +
                        "Rih’inkomezi abananiwe\n" +
                        "N’inkinzo ku bamwizigiye (x2)\n" +
                        "Pre-chorus\n" +
                        "Ibiriho vyose,\n" +
                        "Bizozimangana\n" +
                        "Amajuru n'isi bizohera\n" +
                        "Ariko wewe uzokwamaho,\n" +
                        "Ibihe vyose\n" +
                        "R/\n" +
                        "Yesu Ni we Jambo ry’Imana\n" +
                        "Ikizirik’ umutima\n" +
                        "Uri vyose uvuga ko uri\n" +
                        "Urenze ivyo nkeneye vyose\n" +
                        "Rutare mpagazeko\n" +
                        "Ntuzohindura amasezerano\n" +
                        "Bridge\n" +
                        "Ntuzigera\n" +
                        "Uduhemukira\n" +
                        "Habe namba, Jambo w’Imana",
                        "Andi Rozier, Brenton Brown"),
                new Cantique(118, ". Jusqu’au bout/ DUKOBEJE", "1. Genda\n" +
                        "Wizey’inkomezi\n" +
                        "Z’umwami\n" +
                        "Genda, niwaja aho akubgiye\n" +
                        "Uzoba\n" +
                        "Uwuvuga urukundo rwiwe\n" +
                        "N’umusaraba\n" +
                        "Ntugahindukire\n" +
                        " R/ Dukobeje\n" +
                        "Mwizina ryiwe\n" +
                        "Tuzogenda\n" +
                        "Tumurikiwe nawe\n" +
                        "Dukobeje\n" +
                        "Turirimba\n" +
                        "Tuzogenda\n" +
                        "No kumpera yiyi si\n" +
                        "2.Komeza\n" +
                        "Mu nkomezi z’Umwami\n" +
                        "Twizera ko\n" +
                        "Aganje muri twe\n" +
                        "Aha kw’isi \n" +
                        "Ah- umwansi\n" +
                        "Atankomezi akigira\n" +
                        "Aho Yesu aturungitse",
                        "Exo"),
                new Cantique(119, "A New Hallelujah/ ISHIMWE RISHASHA ", "1. Mbeg’urumv’ indirimbo nshasha\n" +
                        "Iva mu bana bidegemvya\n" +
                        "Amoko yose, amahanga yose\n" +
                        "Muririmbe ishimwe rishasha\n" +
                        " R/ Shengero\n" +
                        "Muhaguruke\n" +
                        "Urukundo rujabuke hakurya\n" +
                        "Muririmbe mukangutse\n" +
                        "Ryumvikane hose\n" +
                        "2. Twerek’urukund’ amahanga\n" +
                        "N’ivyizigiro vyatubohoye\n" +
                        "Ni mumumenyekanishe\n" +
                        "Muririmbe ishimwe rishasha\n" +
                        "3. Africa: “shing’intahe!”\n" +
                        "Uririmba ishimwe rishasha\n" +
                        "Abahungu n’abakobga b’Imana\n" +
                        "Muririmbe ishimwe rishasha\n" +
                        "Bridge\n" +
                        "Whoa whoa, whoa whoa yeah\n" +
                        "Iyo ndirimbo niyumvikane\n" +
                        "Muririmbe ishimwe rishasha",
                        "Michael W Smith "),
                new Cantique(120, "Faithful to the end/ GUSHIKA KW’IHEREZO", "Couplet\n" +
                        "Nezerwa iyo niyumvira\n" +
                        "Isezerano ryukuza kwiwe\n" +
                        "Ivyaremwe vyose vyiteze\n" +
                        "Umusi wogucungurwa\n" +
                        "Pre-chorus\n" +
                        "Azoza agendera ku bicu\n" +
                        "N’ubugororotsi\n" +
                        "N’inkota muminwe\n" +
                        "Bose bazobona ubwiza bwiwe\n" +
                        "Akayangana munyonga\n" +
                        "Apfuhira umugeni\n" +
                        "Chorus\n" +
                        "N’umwizigirwa\n" +
                        "Amberey umwizigirwa\n" +
                        "Gushika kw’iherezo\n" +
                        "Azonjana mubukwe\n" +
                        "Bridge\n" +
                        "Hashimwe\n" +
                        "Kristo\n" +
                        "Umugororotsi",
                        "Cory Asbury"),
                new Cantique(121, "I will rise/ NZODUGA", "1) Har’ amahoro namenye\n" +
                        "Naho nocik’intege\n" +
                        "Harikiziritse umutima\n" +
                        "Ubu mvuga nti”nimpore”\n" +
                        "Pre-chorus\n" +
                        "Yesu yaranesheje imva irarangaye\n" +
                        "Twarons intsinzi yazutse mu bapfuye\n" +
                        "Chorus\n" +
                        "Nzoduga ampamagaye\n" +
                        "Nsezere umubabaro\n" +
                        "Nzoduga nkinkukuma\n" +
                        "Nikubite hasi ndamubonye\n" +
                        "Maze nduge…nzoduga…\n" +
                        "2) Harumusi wegereje\n" +
                        "Ah’umuco uzonesha uyu mwiza\n" +
                        "Igipfungu kikavaho\n" +
                        "Nkabon’ivyo nizereye\n" +
                        "Bridge\n" +
                        "Ndumva abamalayika baririmba\n" +
                        "Umwagazi arabereye\n" +
                        "Ndumv Imitima inyotew irimba\n" +
                        "Umwagazi arabereye",
                        "Chris Tomlin / Jesse Reeves / Louie Giglio / Matt\n" +
                                "Maher"),
                new Cantique(122, " Home/ I MUHIRA", "1. Iyi si ntikiri ico yagenewe kuba\n" +
                        "Uyu mababaro tubayemwo\n" +
                        "Har’ahantu heza nateguriwe\n" +
                        "Mw’ijuru\n" +
                        "2. Amasozi yos’ azohanagurwa\n" +
                        "Agahinda n’icaha bikurweho\n" +
                        "Tuzokwigin’ubuntu bgiwe\n" +
                        "Mw’ijuru Mw’ijuru\n" +
                        " R/ Ntash’i muhira\n" +
                        "Har’amayira y’inzahabu\n" +
                        "Hari n’umwidegemvyo\n" +
                        "Nifuza kuja\n" +
                        "Aho nyene\n" +
                        "I muhira\n" +
                        "Ah’ata bgoba\n" +
                        "Narakiriwe\n" +
                        "Aho nagenewe\n" +
                        "I muhira\n" +
                        "3. Niyambuy’imitwaro na kahise\n" +
                        "Mpungira kuri Yesu simpindukira\n" +
                        "Shimwa Munyenkomezi ko nzidegemvya\n" +
                        "Mw’ijuru Mw’ijuru\n" +
                        "Bridge\n" +
                        "Tuzohumuka\n" +
                        "Twitegereze\n" +
                        "Tuzozurwa\n" +
                        "Kubah’ibihe vyose\n" +
                        "Inzamb’izovuga\n" +
                        "Hab’uguhimbaza\n" +
                        "Halleluya, Halleluya\n" +
                        "Ntash’i muhira",
                        "Chris Tomlin / Ed Cash / Jason Ingram / Jonas Carl Gustaf\n" +
                                "Myrin"),
                new Cantique(123, " Hope is marching/ IVYIZIGIRO", "1. Ijoro ry’amarira ryoteba guca\n" +
                        "Nkagir’ibikomere mubuzima\n" +
                        "Tugir’ivyizigiro no muri ryo\n" +
                        "Vyose bizorangira /2\n" +
                        "Ego bizorangira\n" +
                        "Chorus:\n" +
                        "Undemurura imitwaro\n" +
                        "Ukayinkurako yose\n" +
                        "Umpumekamwo ivyizigiro\n" +
                        "Uranzigama mu marushwa yose\n" +
                        "2. Haribihe vyamarira\n" +
                        "Tukabur’inzira\n" +
                        "No murugamba tuzorema\n" +
                        "Vyose bizorangira\n" +
                        "Bridge:\n" +
                        "Urukundo rwawe rurankomeza\n" +
                        "Ukampa ivyizigiro\n" +
                        "Ukagendesha mu mbabazi\n" +
                        "Ukampa ivyizigiro",
                        "Jonas Myrin & Matt Redman"),
                new Cantique(124, "One day/ UMUNSI UMWE", "1. Umuns’umwe uzorema bisha\n" +
                        "Yes’azovura ibikomere vyose\n" +
                        "Vyose bizocika bisha\n" +
                        "Nta marira,\n" +
                        "Vyose bizogira insiguro\n" +
                        "Ibibazo vyose bironk’inyishu\n" +
                        "Ibiduhagarik’umutima\n" +
                        "Bikurweho\n" +
                        " R/ Nzomubona, Yes’ Umwami,\n" +
                        "Mw’ijuru dushitseyo;\n" +
                        "Nzobona mu nyonga hiwe\n" +
                        "N'icubahiro ciwe.\n" +
                        "2. Tuzobona Yesu imbonankubone\n" +
                        "Umus’umwe\n" +
                        "Ntabuntu burenz’ubgo\n" +
                        "Duhindurwe mu kanya gato\n" +
                        "Kuruwo musi\n" +
                        "Umus’umwe tuzidegemvya\n" +
                        "Yesu uzohez’intambara zose\n" +
                        "Tuzobon’ubgiza bgawe\n" +
                        "Kuruwo musi",
                        "Eliza E. Hewitt, Matt Redman, Beth Redman, Leonard\n" +
                                "Jarman "),
                new Cantique(125, "I can only imagine / HARAHO NIBAZA ", "1. Haraho nibaza\n" +
                        "Ingene bizosa\n" +
                        "Turi kumwe\n" +
                        "Nawe Mwami\n" +
                        "Haraho nibaza\n" +
                        "Ivy’amaso azobona\n" +
                        "Ndiko nkubona imbonankubone\n" +
                        "Haraho nibaza (X2)\n" +
                        " R/ Nkikujwe n’ubgiza bgawe\n" +
                        "Mbega nziyumva gute?\n" +
                        "Mbega nzogutambira Yesu\n" +
                        "Canke ndagutangarire\n" +
                        "Nzohagarara mu bgiza bgawe?\n" +
                        "Canke ndagupfukamire\n" +
                        "Mbe nzoririmba haleluya\n" +
                        "Nzobishobora kuvuga\n" +
                        "Haraho nibaza (X2)\n" +
                        "2. Haraho nibaza\n" +
                        "Igih’uwo munsi uzoza\n" +
                        "Nkisanga mpagaze\n" +
                        "Mu Mwana wawe\n" +
                        "Sinokwiza mubgenge\n" +
                        "Aho ico nzokora gusa\n" +
                        "Ar’ukwama ngutazira\n" +
                        "Sinokwiza mubgenge (X2)",
                        "Bart Millard"),
                new Cantique(126, "I know He lives/ NDAZI KO ARIHO  ", "1. Dufis’ivyizigirobidahinduka\n" +
                        "Vyashinzwebitazoburagushika\n" +
                        "Dufis’incutikukirimbamw’ijuru\n" +
                        "Kuva ahoYesu yazutse mu bapfuye\n" +
                        "2. Dufis’ikigumiz’umutima kigumye\n" +
                        "Kukw’amarasoyiweyadushikanyeyo\n" +
                        "I bgina mumutimaw’Imana\n" +
                        "Imberey’intebeya Data y’imbabazi\n" +
                        " R/ Ndaziko ariho\n" +
                        "Yesu ni muzima\n" +
                        "Kand’ubu aganje mu Bgiza\n" +
                        "Ndazikoariho\n" +
                        "Tuzozukananawe\n" +
                        "Haleluya\n" +
                        "Ndaziko ariho\n" +
                        "3. Dufis’Umwami ashizwe hejuru ya vyose\n" +
                        "Mfuramu vyaremwe bisha bizoza\n" +
                        "Amajurun’isinshabirindiriy’ijwiryiwe\n" +
                        "Tuzosa nawe niyagaruka\n" +
                        "Bridge\n" +
                        "Tumubon’ubu mu bgiza\n" +
                        "Aganjehejuruy’amajuru\n" +
                        "Gushika aserutse ku bicu\n" +
                        "N’ivyaremwe bivyemezwe",
                        "Graham Hendrick"),
                new Cantique(127, "The King of Glory comes/ UMWAMI W’UBWIZA ", "1. Mwami w’abami aganje bose\n" +
                        "Ntare ya Yuda, Jambo w’Imana (X2)\n" +
                        " R/ Nguyo araje, Umwami w’ubgiza araje\n" +
                        "Mubutungane aje gucir’imanza isi\n" +
                        "2. Nguyo araje, Umwami w’ubgiza araje\n" +
                        "Mubutungane aje gucir’imanza isi\n" +
                        "Nguyo araje, Umwami w’ubgiza araje\n" +
                        "Mukugororoka azoganz’isi",
                        "Graham Hendrick"),
                new Cantique(128, "City of Joy/ ISI Y’UMUNEZERO ", "1. Narumvis’ ikibanza\n" +
                        "Kitaremwe n'umuntu\n" +
                        "Har'inzira z’inzahabu\n" +
                        "Abacunguwe biginiramwo\n" +
                        "Narumvis'ivy' abamarayika\n" +
                        "Batazir'Umwagazi\n" +
                        "Twateguriw’igisagara c'umunezero\n" +
                        "2. Narumvis'ikibanz' ah' ata joro\n" +
                        "Ah’intambge n'umwagazi bizoryama hamwe\n" +
                        "Kandi hashajije n’amabara meza\n" +
                        "Twateguriw’igisagara c'umunezero\n" +
                        " R/ Mbeg'umunsi uhambaye\n" +
                        "Aho tuzobon'Umukiza\n" +
                        "Ah'icaha n’umubabaro bizoba birangiye\n" +
                        "Twateguriw’isi y'umunezero\n" +
                        "3. Narumvise ivy'umunsi ah’inzamb'izovuga\n" +
                        "Ijuru ryuguruke duce duterurwa\n" +
                        "Narumvisekotuzomubona, aberabapfukame\n" +
                        "Twateguriw’igisagara c'umunezero",
                        "Michael Neale"),
                new Cantique(129, ". Glorious Day/ UMUNSI MWIZA ", "1. Umuns’ah’ Ijuru ryuzuy’ishimwe\n" +
                        "Isi yuzuy’umwijima w’icaha\n" +
                        "Yesu yaraje avyarwa n’inkumi\n" +
                        "Abana n’abantu niwe citegerezo\n" +
                        "Yigiz’umuntu n’umuco muri twe\n" +
                        "Tumubona mu bgiza\n" +
                        "2. Har’ umusi yatwawe I Karuvari\n" +
                        "Baramumanika ku giti arapfa\n" +
                        "Arababazwa arankwa aratabga rwose\n" +
                        "Kubg’ivyaha vyanje niwe mucunguzi\n" +
                        "Ibiganza vyakijij’abantu bikubitwa umusumari\n" +
                        "3. Umus’umwe imva inanirwa kumugumya\n" +
                        "Ikibuye Kiratambagara\n" +
                        "Hanyuma yarazutse, atsinz’urupfu\n" +
                        "Ubu yaraduze, n’Umwami wanje\n" +
                        "Urupfu n’imva ntivyamubuza\n" +
                        "Kuzuka\n" +
                        ", R/ Akiriho yankuze\n" +
                        "Apfuye arankiza\n" +
                        "Ahambge ashir’ivyaha vyanje Kure\n" +
                        "Azutse arantsindanishiriza\n" +
                        "Umus’umwe azoza, n’Umunsi mwiza,\n" +
                        "N’umunsi mwiza (X2)\n" +
                        "Bridge\n" +
                        "Umuns’umwe inzamba izovuzwa\n" +
                        "Tumubone mubicu azananye ubgiza\n" +
                        "Umunsi mwiza, umukunzi azozana\n" +
                        "N’Umukiza wanje Yesu.",
                        "John Wilbur Chapman, Mark Hall, Michael\n" +
                                "Bleecker "),
                new Cantique(130, ". Even So Come/ YESU N’UZE ", "1. Ivyaremwe vyose\n" +
                        "N'isi yose\n" +
                        "Tegur'inzira\n" +
                        "Inzira y'Umwami\n" +
                        "Yesu araje vuba\n" +
                        "2. Hamagar' umunyavyaha\n" +
                        "Ukangur' uwera\n" +
                        "Amahanga yamamaz’\n" +
                        "Icubahiro cawe\n" +
                        "Yesu araje vuba\n" +
                        "R/\n" +
                        "Nk'umugeni arindiriy' umukwe\n" +
                        "Tuzob'ishengero rikwiteze\n" +
                        "Imitima yose yipfuz' Umwami\n" +
                        "Turirimba, tuti nuze\n" +
                        "Mwami Yesu N’uze!\n" +
                        "3. Hazob'ugutungana,\n" +
                        "Vyose bibe bisha\n" +
                        "Izina Ryawe\n" +
                        "Niryo kwizigirwa\n" +
                        "Yesu araje vuba\n" +
                        "Bridge\n" +
                        "Nuko turakwiteze\n" +
                        "Mana yacu uraje vuba",
                        "Jess Cates, Jason Ingram Chris, Tomlin"),
                new Cantique(131, "Grace will lead me home/ UBUNTU BUZINSHIKANA", "1. Har’igihugu nteguriwe\n" +
                        "Gisumba ivyo maze kubona\n" +
                        "Nah'imitwaro yomvuna\n" +
                        "Sinzihebura haba namba.\n" +
                        "R/\n" +
                        "Ubuntu Buzondongora\n" +
                        "Bunshits’I muhira\n" +
                        "Muvyo twahanganye nkanesha\n" +
                        "N’ubuntu bgawe buzonshikana\n" +
                        "2. Imibabaro izorangira\n" +
                        "Nibere mu mahoro yuzuye\n" +
                        "Mpagaz’imbere y' Umwami\n" +
                        "Nitegerez’ico nizeye\n" +
                        "Bridge\n" +
                        "Naho nzoba mazeyo imyak’igihumbi\n" +
                        "Imyenda yakuweho nzoba Nkikesha ubuzima\n" +
                        "Ubuntu bwanshikany’I muhira\n" +
                        "Bridge\n" +
                        "Wamy’ur’ubwugamo mu bihuhusi\n" +
                        "Wabanye nanje muri vyose\n" +
                        "N’ubuntu buzonshikana",
                        "Benji Cowart / David Dunn / Hank Bentley"),
                new Cantique(132, "Bound for Glory/ NARABIKIWE UBWIZA  ", "1. Kw'isi ntabw'ari iwacu\n" +
                        "Ndahar'akanya gato\n" +
                        "Niho honyene nzi\n" +
                        "Ariko si i wacu\n" +
                        "2. Intambara siyanje\n" +
                        "Sinzokwamana imitwaro\n" +
                        "Ko yavuye mu mva\n" +
                        "Mbikiw'ubwiza\n" +
                        "Chorus :\n" +
                        "Ndidegemvya ko nd’imbohe\n" +
                        "Mbikiw'ijuru\n" +
                        "Igihe nzogender'ahera\n" +
                        "Narabikiwe ubwiza\n" +
                        "3. Agakiza karaje\n" +
                        "Urupfu siryo herezo\n" +
                        "Rwatsinzwe n'Imana yanje\n" +
                        "Ooh narabikiw'ubwiza\n" +
                        "Bridge\n" +
                        "Imibabaro n'isoni\n" +
                        "Bizovaho niyampamagara\n" +
                        "Nzokwama mpimbawe nshima\n" +
                        "Niyampamagara Yesu",
                        "Jon Guerra / Eddie Hoagland / Hank Bentley"),
                new Cantique(133, " Well Done/ WAKOZE NEZA", "1. Bizosa gute umubabaro uheze\n" +
                        "Ibibazo vyo mw'isi bikuweho\n" +
                        "Bizomera gute niwampamagara\n" +
                        "Igihe nzokubona imbona nkubone\n" +
                        "Ndorerey’umunsi uzombwir’uti\n" +
                        "Chorus:\n" +
                        "Wakoze neza mushumba yizigirwa\n" +
                        "Kaze winjire aho wateguriwe\n" +
                        "Wakoze neza mwana wanje nkunda\n" +
                        "Urangije urugendo uratahutse\n" +
                        "Kaze winjire aho wateguriwe\n" +
                        "2. Bizosa gute umpanaguy’amarira\n" +
                        "Ivyononekaye vyose bigizwe bisha\n" +
                        "Bizomera gute nje mu bwiza bwawe\n" +
                        "Mpagaze imbere y’urukundo ruhebuje\n" +
                        "Sije nzobon'uwo musi urageze\n" +
                        "Mbaho niteze kuzombwira uti\n" +
                        "3. Bizomera gute ni numva yamajwi\n" +
                        "Y’abamarayika basemerera\n" +
                        "Bat'Uwera, Uwera, Mwam'ur’Uwera (X3)\n" +
                        "Sije nzobon'uwo musi ugeze\n" +
                        "Mbaho niteze kuzombwir’uti\n" +
                        "R/",
                        "Jason Ingram / Matt Fuqua / Josh Havens"),
                new Cantique(134, "When heaven calls/ NIRYAHAMAGARA", "1. Mukanya nkak’uwukubis’ urugohe\n" +
                        "Imiravyo izorasa azogabur’ijuru\n" +
                        "Ntawuzi umunsi n’isaha Inzamba\n" +
                        "Izovuga natwe tuzoduga\n" +
                        "2. Harumusi kubantu bose\n" +
                        "Gukunda, gutwenga kubaho no gupfa\n" +
                        "Mbayeho kubgo Uwuri Rukundo\n" +
                        "Nzopfa niteze niteze ko azonezererwa\n" +
                        " R/ Niryahamagara\n" +
                        "Ubuzima burangiye\n" +
                        "Tuzohagarara imbere y’Umukiza\n" +
                        "Ijuru niryahamagara,\n" +
                        "Twitege\n" +
                        "Kuzohabga kudapfa\n" +
                        "Mugishingo co gupfa\n" +
                        "Juru niryahamagara\n" +
                        "Bridge\n" +
                        "Eh’uyo Mwagazi\n" +
                        "Akurah’ivyaha vyanje\n" +
                        "Mu Bgiza bg’Ijuru\n" +
                        "Azanyakirana igishika",
                        "Nicole Coleman Mullen"),
                new Cantique(135, " Christ is risen/ HALLELUYA YARAZUTSE", "Igitero ca 1\n" +
                        "Buntu butangaje\n" +
                        "Bwakijije umurushwa nkanje\n" +
                        "Nari nzimiye uranzana\n" +
                        "Umpumura amaso\n" +
                        "Pre-chorus\n" +
                        "Halleluia\n" +
                        "Kristo yazutse mu bapfuye ×2\n" +
                        "Igitero ca 2\n" +
                        "Icangazi kirakirwa\n" +
                        "Umunyavyaha agirwa uwera\n" +
                        "Kw’Imana yapfuye irazuka\n" +
                        "Vyose bicika bisha\n" +
                        "Chorus/\n" +
                        "Pre-chorus …\n" +
                        " R/ Wa ruboyi rw’urupfu\n" +
                        "Inkomezi zawe ziri he?\n" +
                        "Kuk’Umwami w’abami\n" +
                        "Yakwambuy’ububasha\n" +
                        "Ndabohorwa nkacungurwa\n" +
                        "Ndonk’ubugingo budashira\n" +
                        "Nashimw’\n" +
                        "Ibihe vyose\n" +
                        "Hallelluia\n" +
                        "Pre-chorus 2\n" +
                        "Halleluia\n" +
                        "Kristo yazutse mu bapfuye ×2\n" +
                        "Ibihe vyose nzokwamana iyi ndirimbo\n" +
                        "Halleluia\n" +
                        "Kristo yazutse mu bapfuye ×2\n" +
                        "Igitero ca 3\n" +
                        "N'umunsi uzompamagara\n" +
                        "Mubuhirwe bg’ijuru\n" +
                        "Nzobona inkovu n’amaboko anyakira mubwiza\n" +
                        "Ndizwa n’umunezero nduz’\n" +
                        "Amashimwe adahera\n" +
                        "Hallelluya\n" +
                        "Kristo yarazutse",
                        "Brian Johnson"),
                new Cantique(136, " Come Lord Jesus / NGWINO MWAMI", "IGITERO CA 1\n" +
                        "Intambara iheze\n" +
                        "Ingwano zigahera\n" +
                        "Tuzobon'Umucunguzi\n" +
                        "Yaka nk'izuba\n" +
                        "Ahanagur'amarira\n" +
                        "Umwijima uhunge\n" +
                        "Abatari muri Kristo bose\n" +
                        "Bahindurwe basha\n" +
                        " R/ Ngwino Yesu\n" +
                        "Umv'ukw' ivyaremwe biniha\n" +
                        "Ngwino Mwami\n" +
                        "Utahane abantu bawe\n" +
                        "IGITERO CA 2\n" +
                        "Indimi zose zizomuhimbaza\n" +
                        "Amavi yos'apfukame\n" +
                        "Nitwabon'Umucunguzi\n" +
                        "Aserutse ku bicu\n" +
                        "IGITERO CA 3\n" +
                        "Ivyo tubon'agace\n" +
                        "Tuzobibona neza\n" +
                        "Ubwiza bwawe\n" +
                        "Buzoduhimbara",
                        "Brenton Brown / Glenn Robertson"),
                new Cantique(137, " Heaven Song/ IYO NDIRIMBO", "1. Ubu butumwa burik’umukono wawe\n" +
                        "Ndabusom’ urudome kurundi\n" +
                        "Uvugamwo kuzoza kuntora vuba\n" +
                        "Oh Mana yanje nzokwitega\n" +
                        "2. Ni numv’ijwi ryawe rimbgira riti:\n" +
                        "Wakoze neza mwana ngwin’uruhuke\n" +
                        "Amasozi azotemba n’umunezero\n" +
                        "Birenze ivyo nigeze kurota vyose\n" +
                        " R/ Nifuz’ubgo bgatsi butotahaye\n" +
                        "Ngendere kumisozi miremire\n" +
                        "Nshak’ayo mazi aryoshe cane\n" +
                        "Mu gipfungu c’agatondo\n" +
                        "Umutima wanje wumv’igishika\n" +
                        "Kubg’ikibanza wambikiye\n" +
                        "Sije nzobona ndirimbanye n’abamarayika iyo ndirimbo",
                        "Philip David Wickham"),
                new Cantique(138, " . We will see him/ TUZOMUBONA", "1. Nzunamurira amaso\n" +
                        "Ku Mana yonyene\n" +
                        "Nzoshir’Umutima\n" +
                        "Ku kwizera uwera\n" +
                        "Nzobaho nizeye\n" +
                        "Ko ijambo ryiwe ari ukuri\n" +
                        "Nsemerere mw’isi\n" +
                        "Ko iyimbura rigeze\n" +
                        "Imana yacu irahambaye mwisi (X2)\n" +
                        " R/ Tuzomubona\n" +
                        " Aserutse ava mu bicu\n" +
                        "Ashizwe hejuru\n" +
                        "Tuzomubona\n" +
                        "Ashizwe hejuru aganje\n" +
                        "Mu bwiza bwiwe\n" +
                        "Mu kugororoka\n" +
                        "N’umunyenkomezi \n" +
                        "2. Nzobayo nizigiye\n" +
                        "Ko yesu aje vuba\n" +
                        "Amahanga aririmbe\n" +
                        "Icubahiro kuri Kristo\n" +
                        "Tuzobona ijambo ryiwe n’\n" +
                        "Amasezerano yiwe bishika\n" +
                        "Bridge\n" +
                        "Eh’ubwiza bwiwe\n" +
                        "Bukayangana\n" +
                        "Butumurikira\n" +
                        "Halleluya\n" +
                        "N’ ishirwe hejuru\n" +
                        "N Imana iganje",
                        "Reuben Morgan / Robert Fergusson"),
                new Cantique(139, " In your city / UMURWA WAWE ", "1. Mbeg’umunezero nitwashika\n" +
                        "N’imiryango yijuru ikugururwa\n" +
                        "Imibabaro nubwoba bigakurwaho\n" +
                        "Tukubonye\n" +
                        "Imbona nkubone\n" +
                        "Pre-chorus\n" +
                        "Umwami wacu ahambaye\n" +
                        " R/ Uzoganza mu muco mwinshi\n" +
                        "Ibihe vyose uhimbazwa\n" +
                        "Ku mugwa wawe\n" +
                        "Natwe\n" +
                        "Abana bawe\n" +
                        "Tuzobona inganji yawe\n" +
                        "Ku mugwa wawe\n" +
                        "2. Urukundo numunezero bizoseseka\n" +
                        "Mu gihe abera bazinjra\n" +
                        "Mana dusenze ngo uze vuba\n" +
                        "Kuko twaremewe\n" +
                        "Kubana nawe\n" +
                        "Bridge\n" +
                        "Ibihe vyose tuzobayo\n" +
                        "Tuzokwaman’indirimbo\n" +
                        "Ni hashimwe uwatuzanye hano\n" +
                        "Yesu niryo zina ryiwe (x2)",
                        "Phil Wickam"),
                new Cantique(140, "You hold me now/ UNGUMBIRIYE ", "1. Kuruwo munsi ninabona\n" +
                        "Ivyo wambikiye\n" +
                        "Nkubony’imbonankubone\n" +
                        "Nkikujwe n’ubuntu bwawe\n" +
                        "Ubwoba bwose bushize\n" +
                        "Mu muco wo mu nyonga zawe\n" +
                        "Nezerew’ urukundo rwawe\n" +
                        "Ibihe vyose nidegemvya\n" +
                        "Pre-chorus\n" +
                        "Aho hari inzira z’inzahabu\n" +
                        "Twuzuye ubwiza bwawe\n" +
                        "Rek’iyi ndirimbo ibe iyawe gusa\n" +
                        " R/ Nta marira, ntakubabazwa\n" +
                        "Nta nihamwa niwaba ungumbiriye (X2)\n" +
                        "Nta mwijima, nta kurwara\n" +
                        "Nta kwihisha niwaba unumbiriye\n" +
                        "2. Muriki gihe nzoshikama\n" +
                        "Nezerewe canke mbabaye\n" +
                        "Har’umunsi urut’iyindi\n" +
                        "W’ivyizigiro bidashira\n" +
                        "Ah’uzoshirwa hejuru\n" +
                        "Utazirwa ibihe vyose\n" +
                        "Mbaho niteze uwo munsi\n" +
                        "Kuzobon’ubgiza bgawe\n" +
                        "Ah’iyi si izorangirira\n" +
                        "Ivyaremwe bibony’impore\n" +
                        "Rek’iyi ndirimbo ibe iyawe gusa\n" +
                        "Bridge\n" +
                        "Ibihe bidashira\n" +
                        "N’inkomezi zose\n" +
                        "Nzotazira izina ryawe",
                        "Matt Crocker,Reuben Morgan"),
                new Cantique(141, "Heaven is my home/ IWACU NI MWIJURU", "1. Wampaye ubuzima bw'ivyizigiro bihoraho\n" +
                        "Ivyizigiro bidashira\n" +
                        "Ndazi ko iwacu ni mwijuru\n" +
                        "Ubu buzima buzohera, ariko wewe uhoraho\n" +
                        "Nanje nguma muri wewe\n" +
                        "Ndazi ko iwacu ni mwijuru\n" +
                        "Iwacu ni mwijuru\n" +
                        " R/ Ni wewe nizigira\n" +
                        "Ndazi yuko uri uwanje ibihe vyose\n" +
                        "Ubwoba bwose bukuweho\n" +
                        "Ndazi yuko uri uwanje ibihe vyose\n" +
                        "2. Ivyoba vyose, ubwoba ntibuzoganza\n" +
                        "Bwose burakuweho\n" +
                        "Ndazi ko iwacu ni mwijuru\n" +
                        "Umutima wanje uryohererw'ijuru\n" +
                        "Iherezo si iherezo ryanje\n" +
                        "Ndazi ko iwacu ni mwijuru\n" +
                        "Iwacu Ni mwijuru\n" +
                        " R/ ×2\n" +
                        "Bridge:\n" +
                        "Urupfu rwatakaje ububasha kuri je\n" +
                        "Kuko iwacu Ni mwijuru\n" +
                        "Ibihe vyose nditezwe, ndarindiriwe (×2)\n" +
                        "Ndazi k’iwacu ni mwijuru×2\n" +
                        " R/ ×2\n" +
                        "Uri uwanje ibihe vyose ×2",
                        "Milkie Harvie"),
                new Cantique(142, "Sweet heaven up in heaven/Hiyo mw’ijuru", "1. N'iki insiguro y'ibihe vyose?\n" +
                        "Nigeze kuvyibaza\n" +
                        "Urazi aho wewe uzoba uri?\n" +
                        "Hari ivyizigiro aguhaye\n" +
                        "2. Bizogutera kwibaza\n" +
                        "Ubushobozi n'ubuntu bwiwe\n" +
                        "N'urukundo rwiwe rudahera\n" +
                        "Mwami nkumbuye kukubona\n" +
                        " R/ Imuhira hiyo mw'ijuru\n" +
                        " Aho ibicu bihora bisayangana\n" +
                        " Aho umwana w'Imana aganziye\n" +
                        " Mwami turaje i muhira iwawe\n" +
                        "3. Urazi ko umubi adukikuje\n" +
                        " Isi igerageza kuduca intege\n" +
                        " Ni urangamize mw'ijuru\n" +
                        " Umenye k’uzokwambara igitsibo umusi umwe\n" +
                        " R/\n" +
                        "4. Nimba isi ikunyiganyiza\n" +
                        " Hari ikintu kimwe c'ukuri\n" +
                        " Yesu arakunda umunyavyaha\n" +
                        " Yarateguye ikibanza azokubonamwo",
                        "Sammy C.Alcala"),
                new Cantique(143, " Heaven is our home/ NIWACU ", "Igitero ca 1:\n" +
                        "Mbikiwe ikibanza mw'ijuru\n" +
                        "Ukuri kuzima nizera\n" +
                        "Ico ni ikintu nzi\n" +
                        "Umukiza araganje\n" +
                        "Ubu buzima ni ubw'impwemu\n" +
                        "Nzoshira umutima ku bidahera\n" +
                        "Ico ni ikintu nzi\n" +
                        "Bibiliya irabimbwira\n" +
                        "Igitero ca 2:\n" +
                        "Ntawuzi umusi canke isaha\n" +
                        "Aragarutse ku bamumenye\n" +
                        "Tuzobon’inyonga ziwe\n" +
                        "N’ubuntu butangaje\n" +
                        "Amarira azoba yashize, ata bwoba\n" +
                        "Har’umuco w'ubwiza bwiwe\n" +
                        "Tuzomubona\n" +
                        "Tuzomuhobera\n" +
                        " R/ Mw'ijuru ni iwacu\n" +
                        " Ibihe vyose (×...)",
                        "Ben Tan,Melodie Wagner-Mäkinen, Beci Wakerley & David\n" +
                                "Wakerley"),
                new Cantique(144, "Christ est Roi / N’UMWAMI ", "1) Imana Data murukundo rwayo yarungitse kristo\n" +
                        "Ngwamurikire abo bose bazimiye\n" +
                        "Amanuka mw'isi, abantu ntibamwakira\n" +
                        "Bamubamb'I karuvari, ariko kristo arazuka.\n" +
                        " R/ N'umwami (3*) w’abami (2*)\n" +
                        "2) Yama mumitima yabamwizeye bose,\n" +
                        "Bageragejwe barakomera kukw'imana yab'ikiza.\n" +
                        " Bamamaza kw'isi yose,\n" +
                        " Yesu uwahezagiwe, bishimiye gutwara ibendera ryanditseko.\n" +
                        "R/\n" +
                        "3) Umus’umwe abizera bose bazokwegeranywa nawe,\n" +
                        "Bazova mumva zabo, ko muriwe bafis'ubuzima\n" +
                        "Bazohinduk'ubwami, isi izob'igihugu cabo\n" +
                        "Indirimbo yab'izoba icubahiro ca messiya\n" +
                        "R/",
                        "Richard Picotin"),
                new Cantique(145, ". Holy captivated/ NTANGARIRA UBUKURU", "1. Iyo nitegerej’Ubgiza\n" +
                        "Bg’ivyaremwe nawe\n" +
                        "Nkatangarira\n" +
                        "Ubukuru bgawe\n" +
                        "Umutima uraririmba\n" +
                        "Haleluya\n" +
                        "Ugusubiz’ishimwe ubereye\n" +
                        "2. Kandi iyo ndonder’\n" +
                        "Mu nyonga\n" +
                        "Z’Iyitaboneka\n" +
                        "Iyo ndamvuy’ukoboko\n" +
                        "Ngo ndonder’\n" +
                        "Uwandemye\n" +
                        "Uwo mwanya\n" +
                        "Ibingize vyose\n" +
                        "Vyongera gushima\n" +
                        "Izina RYawe\n" +
                        " R/ Ndirimba nti: “N’Uwer’\n" +
                        "Iman’ ihambaye\n" +
                        "Umwagazi yacumisw’\n" +
                        "Arabereye\n" +
                        "Kwakir’ishimwe\n" +
                        "Risumb’ayandi yose\n" +
                        "Yesu Mwana w’Imana\n" +
                        "Niryo zina ryiwe\n" +
                        "3. Iyo ndengewe\n" +
                        "N’ibinkikuje vyose\n" +
                        "Amarira yuzuy’umutima\n" +
                        "Agatemba\n" +
                        "Nzibuka ko n’umutima\n" +
                        "Wawe wamenywe\n" +
                        "No mumubabaro\n" +
                        "Urabereye\n" +
                        "4. Iyo niyumviriye\n" +
                        "Umusi tuzozurwa\n" +
                        "Nih’igicapo\n" +
                        "Ampamagara mw’izina\n" +
                        "Havyuk’icipfuzo\n" +
                        "Mumutima wanje\n" +
                        "Kuzojanwa\n" +
                        "Kubana nawe\n" +
                        "5. Mfis’igishika co\n" +
                        "Kuzobon’ abatashe\n" +
                        "Naho mw’isi\n" +
                        "Har’iminezero myinshi\n" +
                        "Ikindaje ishinga\n" +
                        "Kandi Niteze kwumva\n" +
                        "Ijwi rimpamagara",
                        "Nicolle C.Mullen"),
                new Cantique(146, "Come Behold the wondrous mystery/ IBANGA RIHAMBAYE ", "1. Rab’ibanga rihambaye\n" +
                        "Mu kuvuka kw'Umwami\n" +
                        "Uwuhimbazwa mw'ijuru hose\n" +
                        "Yambay'umubiri w'abantu\n" +
                        "Mumwijima no mumaganya\n" +
                        "Umuco w'isi waraje\n" +
                        "Raba Kristo, yabanye n'abantu\n" +
                        "Yaje ng'aducungure\n" +
                        "2. Rab’ibanga rihambaye\n" +
                        "Mwana w'umuntu atunganye\n" +
                        "Mu kubaho kwiwe no kubabazwa\n" +
                        "Ntiyigez'akor’ icaha\n" +
                        "Adamu wa kabiri kandi mwiza\n" +
                        "Yakijije abahona\n" +
                        "Kristo kwuzuzwa kw'ivyagezwe\n" +
                        "Duhagaz muri we\n" +
                        "3. Rab’ibanga rihambaye\n" +
                        "Kristo amanitswe ku giti\n" +
                        "Mugishingo c'abanyavyaha\n" +
                        "Mwagazi yanesheje mu kubambga\n" +
                        "Eh'ikiguzi c'ugucungurwa\n" +
                        "Umugambi wa Data urashika\n" +
                        "Yazany’abana benshi mu bgiza\n" +
                        "Buntu n'urukundo bitangaje\n" +
                        "4. Rab’ibanga rihambaye\n" +
                        "Imana Muremyi iricwa\n" +
                        "Ariko nta mva yomugumya\n" +
                        "Shimwa Mwami! Nimuzima\n" +
                        "Eh'umushuzo w'ukubohoka\n" +
                        "Ivyizigiro bidahinduka\n" +
                        "Kristo yazutse mu bushobozi\n" +
                        "Niko tuzomera agarutse",
                        "Matt Papa, Matt Boswell, Michael Bleecker"),
                new Cantique(147, "Home in Heaven/ MFISE IWACU", "1. Mfise iwacu mbikiwe igitsibo\n" +
                        "Ndons'urukundo ruhoraho\n" +
                        "Mfise iwacu nzoronk’'impera\n" +
                        "Azompanagura ayo narize\n" +
                        "R/\n" +
                        "Mw'ijuru, mw'ijuru\n" +
                        "Mfise iwacu mw'ijuru\n" +
                        "2. Mfise iwacu nziberayo\n" +
                        "Narahariwe ndi mu rugendo\n" +
                        "Mfise iwacu yangiriye ubuntu\n" +
                        "Nzobona Umwami\n" +
                        "Imbona nkubone\n" +
                        "3. Nari nazimiye Yes’arantora\n" +
                        "Kubw'amaraso yiwe, ubu mfis’ iwacu\n" +
                        "Mfise iwacu ndashing’intahe\n" +
                        "Mfise isezerano ko nzokubonayo",
                        "J.Brian Craig"),
                new Cantique(148, "Blessings/ Imigisha ", "1. Dusab'umugisha\n" +
                        "Dusab'amahoro\n" +
                        "Kugubwa neza mungo\n" +
                        "No kuzigamwa mw'itiro\n" +
                        "Dusab'ugukira no kuroranirwa\n" +
                        "N’Ubushobozi buturuhure imibabaro\n" +
                        "N'ubu uracumviriza ivyo dusaba\n" +
                        "Murukundo ntuduh’ivyo duh’agaciro\n" +
                        "Ch/ Mbe hamw’imigisha n’ugukiza\n" +
                        "Vyoba bica mumosozi\n" +
                        "Twosang’uba hafi y’ababujijw’itiro n’amaganya,\n" +
                        "N’imbabazi zihishije mu bigeragezo?\n" +
                        "2. Dusavy'ubgenge, twumv’ ijwi ryawe\n" +
                        "Tubabazwa n'ukutakwumva hafi\n" +
                        "Dukekeranya Ubuntu bgawe\n" +
                        "Nkah'ic'ijambo ryawe risezerana kidakwiye\n" +
                        "N’ubu uracumv'ijwi ritakamba\n" +
                        "Twipfuza kwongerezw’ ukwizera\n" +
                        "Bridge 1\n" +
                        "Abagenzi bahemutse\n" +
                        "Iy’umwijima wuzuye tumenya ko umubabaro utwibutsa ko hano s'iwacu\n" +
                        "Ch/\n" +
                        "Bridge 2\n" +
                        "Ivyampemukiye vyose n'ivyambabaje mubuzima\n" +
                        "Vyoba bihishura inyota nyinshi\n" +
                        "Ino si itokwuzuza\n" +
                        "Imvura n'ibihuhusi\n" +
                        "Ibigeragezo vy'ubu buzima, \n" +
                        "Bihishijemwo imbabazi",
                        "Laura Mixon Story Elvington"),
                new Cantique(149, "  Your Arrival/ UKUZA KWAWE  ", "1. Mur’iyi misi ya nyuma\n" +
                        "Ndemeshwa n’ivyizigiro\n" +
                        "Tubayeho twiteze\n" +
                        "Ukugaruka kwawe\n" +
                        "Hazob’ibikomeye\n" +
                        "Humvikan’ inzamba\n" +
                        "Uhamagar’abawe bose\n" +
                        "Bagusanganira\n" +
                        " R/ Turiteze\n" +
                        "N’igishika\n" +
                        "Ukuza kwawe (X2)\n" +
                        "Tudugijw’amajwi\n" +
                        "Duhimbaza\n" +
                        "Ukuza kwawe(X2)\n" +
                        "2. Tuzogumy’amatara yaka\n" +
                        "Tuzokwama turi maso\n" +
                        "Nubu turaciteze\n" +
                        "Ukuza kwawe\n" +
                        "Har’ ibikomeye bije\n" +
                        "Ubwami bwawe ni buze\n" +
                        "Utujan’iwacu mw’ijuru\n" +
                        "Ku murwa w’Imana\n" +
                        "N’u-ze vuba.\n" +
                        "R/\n" +
                        "Bridge\n" +
                        "N’indirimbo yacu\n" +
                        "Aho wew’uri\n" +
                        "Niho twagenewe\n" +
                        "Mwami\n" +
                        "Dushaka kubana nawe……",
                        " Phil Wickam"),


        };
        return  Arrays.asList(cantiqueArray);
    }
}
