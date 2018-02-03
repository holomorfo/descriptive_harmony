/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package polifoniaLib.defs;

/**
 * Clasifica el acorde de acuerdo a tipo y el cruce de voces. Revisar articulo
 * para el significado de los numeros % Notacion tipos de acordes 000000xx
 * DER-IZQ primeros dos digitos base del acorde modulo 12 0000xx00 segundos dos
 * digitos tipo del acorde 000x0000 terceros dos digitos es la inversion
 * 00x00000 cruce de voces 2 = cruce, 1 = bueno 0x000000 algun par de voces sep
 * por mas de una octava 2=sep,1=bueno
 *
 * 00 01 02 03 04
 *
 * 00 = No definido
 *
 * 01 = Mayor (TM) [0,4,7]
 *
 * 02 = Menor (Tm) [0,3,7]
 *
 * 03 = Dim (To) [0,3,6]
 *
 * 04 = Aum (T+) [0,4,8]
 *
 * 05 = M7 * Major seventh M7 (TM,7M) [0,4,7,11]
 *
 * 06 = Mm7 * Major minor seventh Mm7 (TM,7m) [0,4,7,10]
 *
 * 07 = m7 * Minor seventh m7 (Tm,7m) [0,3,7,10]
 *
 * 08 = o/7 * Half-dim seventh o/7 (To,7m) [0,3,6,10]
 *
 * 09 = o7 * dim seventh o7 (To,7o) [0,3,6, 9]
 *
 * 10 = I+ * acorde I escala menor con VII grado aumentado [0,3,7,11]
 *
 * 11 = III+ * acorde III escala menor con VII grado aumentado [0,4,8,11]
 *
 * 12 = acorde D7 sin quinta [0,4,10]
 *
 * 13 = Tonica menor sin quinta [0,4]
 *
 * 14 = Tonica mayor sin quinta
 *
 * Triadas Diatonicos en escala mayor I ii iii IV V vi viio
 *
 * Septimos Diatonicos en escala Mayor I_M7 ii_m7 iii_m7 IV_M7 V_Mm7 vi_m7
 * vii/o_o/7
 *
 * Revisar con piano Triadas Diatonicos en escala menor i iio ii III III+ iv IV
 * v V VI #vio VII viio
 *
 * Septimos Diatonicos en escala menor i_m7 ii/o_o/7 III_M7 iv_m7 V_Mm7 VI_M7
 * viio_o7
 */
public class DefAcordes {

    
    public static String aS_mayor = "M";
    public static float[] a_mayor = {0, 4, 7};
    public static String bS_menor = "m";
    public static float[] b_menor = {0, 3, 7};
    public static String cS_dim = "o";
    public static float[] c_dim = {0, 3, 6};
    public static String dS_aum = "+";
    public static float[] d_aum = {0, 4, 8};
    public static String eS_M7 = "M7";
    public static float[] e_M7 = {0, 4, 7, 11};
    public static String fS_Mm7 = "Mm7";
    public static float[] f_Mm7 = {0, 4, 7, 10};
    public static String gS_m7 = "m7";
    public static float[] g_m7 = {0, 3, 7, 10};
    public static String hS_semiDim7 = "o/7";
    public static float[] h_semiDim7 = {0, 3, 6, 10};
    public static String iS_dim7 = "o7";
    public static float[] i_dim7 = {0, 3, 6, 9};
    // Acordes que surgen del menor arm y mel
    public static String jS_ImenVIIdim = "I+";//"o7"
    public static float[] j_ImenVIIdim = {0, 3, 7, 11};
    public static String kS_IIImenVIIaum = "III+";//"o7"
    public static float[] k_IIImenVIIaum = {0, 4, 8, 11};
    public static String lS_D7_sin5 = "D7*5";//Septimo incompleto sin quinta
    public static float[] l_D7_sin5 = {0, 4, 10};
    // Alteraciones de acordes
    public static String S_nap = "IIb1";
    public static float[] nap = {0, 4, 7};
    // Dominantes alterados
    public static String S_VM7p5 = "VM7#5";
    public static float[] VM7p5 = {0, 4, 8, 10};
    //Dominante novena
    public static String S_V9Ms5 = "V9Ms5";
    public static float[] V9Ms5 = {0, 2, 4, 10};
//    public static float[] V9Ms5 = {0, 4, 10, 2};

    public static String S_V9ms5 = "V9ms5";
    public static float[] V9ms5 = {0, 1, 4, 10};
//    public static float[] V9ms5 = {0, 4, 10, 1};

    
    //    public static float[] m_may_sin5 = {0, 4};
//    public static String m_S_may_sin5 = "M*5";//mayor sin quinta
//    public static float[] n_men_sin5 = {0, 3};
//    public static String n_S_men_sin5 = "m*5";
//
//                tpS += "*5,";// Septimo incompleto sin quinta
//                break;
//            case 14:
//                tpS += "*5,";// Septimo incompleto sin quinta
//                break;
//
//
}
