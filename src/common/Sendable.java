/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package common;

import java.io.Serializable;

/**
 *
 * @author Administraattori
 */
public class Sendable implements Serializable {
    
    private String sWindowcode;
    
    public void setReceivingWindowcode( String sWindowCode ) { this.sWindowcode = sWindowCode; }
    public String getReceivingWindowcode() { return this.sWindowcode; }
    
}
