//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.07.18 at 02:08:56 PM IST 
//


package com.eca.cme.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dependencyTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dependencyTypeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="IMPLEMENTS"/>
 *     &lt;enumeration value="REPORT_MEMBER"/>
 *     &lt;enumeration value="ACCESS_CONTROLLED_BY"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dependencyTypeType")
@XmlEnum
public enum DependencyTypeType {

    IMPLEMENTS,
    REPORT_MEMBER,
    ACCESS_CONTROLLED_BY;

    public String value() {
        return name();
    }

    public static DependencyTypeType fromValue(String v) {
        return valueOf(v);
    }

}