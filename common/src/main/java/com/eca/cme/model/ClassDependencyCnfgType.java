//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.07.18 at 02:08:56 PM IST 
//


package com.eca.cme.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for classDependencyCnfgType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="classDependencyCnfgType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="parent-class" use="required" type="{}classNameType" />
 *       &lt;attribute name="dependency-type" use="required" type="{}dependencyTypeType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "classDependencyCnfgType")
public class ClassDependencyCnfgType {

    @XmlAttribute(name = "parent-class", required = true)
    protected String parentClass;
    @XmlAttribute(name = "dependency-type", required = true)
    protected DependencyTypeType dependencyType;

    /**
     * Gets the value of the parentClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentClass() {
        return parentClass;
    }

    /**
     * Sets the value of the parentClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentClass(String value) {
        this.parentClass = value;
    }

    /**
     * Gets the value of the dependencyType property.
     * 
     * @return
     *     possible object is
     *     {@link DependencyTypeType }
     *     
     */
    public DependencyTypeType getDependencyType() {
        return dependencyType;
    }

    /**
     * Sets the value of the dependencyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DependencyTypeType }
     *     
     */
    public void setDependencyType(DependencyTypeType value) {
        this.dependencyType = value;
    }

}