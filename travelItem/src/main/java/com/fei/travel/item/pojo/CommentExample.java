package com.fei.travel.item.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CommentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CommentExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Long value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Long value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Long value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Long> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Long> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andLvIsNull() {
            addCriterion("lv is null");
            return (Criteria) this;
        }

        public Criteria andLvIsNotNull() {
            addCriterion("lv is not null");
            return (Criteria) this;
        }

        public Criteria andLvEqualTo(Integer value) {
            addCriterion("lv =", value, "lv");
            return (Criteria) this;
        }

        public Criteria andLvNotEqualTo(Integer value) {
            addCriterion("lv <>", value, "lv");
            return (Criteria) this;
        }

        public Criteria andLvGreaterThan(Integer value) {
            addCriterion("lv >", value, "lv");
            return (Criteria) this;
        }

        public Criteria andLvGreaterThanOrEqualTo(Integer value) {
            addCriterion("lv >=", value, "lv");
            return (Criteria) this;
        }

        public Criteria andLvLessThan(Integer value) {
            addCriterion("lv <", value, "lv");
            return (Criteria) this;
        }

        public Criteria andLvLessThanOrEqualTo(Integer value) {
            addCriterion("lv <=", value, "lv");
            return (Criteria) this;
        }

        public Criteria andLvIn(List<Integer> values) {
            addCriterion("lv in", values, "lv");
            return (Criteria) this;
        }

        public Criteria andLvNotIn(List<Integer> values) {
            addCriterion("lv not in", values, "lv");
            return (Criteria) this;
        }

        public Criteria andLvBetween(Integer value1, Integer value2) {
            addCriterion("lv between", value1, value2, "lv");
            return (Criteria) this;
        }

        public Criteria andLvNotBetween(Integer value1, Integer value2) {
            addCriterion("lv not between", value1, value2, "lv");
            return (Criteria) this;
        }

        public Criteria andVipLvIsNull() {
            addCriterion("vip_lv is null");
            return (Criteria) this;
        }

        public Criteria andVipLvIsNotNull() {
            addCriterion("vip_lv is not null");
            return (Criteria) this;
        }

        public Criteria andVipLvEqualTo(Integer value) {
            addCriterion("vip_lv =", value, "vipLv");
            return (Criteria) this;
        }

        public Criteria andVipLvNotEqualTo(Integer value) {
            addCriterion("vip_lv <>", value, "vipLv");
            return (Criteria) this;
        }

        public Criteria andVipLvGreaterThan(Integer value) {
            addCriterion("vip_lv >", value, "vipLv");
            return (Criteria) this;
        }

        public Criteria andVipLvGreaterThanOrEqualTo(Integer value) {
            addCriterion("vip_lv >=", value, "vipLv");
            return (Criteria) this;
        }

        public Criteria andVipLvLessThan(Integer value) {
            addCriterion("vip_lv <", value, "vipLv");
            return (Criteria) this;
        }

        public Criteria andVipLvLessThanOrEqualTo(Integer value) {
            addCriterion("vip_lv <=", value, "vipLv");
            return (Criteria) this;
        }

        public Criteria andVipLvIn(List<Integer> values) {
            addCriterion("vip_lv in", values, "vipLv");
            return (Criteria) this;
        }

        public Criteria andVipLvNotIn(List<Integer> values) {
            addCriterion("vip_lv not in", values, "vipLv");
            return (Criteria) this;
        }

        public Criteria andVipLvBetween(Integer value1, Integer value2) {
            addCriterion("vip_lv between", value1, value2, "vipLv");
            return (Criteria) this;
        }

        public Criteria andVipLvNotBetween(Integer value1, Integer value2) {
            addCriterion("vip_lv not between", value1, value2, "vipLv");
            return (Criteria) this;
        }

        public Criteria andViewStarIsNull() {
            addCriterion("view_star is null");
            return (Criteria) this;
        }

        public Criteria andViewStarIsNotNull() {
            addCriterion("view_star is not null");
            return (Criteria) this;
        }

        public Criteria andViewStarEqualTo(BigDecimal value) {
            addCriterion("view_star =", value, "viewStar");
            return (Criteria) this;
        }

        public Criteria andViewStarNotEqualTo(BigDecimal value) {
            addCriterion("view_star <>", value, "viewStar");
            return (Criteria) this;
        }

        public Criteria andViewStarGreaterThan(BigDecimal value) {
            addCriterion("view_star >", value, "viewStar");
            return (Criteria) this;
        }

        public Criteria andViewStarGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("view_star >=", value, "viewStar");
            return (Criteria) this;
        }

        public Criteria andViewStarLessThan(BigDecimal value) {
            addCriterion("view_star <", value, "viewStar");
            return (Criteria) this;
        }

        public Criteria andViewStarLessThanOrEqualTo(BigDecimal value) {
            addCriterion("view_star <=", value, "viewStar");
            return (Criteria) this;
        }

        public Criteria andViewStarIn(List<BigDecimal> values) {
            addCriterion("view_star in", values, "viewStar");
            return (Criteria) this;
        }

        public Criteria andViewStarNotIn(List<BigDecimal> values) {
            addCriterion("view_star not in", values, "viewStar");
            return (Criteria) this;
        }

        public Criteria andViewStarBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("view_star between", value1, value2, "viewStar");
            return (Criteria) this;
        }

        public Criteria andViewStarNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("view_star not between", value1, value2, "viewStar");
            return (Criteria) this;
        }

        public Criteria andFunStarIsNull() {
            addCriterion("fun_star is null");
            return (Criteria) this;
        }

        public Criteria andFunStarIsNotNull() {
            addCriterion("fun_star is not null");
            return (Criteria) this;
        }

        public Criteria andFunStarEqualTo(BigDecimal value) {
            addCriterion("fun_star =", value, "funStar");
            return (Criteria) this;
        }

        public Criteria andFunStarNotEqualTo(BigDecimal value) {
            addCriterion("fun_star <>", value, "funStar");
            return (Criteria) this;
        }

        public Criteria andFunStarGreaterThan(BigDecimal value) {
            addCriterion("fun_star >", value, "funStar");
            return (Criteria) this;
        }

        public Criteria andFunStarGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("fun_star >=", value, "funStar");
            return (Criteria) this;
        }

        public Criteria andFunStarLessThan(BigDecimal value) {
            addCriterion("fun_star <", value, "funStar");
            return (Criteria) this;
        }

        public Criteria andFunStarLessThanOrEqualTo(BigDecimal value) {
            addCriterion("fun_star <=", value, "funStar");
            return (Criteria) this;
        }

        public Criteria andFunStarIn(List<BigDecimal> values) {
            addCriterion("fun_star in", values, "funStar");
            return (Criteria) this;
        }

        public Criteria andFunStarNotIn(List<BigDecimal> values) {
            addCriterion("fun_star not in", values, "funStar");
            return (Criteria) this;
        }

        public Criteria andFunStarBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fun_star between", value1, value2, "funStar");
            return (Criteria) this;
        }

        public Criteria andFunStarNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fun_star not between", value1, value2, "funStar");
            return (Criteria) this;
        }

        public Criteria andValueForMoneyStarIsNull() {
            addCriterion("value_for_money_star is null");
            return (Criteria) this;
        }

        public Criteria andValueForMoneyStarIsNotNull() {
            addCriterion("value_for_money_star is not null");
            return (Criteria) this;
        }

        public Criteria andValueForMoneyStarEqualTo(BigDecimal value) {
            addCriterion("value_for_money_star =", value, "valueForMoneyStar");
            return (Criteria) this;
        }

        public Criteria andValueForMoneyStarNotEqualTo(BigDecimal value) {
            addCriterion("value_for_money_star <>", value, "valueForMoneyStar");
            return (Criteria) this;
        }

        public Criteria andValueForMoneyStarGreaterThan(BigDecimal value) {
            addCriterion("value_for_money_star >", value, "valueForMoneyStar");
            return (Criteria) this;
        }

        public Criteria andValueForMoneyStarGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("value_for_money_star >=", value, "valueForMoneyStar");
            return (Criteria) this;
        }

        public Criteria andValueForMoneyStarLessThan(BigDecimal value) {
            addCriterion("value_for_money_star <", value, "valueForMoneyStar");
            return (Criteria) this;
        }

        public Criteria andValueForMoneyStarLessThanOrEqualTo(BigDecimal value) {
            addCriterion("value_for_money_star <=", value, "valueForMoneyStar");
            return (Criteria) this;
        }

        public Criteria andValueForMoneyStarIn(List<BigDecimal> values) {
            addCriterion("value_for_money_star in", values, "valueForMoneyStar");
            return (Criteria) this;
        }

        public Criteria andValueForMoneyStarNotIn(List<BigDecimal> values) {
            addCriterion("value_for_money_star not in", values, "valueForMoneyStar");
            return (Criteria) this;
        }

        public Criteria andValueForMoneyStarBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("value_for_money_star between", value1, value2, "valueForMoneyStar");
            return (Criteria) this;
        }

        public Criteria andValueForMoneyStarNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("value_for_money_star not between", value1, value2, "valueForMoneyStar");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("content is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("content is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("content =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("content <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("content >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("content >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("content <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("content <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("content like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("content not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("content in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("content not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("content between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("content not between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andPicsIsNull() {
            addCriterion("pics is null");
            return (Criteria) this;
        }

        public Criteria andPicsIsNotNull() {
            addCriterion("pics is not null");
            return (Criteria) this;
        }

        public Criteria andPicsEqualTo(String value) {
            addCriterion("pics =", value, "pics");
            return (Criteria) this;
        }

        public Criteria andPicsNotEqualTo(String value) {
            addCriterion("pics <>", value, "pics");
            return (Criteria) this;
        }

        public Criteria andPicsGreaterThan(String value) {
            addCriterion("pics >", value, "pics");
            return (Criteria) this;
        }

        public Criteria andPicsGreaterThanOrEqualTo(String value) {
            addCriterion("pics >=", value, "pics");
            return (Criteria) this;
        }

        public Criteria andPicsLessThan(String value) {
            addCriterion("pics <", value, "pics");
            return (Criteria) this;
        }

        public Criteria andPicsLessThanOrEqualTo(String value) {
            addCriterion("pics <=", value, "pics");
            return (Criteria) this;
        }

        public Criteria andPicsLike(String value) {
            addCriterion("pics like", value, "pics");
            return (Criteria) this;
        }

        public Criteria andPicsNotLike(String value) {
            addCriterion("pics not like", value, "pics");
            return (Criteria) this;
        }

        public Criteria andPicsIn(List<String> values) {
            addCriterion("pics in", values, "pics");
            return (Criteria) this;
        }

        public Criteria andPicsNotIn(List<String> values) {
            addCriterion("pics not in", values, "pics");
            return (Criteria) this;
        }

        public Criteria andPicsBetween(String value1, String value2) {
            addCriterion("pics between", value1, value2, "pics");
            return (Criteria) this;
        }

        public Criteria andPicsNotBetween(String value1, String value2) {
            addCriterion("pics not between", value1, value2, "pics");
            return (Criteria) this;
        }

        public Criteria andBeLikedNumIsNull() {
            addCriterion("be_liked_num is null");
            return (Criteria) this;
        }

        public Criteria andBeLikedNumIsNotNull() {
            addCriterion("be_liked_num is not null");
            return (Criteria) this;
        }

        public Criteria andBeLikedNumEqualTo(Integer value) {
            addCriterion("be_liked_num =", value, "beLikedNum");
            return (Criteria) this;
        }

        public Criteria andBeLikedNumNotEqualTo(Integer value) {
            addCriterion("be_liked_num <>", value, "beLikedNum");
            return (Criteria) this;
        }

        public Criteria andBeLikedNumGreaterThan(Integer value) {
            addCriterion("be_liked_num >", value, "beLikedNum");
            return (Criteria) this;
        }

        public Criteria andBeLikedNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("be_liked_num >=", value, "beLikedNum");
            return (Criteria) this;
        }

        public Criteria andBeLikedNumLessThan(Integer value) {
            addCriterion("be_liked_num <", value, "beLikedNum");
            return (Criteria) this;
        }

        public Criteria andBeLikedNumLessThanOrEqualTo(Integer value) {
            addCriterion("be_liked_num <=", value, "beLikedNum");
            return (Criteria) this;
        }

        public Criteria andBeLikedNumIn(List<Integer> values) {
            addCriterion("be_liked_num in", values, "beLikedNum");
            return (Criteria) this;
        }

        public Criteria andBeLikedNumNotIn(List<Integer> values) {
            addCriterion("be_liked_num not in", values, "beLikedNum");
            return (Criteria) this;
        }

        public Criteria andBeLikedNumBetween(Integer value1, Integer value2) {
            addCriterion("be_liked_num between", value1, value2, "beLikedNum");
            return (Criteria) this;
        }

        public Criteria andBeLikedNumNotBetween(Integer value1, Integer value2) {
            addCriterion("be_liked_num not between", value1, value2, "beLikedNum");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}