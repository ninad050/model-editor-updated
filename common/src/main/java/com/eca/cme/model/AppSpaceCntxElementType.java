//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.07.18 at 02:08:56 PM IST 
//


package com.eca.cme.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for appSpaceCntxElementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="appSpaceCntxElementType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="class-dependency-cnfg" type="{}classDependencyCnfgType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="class-trigger-actn-cnfg" type="{}classTriggerActnCnfgType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="class-relation-cnfg" type="{}classRelationCnfgType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="class-attribute-cnfg" type="{}classAttributeCnfgType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{}cntxtType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "appSpaceCntxElementType", propOrder = {
    "classDependencyCnfg",
    "classTriggerActnCnfg",
    "classRelationCnfg",
    "classAttributeCnfg"
})
public class AppSpaceCntxElementType {

    @XmlElement(name = "class-dependency-cnfg")
    protected List<ClassDependencyCnfgType> classDependencyCnfg;
    @XmlElement(name = "class-trigger-actn-cnfg")
    protected List<ClassTriggerActnCnfgType> classTriggerActnCnfg;
    @XmlElement(name = "class-relation-cnfg")
    protected List<ClassRelationCnfgType> classRelationCnfg;
    @XmlElement(name = "class-attribute-cnfg")
    protected List<ClassAttributeCnfgType> classAttributeCnfg;
    @XmlAttribute(name = "id", required = true)
    protected String id;

    /**
     * Gets the value of the classDependencyCnfg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the classDependencyCnfg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClassDependencyCnfg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClassDependencyCnfgType }
     * 
     * 
     */
    public List<ClassDependencyCnfgType> getClassDependencyCnfg() {
        if (classDependencyCnfg == null) {
            classDependencyCnfg = new ArrayList<ClassDependencyCnfgType>();
        }
        return this.classDependencyCnfg;
    }

    /**
     * Gets the value of the classTriggerActnCnfg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the classTriggerActnCnfg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClassTriggerActnCnfg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClassTriggerActnCnfgType }
     * 
     * 
     */
    public List<ClassTriggerActnCnfgType> getClassTriggerActnCnfg() {
        if (classTriggerActnCnfg == null) {
            classTriggerActnCnfg = new ArrayList<ClassTriggerActnCnfgType>();
        }
        return this.classTriggerActnCnfg;
    }

    /**
     * Gets the value of the classRelationCnfg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the classRelationCnfg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClassRelationCnfg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClassRelationCnfgType }
     * 
     * 
     */
    public List<ClassRelationCnfgType> getClassRelationCnfg() {
        if (classRelationCnfg == null) {
            classRelationCnfg = new ArrayList<ClassRelationCnfgType>();
        }
        return this.classRelationCnfg;
    }

    /**
     * Gets the value of the classAttributeCnfg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the classAttributeCnfg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClassAttributeCnfg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClassAttributeCnfgType }
     * 
     * 
     */
    public List<ClassAttributeCnfgType> getClassAttributeCnfg() {
        if (classAttributeCnfg == null) {
            classAttributeCnfg = new ArrayList<ClassAttributeCnfgType>();
        }
        return this.classAttributeCnfg;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}
