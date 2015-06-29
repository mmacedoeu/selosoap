//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.7 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2015.06.29 às 03:42:39 PM BRT 
//


package br.com.valid.sicobe.middleware.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de producao complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="producao">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CodigoProducao" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Data" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Selo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "producao", propOrder = {
    "codigoProducao",
    "data",
    "selo"
})
public class Producao {

    @XmlElement(name = "CodigoProducao")
    protected long codigoProducao;
    @XmlElement(name = "Data", required = true)
    protected String data;
    @XmlElement(name = "Selo", required = true)
    protected String selo;

    /**
     * Obtém o valor da propriedade codigoProducao.
     * 
     */
    public long getCodigoProducao() {
        return codigoProducao;
    }

    /**
     * Define o valor da propriedade codigoProducao.
     * 
     */
    public void setCodigoProducao(long value) {
        this.codigoProducao = value;
    }

    /**
     * Obtém o valor da propriedade data.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getData() {
        return data;
    }

    /**
     * Define o valor da propriedade data.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setData(String value) {
        this.data = value;
    }

    /**
     * Obtém o valor da propriedade selo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSelo() {
        return selo;
    }

    /**
     * Define o valor da propriedade selo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSelo(String value) {
        this.selo = value;
    }

}
