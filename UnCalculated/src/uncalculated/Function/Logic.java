/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uncalculated.Function;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author basazard
 */
public class Logic {
    
    public Boolean checkName(String name){
        Pattern pattern = Pattern.compile("^[a-zA-Z_]*$");
        
        Matcher matcher = pattern.matcher(name);
        return matcher.matches();
    }
    
    public Boolean checkNISN(String nisn){
        Pattern pattern = Pattern.compile("^[0-9_]*$");
        
        Matcher matcher = pattern.matcher(nisn);{
        return matcher.matches();
    }
        
    }
}
