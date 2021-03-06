package com.cf.bootssm.bean;

import java.io.Serializable;
import java.util.Date;

public class CProject implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column c_project.id
     *
     * @mbg.generated
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column c_project.pjtName
     *
     * @mbg.generated
     */
    private String pjtname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column c_project.pjtSynopsis
     *
     * @mbg.generated
     */
    private String pjtsynopsis;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column c_project.pjtAdds
     *
     * @mbg.generated
     */
    private String pjtadds;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column c_project.lrr
     *
     * @mbg.generated
     */
    private String lrr;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column c_project.pjtType
     *
     * @mbg.generated
     */
    private String pjttype;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column c_project.pjtNature
     *
     * @mbg.generated
     */
    private String pjtnature;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column c_project.bidManager
     *
     * @mbg.generated
     */
    private String bidmanager;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column c_project.bidExpDate
     *
     * @mbg.generated
     */
    private Date bidexpdate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column c_project.bidExpCost
     *
     * @mbg.generated
     */
    private String bidexpcost;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column c_project.expCntCost
     *
     * @mbg.generated
     */
    private String expcntcost;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column c_project.devOrg
     *
     * @mbg.generated
     */
    private String devorg;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column c_project.contacts
     *
     * @mbg.generated
     */
    private String contacts;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column c_project.phone
     *
     * @mbg.generated
     */
    private String phone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column c_project.remark
     *
     * @mbg.generated
     */
    private String remark;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column c_project.designOrg
     *
     * @mbg.generated
     */
    private String designorg;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column c_project.supervisoroOrg
     *
     * @mbg.generated
     */
    private String supervisoroorg;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column c_project.add_time
     *
     * @mbg.generated
     */
    private Date addTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column c_project.last_time
     *
     * @mbg.generated
     */
    private Date lastTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column c_project.price
     *
     * @mbg.generated
     */
    private String price;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column c_project.stat
     *
     * @mbg.generated
     */
    private Date stat;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column c_project.end
     *
     * @mbg.generated
     */
    private Date end;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table c_project
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column c_project.id
     *
     * @return the value of c_project.id
     *
     * @mbg.generated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column c_project.id
     *
     * @param id the value for c_project.id
     *
     * @mbg.generated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column c_project.pjtName
     *
     * @return the value of c_project.pjtName
     *
     * @mbg.generated
     */
    public String getPjtname() {
        return pjtname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column c_project.pjtName
     *
     * @param pjtname the value for c_project.pjtName
     *
     * @mbg.generated
     */
    public void setPjtname(String pjtname) {
        this.pjtname = pjtname == null ? null : pjtname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column c_project.pjtSynopsis
     *
     * @return the value of c_project.pjtSynopsis
     *
     * @mbg.generated
     */
    public String getPjtsynopsis() {
        return pjtsynopsis;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column c_project.pjtSynopsis
     *
     * @param pjtsynopsis the value for c_project.pjtSynopsis
     *
     * @mbg.generated
     */
    public void setPjtsynopsis(String pjtsynopsis) {
        this.pjtsynopsis = pjtsynopsis == null ? null : pjtsynopsis.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column c_project.pjtAdds
     *
     * @return the value of c_project.pjtAdds
     *
     * @mbg.generated
     */
    public String getPjtadds() {
        return pjtadds;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column c_project.pjtAdds
     *
     * @param pjtadds the value for c_project.pjtAdds
     *
     * @mbg.generated
     */
    public void setPjtadds(String pjtadds) {
        this.pjtadds = pjtadds == null ? null : pjtadds.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column c_project.lrr
     *
     * @return the value of c_project.lrr
     *
     * @mbg.generated
     */
    public String getLrr() {
        return lrr;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column c_project.lrr
     *
     * @param lrr the value for c_project.lrr
     *
     * @mbg.generated
     */
    public void setLrr(String lrr) {
        this.lrr = lrr == null ? null : lrr.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column c_project.pjtType
     *
     * @return the value of c_project.pjtType
     *
     * @mbg.generated
     */
    public String getPjttype() {
        return pjttype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column c_project.pjtType
     *
     * @param pjttype the value for c_project.pjtType
     *
     * @mbg.generated
     */
    public void setPjttype(String pjttype) {
        this.pjttype = pjttype == null ? null : pjttype.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column c_project.pjtNature
     *
     * @return the value of c_project.pjtNature
     *
     * @mbg.generated
     */
    public String getPjtnature() {
        return pjtnature;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column c_project.pjtNature
     *
     * @param pjtnature the value for c_project.pjtNature
     *
     * @mbg.generated
     */
    public void setPjtnature(String pjtnature) {
        this.pjtnature = pjtnature == null ? null : pjtnature.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column c_project.bidManager
     *
     * @return the value of c_project.bidManager
     *
     * @mbg.generated
     */
    public String getBidmanager() {
        return bidmanager;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column c_project.bidManager
     *
     * @param bidmanager the value for c_project.bidManager
     *
     * @mbg.generated
     */
    public void setBidmanager(String bidmanager) {
        this.bidmanager = bidmanager == null ? null : bidmanager.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column c_project.bidExpDate
     *
     * @return the value of c_project.bidExpDate
     *
     * @mbg.generated
     */
    public Date getBidexpdate() {
        return bidexpdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column c_project.bidExpDate
     *
     * @param bidexpdate the value for c_project.bidExpDate
     *
     * @mbg.generated
     */
    public void setBidexpdate(Date bidexpdate) {
        this.bidexpdate = bidexpdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column c_project.bidExpCost
     *
     * @return the value of c_project.bidExpCost
     *
     * @mbg.generated
     */
    public String getBidexpcost() {
        return bidexpcost;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column c_project.bidExpCost
     *
     * @param bidexpcost the value for c_project.bidExpCost
     *
     * @mbg.generated
     */
    public void setBidexpcost(String bidexpcost) {
        this.bidexpcost = bidexpcost == null ? null : bidexpcost.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column c_project.expCntCost
     *
     * @return the value of c_project.expCntCost
     *
     * @mbg.generated
     */
    public String getExpcntcost() {
        return expcntcost;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column c_project.expCntCost
     *
     * @param expcntcost the value for c_project.expCntCost
     *
     * @mbg.generated
     */
    public void setExpcntcost(String expcntcost) {
        this.expcntcost = expcntcost == null ? null : expcntcost.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column c_project.devOrg
     *
     * @return the value of c_project.devOrg
     *
     * @mbg.generated
     */
    public String getDevorg() {
        return devorg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column c_project.devOrg
     *
     * @param devorg the value for c_project.devOrg
     *
     * @mbg.generated
     */
    public void setDevorg(String devorg) {
        this.devorg = devorg == null ? null : devorg.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column c_project.contacts
     *
     * @return the value of c_project.contacts
     *
     * @mbg.generated
     */
    public String getContacts() {
        return contacts;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column c_project.contacts
     *
     * @param contacts the value for c_project.contacts
     *
     * @mbg.generated
     */
    public void setContacts(String contacts) {
        this.contacts = contacts == null ? null : contacts.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column c_project.phone
     *
     * @return the value of c_project.phone
     *
     * @mbg.generated
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column c_project.phone
     *
     * @param phone the value for c_project.phone
     *
     * @mbg.generated
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column c_project.remark
     *
     * @return the value of c_project.remark
     *
     * @mbg.generated
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column c_project.remark
     *
     * @param remark the value for c_project.remark
     *
     * @mbg.generated
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column c_project.designOrg
     *
     * @return the value of c_project.designOrg
     *
     * @mbg.generated
     */
    public String getDesignorg() {
        return designorg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column c_project.designOrg
     *
     * @param designorg the value for c_project.designOrg
     *
     * @mbg.generated
     */
    public void setDesignorg(String designorg) {
        this.designorg = designorg == null ? null : designorg.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column c_project.supervisoroOrg
     *
     * @return the value of c_project.supervisoroOrg
     *
     * @mbg.generated
     */
    public String getSupervisoroorg() {
        return supervisoroorg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column c_project.supervisoroOrg
     *
     * @param supervisoroorg the value for c_project.supervisoroOrg
     *
     * @mbg.generated
     */
    public void setSupervisoroorg(String supervisoroorg) {
        this.supervisoroorg = supervisoroorg == null ? null : supervisoroorg.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column c_project.add_time
     *
     * @return the value of c_project.add_time
     *
     * @mbg.generated
     */
    public Date getAddTime() {
        return addTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column c_project.add_time
     *
     * @param addTime the value for c_project.add_time
     *
     * @mbg.generated
     */
    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column c_project.last_time
     *
     * @return the value of c_project.last_time
     *
     * @mbg.generated
     */
    public Date getLastTime() {
        return lastTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column c_project.last_time
     *
     * @param lastTime the value for c_project.last_time
     *
     * @mbg.generated
     */
    public void setLastTime(Date lastTime) {
        this.lastTime = lastTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column c_project.price
     *
     * @return the value of c_project.price
     *
     * @mbg.generated
     */
    public String getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column c_project.price
     *
     * @param price the value for c_project.price
     *
     * @mbg.generated
     */
    public void setPrice(String price) {
        this.price = price == null ? null : price.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column c_project.stat
     *
     * @return the value of c_project.stat
     *
     * @mbg.generated
     */
    public Date getStat() {
        return stat;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column c_project.stat
     *
     * @param stat the value for c_project.stat
     *
     * @mbg.generated
     */
    public void setStat(Date stat) {
        this.stat = stat;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column c_project.end
     *
     * @return the value of c_project.end
     *
     * @mbg.generated
     */
    public Date getEnd() {
        return end;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column c_project.end
     *
     * @param end the value for c_project.end
     *
     * @mbg.generated
     */
    public void setEnd(Date end) {
        this.end = end;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table c_project
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", pjtname=").append(pjtname);
        sb.append(", pjtsynopsis=").append(pjtsynopsis);
        sb.append(", pjtadds=").append(pjtadds);
        sb.append(", lrr=").append(lrr);
        sb.append(", pjttype=").append(pjttype);
        sb.append(", pjtnature=").append(pjtnature);
        sb.append(", bidmanager=").append(bidmanager);
        sb.append(", bidexpdate=").append(bidexpdate);
        sb.append(", bidexpcost=").append(bidexpcost);
        sb.append(", expcntcost=").append(expcntcost);
        sb.append(", devorg=").append(devorg);
        sb.append(", contacts=").append(contacts);
        sb.append(", phone=").append(phone);
        sb.append(", remark=").append(remark);
        sb.append(", designorg=").append(designorg);
        sb.append(", supervisoroorg=").append(supervisoroorg);
        sb.append(", addTime=").append(addTime);
        sb.append(", lastTime=").append(lastTime);
        sb.append(", price=").append(price);
        sb.append(", stat=").append(stat);
        sb.append(", end=").append(end);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}