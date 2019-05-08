package com.scut.bookstore.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

/**
 * @author: kevin
 * @data: 2019/4/22 21:33
 * @description:
 */
@Entity
public class BookInfo implements Serializable {
    /**
     * 书id
     */
    @Id
    @GeneratedValue
    @Column
    private Integer bookId;

    /**
     * 书类别
     */
    @Column
    private Integer bookCategoryId;

    /**
     * 书名
     */
    @Column
    private String name;

    /**
     *简介
     */
    @Column
    private String outline;

    /**
     * 商品详情
     */
    @Column
    private String detail;

    /**
     * 出版社
     */
    @Column
    private String press;

    /**
     * 出版日期
     */
    @Column
    private Date publishDate;

    /**
     * 书的大小，尺寸
     */
    @Column
    private String size;

    /**
     * 版本
     */
    @Column
    private String version;

    /**
     * 书的作者
     */
    @Column
    private String author;

    /**
     * 翻译者
     */
    @Column
    private String translator;

    /**
     * 条形码
     */
    @Column
    private String isbn;

    /**
     *
     */
    @Column
    private Double price;

    /**
     * 总页数
     */
    @Column
    private Integer pages;

    /**
     * 目录
     */
    @Column
    private String catalog;

    /**
     * 市场价
     */
    @Column
    private Double marketPrice;

    /**
     * 会员价
     */
    @Column
    private Double memberPrice;

    /**
     * 成交量
     */
    @Column
    private Integer dealMount;

    /**
     * 浏览量
     */
    @Column
    private Integer lookMount;

    /**
     * 折扣
     */
    @Column
    private Double discount;

    /**
     * 图片地址
     */
    @Column
    private String imageUrl;

    /**
     * 库存量
     */
    @Column
    private Integer storeMount;

    /**
     * 入库时间
     */
    @Column
    private Date storeTime;

    /**
     * 封装方式
     */
    @Column
    private String packStyle;

    /**
     * 是否上架
     */
    @Column
    private Integer isShelf;

    public BookInfo(){
        super();
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public Integer getBookCategoryId() {
        return bookCategoryId;
    }

    public void setBookCategoryId(Integer bookCategoryId) {
        this.bookCategoryId = bookCategoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOutline() {
        return outline;
    }

    public void setOutline(String outline) {
        this.outline = outline;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getPress() {
        return press;
    }

    public void setPress(String press) {
        this.press = press;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTranslator() {
        return translator;
    }

    public void setTranslator(String translator) {
        this.translator = translator;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    public String getCatalog() {
        return catalog;
    }

    public void setCatalog(String catalog) {
        this.catalog = catalog;
    }

    public Double getMarketPrice() {
        return marketPrice;
    }

    public void setMarketPrice(Double marketPrice) {
        this.marketPrice = marketPrice;
    }

    public Double getMemberPrice() {
        return memberPrice;
    }

    public void setMemberPrice(Double memberPrice) {
        this.memberPrice = memberPrice;
    }

    public Integer getDealMount() {
        return dealMount;
    }

    public void setDealMount(Integer dealMount) {
        this.dealMount = dealMount;
    }

    public Integer getLookMount() {
        return lookMount;
    }

    public void setLookMount(Integer lookMount) {
        this.lookMount = lookMount;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Integer getStoreMount() {
        return storeMount;
    }

    public void setStoreMount(Integer storeMount) {
        this.storeMount = storeMount;
    }

    public Date getStoreTime() {
        return storeTime;
    }

    public void setStoreTime(Date storeTime) {
        this.storeTime = storeTime;
    }

    public String getPackStyle() {
        return packStyle;
    }

    public void setPackStyle(String packStyle) {
        this.packStyle = packStyle;
    }

    public Integer getIsShelf() {
        return isShelf;
    }

    public void setIsShelf(Integer isShelf) {
        this.isShelf = isShelf;
    }

}
