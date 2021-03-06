/**
 * This file is part of mycollab-services.
 *
 * mycollab-services is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * mycollab-services is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with mycollab-services.  If not, see <http://www.gnu.org/licenses/>.
 */
/*Domain class of table s_live_instances*/
package com.mycollab.common.domain;

import com.mycollab.core.arguments.ValuedBean;
import com.mycollab.db.metadata.Column;
import com.mycollab.db.metadata.Table;
import java.util.Date;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.hibernate.validator.constraints.Length;

@SuppressWarnings("ucd")
@Table("s_live_instances")
public class LiveInstance extends ValuedBean {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_live_instances.id
     *
     * @mbg.generated Fri Nov 25 23:57:10 ICT 2016
     */
    @Column("id")
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_live_instances.appVersion
     *
     * @mbg.generated Fri Nov 25 23:57:10 ICT 2016
     */
    @Length(max=45, message="Field value is too long")
    @Column("appVersion")
    private String appversion;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_live_instances.javaVersion
     *
     * @mbg.generated Fri Nov 25 23:57:10 ICT 2016
     */
    @Length(max=45, message="Field value is too long")
    @Column("javaVersion")
    private String javaversion;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_live_instances.installedDate
     *
     * @mbg.generated Fri Nov 25 23:57:10 ICT 2016
     */
    @Column("installedDate")
    private Date installeddate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_live_instances.sysId
     *
     * @mbg.generated Fri Nov 25 23:57:10 ICT 2016
     */
    @Length(max=100, message="Field value is too long")
    @Column("sysId")
    private String sysid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_live_instances.sysProperties
     *
     * @mbg.generated Fri Nov 25 23:57:10 ICT 2016
     */
    @Length(max=100, message="Field value is too long")
    @Column("sysProperties")
    private String sysproperties;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_live_instances.lastUpdatedDate
     *
     * @mbg.generated Fri Nov 25 23:57:10 ICT 2016
     */
    @Column("lastUpdatedDate")
    private Date lastupdateddate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_live_instances.numProjects
     *
     * @mbg.generated Fri Nov 25 23:57:10 ICT 2016
     */
    @Column("numProjects")
    private Integer numprojects;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_live_instances.numUsers
     *
     * @mbg.generated Fri Nov 25 23:57:10 ICT 2016
     */
    @Column("numUsers")
    private Integer numusers;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_live_instances.edition
     *
     * @mbg.generated Fri Nov 25 23:57:10 ICT 2016
     */
    @Length(max=45, message="Field value is too long")
    @Column("edition")
    private String edition;

    private static final long serialVersionUID = 1;

    public final boolean equals(Object obj) {
        if (obj == null) { return false;}
        if (obj == this) { return true;}
        if (!obj.getClass().isAssignableFrom(getClass())) { return false;}
        LiveInstance item = (LiveInstance)obj;
        return new EqualsBuilder().append(id, item.id).build();
    }

    public final int hashCode() {
        return new HashCodeBuilder(1117, 1559).append(id).build();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_live_instances.id
     *
     * @return the value of s_live_instances.id
     *
     * @mbg.generated Fri Nov 25 23:57:10 ICT 2016
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_live_instances.id
     *
     * @param id the value for s_live_instances.id
     *
     * @mbg.generated Fri Nov 25 23:57:10 ICT 2016
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_live_instances.appVersion
     *
     * @return the value of s_live_instances.appVersion
     *
     * @mbg.generated Fri Nov 25 23:57:10 ICT 2016
     */
    public String getAppversion() {
        return appversion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_live_instances.appVersion
     *
     * @param appversion the value for s_live_instances.appVersion
     *
     * @mbg.generated Fri Nov 25 23:57:10 ICT 2016
     */
    public void setAppversion(String appversion) {
        this.appversion = appversion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_live_instances.javaVersion
     *
     * @return the value of s_live_instances.javaVersion
     *
     * @mbg.generated Fri Nov 25 23:57:10 ICT 2016
     */
    public String getJavaversion() {
        return javaversion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_live_instances.javaVersion
     *
     * @param javaversion the value for s_live_instances.javaVersion
     *
     * @mbg.generated Fri Nov 25 23:57:10 ICT 2016
     */
    public void setJavaversion(String javaversion) {
        this.javaversion = javaversion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_live_instances.installedDate
     *
     * @return the value of s_live_instances.installedDate
     *
     * @mbg.generated Fri Nov 25 23:57:10 ICT 2016
     */
    public Date getInstalleddate() {
        return installeddate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_live_instances.installedDate
     *
     * @param installeddate the value for s_live_instances.installedDate
     *
     * @mbg.generated Fri Nov 25 23:57:10 ICT 2016
     */
    public void setInstalleddate(Date installeddate) {
        this.installeddate = installeddate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_live_instances.sysId
     *
     * @return the value of s_live_instances.sysId
     *
     * @mbg.generated Fri Nov 25 23:57:10 ICT 2016
     */
    public String getSysid() {
        return sysid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_live_instances.sysId
     *
     * @param sysid the value for s_live_instances.sysId
     *
     * @mbg.generated Fri Nov 25 23:57:10 ICT 2016
     */
    public void setSysid(String sysid) {
        this.sysid = sysid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_live_instances.sysProperties
     *
     * @return the value of s_live_instances.sysProperties
     *
     * @mbg.generated Fri Nov 25 23:57:10 ICT 2016
     */
    public String getSysproperties() {
        return sysproperties;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_live_instances.sysProperties
     *
     * @param sysproperties the value for s_live_instances.sysProperties
     *
     * @mbg.generated Fri Nov 25 23:57:10 ICT 2016
     */
    public void setSysproperties(String sysproperties) {
        this.sysproperties = sysproperties;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_live_instances.lastUpdatedDate
     *
     * @return the value of s_live_instances.lastUpdatedDate
     *
     * @mbg.generated Fri Nov 25 23:57:10 ICT 2016
     */
    public Date getLastupdateddate() {
        return lastupdateddate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_live_instances.lastUpdatedDate
     *
     * @param lastupdateddate the value for s_live_instances.lastUpdatedDate
     *
     * @mbg.generated Fri Nov 25 23:57:10 ICT 2016
     */
    public void setLastupdateddate(Date lastupdateddate) {
        this.lastupdateddate = lastupdateddate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_live_instances.numProjects
     *
     * @return the value of s_live_instances.numProjects
     *
     * @mbg.generated Fri Nov 25 23:57:10 ICT 2016
     */
    public Integer getNumprojects() {
        return numprojects;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_live_instances.numProjects
     *
     * @param numprojects the value for s_live_instances.numProjects
     *
     * @mbg.generated Fri Nov 25 23:57:10 ICT 2016
     */
    public void setNumprojects(Integer numprojects) {
        this.numprojects = numprojects;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_live_instances.numUsers
     *
     * @return the value of s_live_instances.numUsers
     *
     * @mbg.generated Fri Nov 25 23:57:10 ICT 2016
     */
    public Integer getNumusers() {
        return numusers;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_live_instances.numUsers
     *
     * @param numusers the value for s_live_instances.numUsers
     *
     * @mbg.generated Fri Nov 25 23:57:10 ICT 2016
     */
    public void setNumusers(Integer numusers) {
        this.numusers = numusers;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_live_instances.edition
     *
     * @return the value of s_live_instances.edition
     *
     * @mbg.generated Fri Nov 25 23:57:10 ICT 2016
     */
    public String getEdition() {
        return edition;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_live_instances.edition
     *
     * @param edition the value for s_live_instances.edition
     *
     * @mbg.generated Fri Nov 25 23:57:10 ICT 2016
     */
    public void setEdition(String edition) {
        this.edition = edition;
    }

    public enum Field {
        id,
        appversion,
        javaversion,
        installeddate,
        sysid,
        sysproperties,
        lastupdateddate,
        numprojects,
        numusers,
        edition;

        public boolean equalTo(Object value) {
            return name().equals(value);
        }
    }
}