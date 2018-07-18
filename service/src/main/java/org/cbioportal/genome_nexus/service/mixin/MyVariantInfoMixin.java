package org.cbioportal.genome_nexus.service.mixin;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import org.cbioportal.genome_nexus.model.ClinVar;
import org.cbioportal.genome_nexus.model.Cosmic;
import org.cbioportal.genome_nexus.model.Snpeff;
import org.cbioportal.genome_nexus.model.Vcf;


@JsonIgnoreProperties(ignoreUnknown = true)
public class MyVariantInfoMixin
{
    @JsonProperty(value = "hgvs", required = true)
    private String hgvs;

    @JsonProperty(value = "version", required = true)
    private Integer version;

    @JsonProperty(value = "snpeff", required = true)
    private Snpeff snpeff;

    @JsonProperty(value = "vcf", required = true)
    private Vcf vcf;
    
    @JsonProperty(value = "dbsnp", required = true)
    private Integer dbsnp;

    @JsonProperty(value = "cosmic", required = true)
    private Cosmic cosmic;

    @JsonProperty(value = "clinvar", required = true)
    private ClinVar clinvar;
}
