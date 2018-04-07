package com.netshoes.problems.problem2.impl;

import java.util.Arrays;

// Nao alterar o nome dessa classe!
public class CompareVersionImpl {

    // Nao alterar a assinatura desse metodo
    public static int compareVersion(String version1, String version2) {
       Integer ret = 0;
       boolean check = true;
        String v1[] = version1.split("[.]");
        String v2[] = version2.split("[.]");



        for(int x =0; x < v1.length; x++)
        {
            if(Integer.parseInt(v1[x]) >  Integer.parseInt(v2[x]) && check)
            {
                ret = 1;
                check = false;
            }
            else if(Integer.parseInt(v2[x]) >  Integer.parseInt(v1[x]) && check){
                ret = -1;
                check = false;
            }
        }

        return ret;
    }



}
