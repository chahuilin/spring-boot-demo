package com.zhexinit.taobaocrbt.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ZSuberVipExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ZSuberVipExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andSuberIdIsNull() {
            addCriterion("suber_id is null");
            return (Criteria) this;
        }

        public Criteria andSuberIdIsNotNull() {
            addCriterion("suber_id is not null");
            return (Criteria) this;
        }

        public Criteria andSuberIdEqualTo(String value) {
            addCriterion("suber_id =", value, "suberId");
            return (Criteria) this;
        }

        public Criteria andSuberIdNotEqualTo(String value) {
            addCriterion("suber_id <>", value, "suberId");
            return (Criteria) this;
        }

        public Criteria andSuberIdGreaterThan(String value) {
            addCriterion("suber_id >", value, "suberId");
            return (Criteria) this;
        }

        public Criteria andSuberIdGreaterThanOrEqualTo(String value) {
            addCriterion("suber_id >=", value, "suberId");
            return (Criteria) this;
        }

        public Criteria andSuberIdLessThan(String value) {
            addCriterion("suber_id <", value, "suberId");
            return (Criteria) this;
        }

        public Criteria andSuberIdLessThanOrEqualTo(String value) {
            addCriterion("suber_id <=", value, "suberId");
            return (Criteria) this;
        }

        public Criteria andSuberIdLike(String value) {
            addCriterion("suber_id like", value, "suberId");
            return (Criteria) this;
        }

        public Criteria andSuberIdNotLike(String value) {
            addCriterion("suber_id not like", value, "suberId");
            return (Criteria) this;
        }

        public Criteria andSuberIdIn(List<String> values) {
            addCriterion("suber_id in", values, "suberId");
            return (Criteria) this;
        }

        public Criteria andSuberIdNotIn(List<String> values) {
            addCriterion("suber_id not in", values, "suberId");
            return (Criteria) this;
        }

        public Criteria andSuberIdBetween(String value1, String value2) {
            addCriterion("suber_id between", value1, value2, "suberId");
            return (Criteria) this;
        }

        public Criteria andSuberIdNotBetween(String value1, String value2) {
            addCriterion("suber_id not between", value1, value2, "suberId");
            return (Criteria) this;
        }

        public Criteria andNickNameIsNull() {
            addCriterion("nick_name is null");
            return (Criteria) this;
        }

        public Criteria andNickNameIsNotNull() {
            addCriterion("nick_name is not null");
            return (Criteria) this;
        }

        public Criteria andNickNameEqualTo(String value) {
            addCriterion("nick_name =", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotEqualTo(String value) {
            addCriterion("nick_name <>", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameGreaterThan(String value) {
            addCriterion("nick_name >", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameGreaterThanOrEqualTo(String value) {
            addCriterion("nick_name >=", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameLessThan(String value) {
            addCriterion("nick_name <", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameLessThanOrEqualTo(String value) {
            addCriterion("nick_name <=", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameLike(String value) {
            addCriterion("nick_name like", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotLike(String value) {
            addCriterion("nick_name not like", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameIn(List<String> values) {
            addCriterion("nick_name in", values, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotIn(List<String> values) {
            addCriterion("nick_name not in", values, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameBetween(String value1, String value2) {
            addCriterion("nick_name between", value1, value2, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotBetween(String value1, String value2) {
            addCriterion("nick_name not between", value1, value2, "nickName");
            return (Criteria) this;
        }

        public Criteria andMdnIsNull() {
            addCriterion("mdn is null");
            return (Criteria) this;
        }

        public Criteria andMdnIsNotNull() {
            addCriterion("mdn is not null");
            return (Criteria) this;
        }

        public Criteria andMdnEqualTo(String value) {
            addCriterion("mdn =", value, "mdn");
            return (Criteria) this;
        }

        public Criteria andMdnNotEqualTo(String value) {
            addCriterion("mdn <>", value, "mdn");
            return (Criteria) this;
        }

        public Criteria andMdnGreaterThan(String value) {
            addCriterion("mdn >", value, "mdn");
            return (Criteria) this;
        }

        public Criteria andMdnGreaterThanOrEqualTo(String value) {
            addCriterion("mdn >=", value, "mdn");
            return (Criteria) this;
        }

        public Criteria andMdnLessThan(String value) {
            addCriterion("mdn <", value, "mdn");
            return (Criteria) this;
        }

        public Criteria andMdnLessThanOrEqualTo(String value) {
            addCriterion("mdn <=", value, "mdn");
            return (Criteria) this;
        }

        public Criteria andMdnLike(String value) {
            addCriterion("mdn like", value, "mdn");
            return (Criteria) this;
        }

        public Criteria andMdnNotLike(String value) {
            addCriterion("mdn not like", value, "mdn");
            return (Criteria) this;
        }

        public Criteria andMdnIn(List<String> values) {
            addCriterion("mdn in", values, "mdn");
            return (Criteria) this;
        }

        public Criteria andMdnNotIn(List<String> values) {
            addCriterion("mdn not in", values, "mdn");
            return (Criteria) this;
        }

        public Criteria andMdnBetween(String value1, String value2) {
            addCriterion("mdn between", value1, value2, "mdn");
            return (Criteria) this;
        }

        public Criteria andMdnNotBetween(String value1, String value2) {
            addCriterion("mdn not between", value1, value2, "mdn");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andIconIsNull() {
            addCriterion("icon is null");
            return (Criteria) this;
        }

        public Criteria andIconIsNotNull() {
            addCriterion("icon is not null");
            return (Criteria) this;
        }

        public Criteria andIconEqualTo(String value) {
            addCriterion("icon =", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotEqualTo(String value) {
            addCriterion("icon <>", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconGreaterThan(String value) {
            addCriterion("icon >", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconGreaterThanOrEqualTo(String value) {
            addCriterion("icon >=", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLessThan(String value) {
            addCriterion("icon <", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLessThanOrEqualTo(String value) {
            addCriterion("icon <=", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLike(String value) {
            addCriterion("icon like", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotLike(String value) {
            addCriterion("icon not like", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconIn(List<String> values) {
            addCriterion("icon in", values, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotIn(List<String> values) {
            addCriterion("icon not in", values, "icon");
            return (Criteria) this;
        }

        public Criteria andIconBetween(String value1, String value2) {
            addCriterion("icon between", value1, value2, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotBetween(String value1, String value2) {
            addCriterion("icon not between", value1, value2, "icon");
            return (Criteria) this;
        }

        public Criteria andGenderIsNull() {
            addCriterion("gender is null");
            return (Criteria) this;
        }

        public Criteria andGenderIsNotNull() {
            addCriterion("gender is not null");
            return (Criteria) this;
        }

        public Criteria andGenderEqualTo(Boolean value) {
            addCriterion("gender =", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotEqualTo(Boolean value) {
            addCriterion("gender <>", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThan(Boolean value) {
            addCriterion("gender >", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThanOrEqualTo(Boolean value) {
            addCriterion("gender >=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThan(Boolean value) {
            addCriterion("gender <", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThanOrEqualTo(Boolean value) {
            addCriterion("gender <=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderIn(List<Boolean> values) {
            addCriterion("gender in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotIn(List<Boolean> values) {
            addCriterion("gender not in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderBetween(Boolean value1, Boolean value2) {
            addCriterion("gender between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotBetween(Boolean value1, Boolean value2) {
            addCriterion("gender not between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andChildNickNameIsNull() {
            addCriterion("child_nick_name is null");
            return (Criteria) this;
        }

        public Criteria andChildNickNameIsNotNull() {
            addCriterion("child_nick_name is not null");
            return (Criteria) this;
        }

        public Criteria andChildNickNameEqualTo(String value) {
            addCriterion("child_nick_name =", value, "childNickName");
            return (Criteria) this;
        }

        public Criteria andChildNickNameNotEqualTo(String value) {
            addCriterion("child_nick_name <>", value, "childNickName");
            return (Criteria) this;
        }

        public Criteria andChildNickNameGreaterThan(String value) {
            addCriterion("child_nick_name >", value, "childNickName");
            return (Criteria) this;
        }

        public Criteria andChildNickNameGreaterThanOrEqualTo(String value) {
            addCriterion("child_nick_name >=", value, "childNickName");
            return (Criteria) this;
        }

        public Criteria andChildNickNameLessThan(String value) {
            addCriterion("child_nick_name <", value, "childNickName");
            return (Criteria) this;
        }

        public Criteria andChildNickNameLessThanOrEqualTo(String value) {
            addCriterion("child_nick_name <=", value, "childNickName");
            return (Criteria) this;
        }

        public Criteria andChildNickNameLike(String value) {
            addCriterion("child_nick_name like", value, "childNickName");
            return (Criteria) this;
        }

        public Criteria andChildNickNameNotLike(String value) {
            addCriterion("child_nick_name not like", value, "childNickName");
            return (Criteria) this;
        }

        public Criteria andChildNickNameIn(List<String> values) {
            addCriterion("child_nick_name in", values, "childNickName");
            return (Criteria) this;
        }

        public Criteria andChildNickNameNotIn(List<String> values) {
            addCriterion("child_nick_name not in", values, "childNickName");
            return (Criteria) this;
        }

        public Criteria andChildNickNameBetween(String value1, String value2) {
            addCriterion("child_nick_name between", value1, value2, "childNickName");
            return (Criteria) this;
        }

        public Criteria andChildNickNameNotBetween(String value1, String value2) {
            addCriterion("child_nick_name not between", value1, value2, "childNickName");
            return (Criteria) this;
        }

        public Criteria andChildGenderIsNull() {
            addCriterion("child_gender is null");
            return (Criteria) this;
        }

        public Criteria andChildGenderIsNotNull() {
            addCriterion("child_gender is not null");
            return (Criteria) this;
        }

        public Criteria andChildGenderEqualTo(Boolean value) {
            addCriterion("child_gender =", value, "childGender");
            return (Criteria) this;
        }

        public Criteria andChildGenderNotEqualTo(Boolean value) {
            addCriterion("child_gender <>", value, "childGender");
            return (Criteria) this;
        }

        public Criteria andChildGenderGreaterThan(Boolean value) {
            addCriterion("child_gender >", value, "childGender");
            return (Criteria) this;
        }

        public Criteria andChildGenderGreaterThanOrEqualTo(Boolean value) {
            addCriterion("child_gender >=", value, "childGender");
            return (Criteria) this;
        }

        public Criteria andChildGenderLessThan(Boolean value) {
            addCriterion("child_gender <", value, "childGender");
            return (Criteria) this;
        }

        public Criteria andChildGenderLessThanOrEqualTo(Boolean value) {
            addCriterion("child_gender <=", value, "childGender");
            return (Criteria) this;
        }

        public Criteria andChildGenderIn(List<Boolean> values) {
            addCriterion("child_gender in", values, "childGender");
            return (Criteria) this;
        }

        public Criteria andChildGenderNotIn(List<Boolean> values) {
            addCriterion("child_gender not in", values, "childGender");
            return (Criteria) this;
        }

        public Criteria andChildGenderBetween(Boolean value1, Boolean value2) {
            addCriterion("child_gender between", value1, value2, "childGender");
            return (Criteria) this;
        }

        public Criteria andChildGenderNotBetween(Boolean value1, Boolean value2) {
            addCriterion("child_gender not between", value1, value2, "childGender");
            return (Criteria) this;
        }

        public Criteria andChildBirthdayIsNull() {
            addCriterion("child_birthday is null");
            return (Criteria) this;
        }

        public Criteria andChildBirthdayIsNotNull() {
            addCriterion("child_birthday is not null");
            return (Criteria) this;
        }

        public Criteria andChildBirthdayEqualTo(Date value) {
            addCriterionForJDBCDate("child_birthday =", value, "childBirthday");
            return (Criteria) this;
        }

        public Criteria andChildBirthdayNotEqualTo(Date value) {
            addCriterionForJDBCDate("child_birthday <>", value, "childBirthday");
            return (Criteria) this;
        }

        public Criteria andChildBirthdayGreaterThan(Date value) {
            addCriterionForJDBCDate("child_birthday >", value, "childBirthday");
            return (Criteria) this;
        }

        public Criteria andChildBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("child_birthday >=", value, "childBirthday");
            return (Criteria) this;
        }

        public Criteria andChildBirthdayLessThan(Date value) {
            addCriterionForJDBCDate("child_birthday <", value, "childBirthday");
            return (Criteria) this;
        }

        public Criteria andChildBirthdayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("child_birthday <=", value, "childBirthday");
            return (Criteria) this;
        }

        public Criteria andChildBirthdayIn(List<Date> values) {
            addCriterionForJDBCDate("child_birthday in", values, "childBirthday");
            return (Criteria) this;
        }

        public Criteria andChildBirthdayNotIn(List<Date> values) {
            addCriterionForJDBCDate("child_birthday not in", values, "childBirthday");
            return (Criteria) this;
        }

        public Criteria andChildBirthdayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("child_birthday between", value1, value2, "childBirthday");
            return (Criteria) this;
        }

        public Criteria andChildBirthdayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("child_birthday not between", value1, value2, "childBirthday");
            return (Criteria) this;
        }

        public Criteria andChannelCodeIsNull() {
            addCriterion("channel_code is null");
            return (Criteria) this;
        }

        public Criteria andChannelCodeIsNotNull() {
            addCriterion("channel_code is not null");
            return (Criteria) this;
        }

        public Criteria andChannelCodeEqualTo(String value) {
            addCriterion("channel_code =", value, "channelCode");
            return (Criteria) this;
        }

        public Criteria andChannelCodeNotEqualTo(String value) {
            addCriterion("channel_code <>", value, "channelCode");
            return (Criteria) this;
        }

        public Criteria andChannelCodeGreaterThan(String value) {
            addCriterion("channel_code >", value, "channelCode");
            return (Criteria) this;
        }

        public Criteria andChannelCodeGreaterThanOrEqualTo(String value) {
            addCriterion("channel_code >=", value, "channelCode");
            return (Criteria) this;
        }

        public Criteria andChannelCodeLessThan(String value) {
            addCriterion("channel_code <", value, "channelCode");
            return (Criteria) this;
        }

        public Criteria andChannelCodeLessThanOrEqualTo(String value) {
            addCriterion("channel_code <=", value, "channelCode");
            return (Criteria) this;
        }

        public Criteria andChannelCodeLike(String value) {
            addCriterion("channel_code like", value, "channelCode");
            return (Criteria) this;
        }

        public Criteria andChannelCodeNotLike(String value) {
            addCriterion("channel_code not like", value, "channelCode");
            return (Criteria) this;
        }

        public Criteria andChannelCodeIn(List<String> values) {
            addCriterion("channel_code in", values, "channelCode");
            return (Criteria) this;
        }

        public Criteria andChannelCodeNotIn(List<String> values) {
            addCriterion("channel_code not in", values, "channelCode");
            return (Criteria) this;
        }

        public Criteria andChannelCodeBetween(String value1, String value2) {
            addCriterion("channel_code between", value1, value2, "channelCode");
            return (Criteria) this;
        }

        public Criteria andChannelCodeNotBetween(String value1, String value2) {
            addCriterion("channel_code not between", value1, value2, "channelCode");
            return (Criteria) this;
        }

        public Criteria andVipTypeIsNull() {
            addCriterion("vip_type is null");
            return (Criteria) this;
        }

        public Criteria andVipTypeIsNotNull() {
            addCriterion("vip_type is not null");
            return (Criteria) this;
        }

        public Criteria andVipTypeEqualTo(Integer value) {
            addCriterion("vip_type =", value, "vipType");
            return (Criteria) this;
        }

        public Criteria andVipTypeNotEqualTo(Integer value) {
            addCriterion("vip_type <>", value, "vipType");
            return (Criteria) this;
        }

        public Criteria andVipTypeGreaterThan(Integer value) {
            addCriterion("vip_type >", value, "vipType");
            return (Criteria) this;
        }

        public Criteria andVipTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("vip_type >=", value, "vipType");
            return (Criteria) this;
        }

        public Criteria andVipTypeLessThan(Integer value) {
            addCriterion("vip_type <", value, "vipType");
            return (Criteria) this;
        }

        public Criteria andVipTypeLessThanOrEqualTo(Integer value) {
            addCriterion("vip_type <=", value, "vipType");
            return (Criteria) this;
        }

        public Criteria andVipTypeIn(List<Integer> values) {
            addCriterion("vip_type in", values, "vipType");
            return (Criteria) this;
        }

        public Criteria andVipTypeNotIn(List<Integer> values) {
            addCriterion("vip_type not in", values, "vipType");
            return (Criteria) this;
        }

        public Criteria andVipTypeBetween(Integer value1, Integer value2) {
            addCriterion("vip_type between", value1, value2, "vipType");
            return (Criteria) this;
        }

        public Criteria andVipTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("vip_type not between", value1, value2, "vipType");
            return (Criteria) this;
        }

        public Criteria andVipExpiryTimeIsNull() {
            addCriterion("vip_expiry_time is null");
            return (Criteria) this;
        }

        public Criteria andVipExpiryTimeIsNotNull() {
            addCriterion("vip_expiry_time is not null");
            return (Criteria) this;
        }

        public Criteria andVipExpiryTimeEqualTo(Date value) {
            addCriterion("vip_expiry_time =", value, "vipExpiryTime");
            return (Criteria) this;
        }

        public Criteria andVipExpiryTimeNotEqualTo(Date value) {
            addCriterion("vip_expiry_time <>", value, "vipExpiryTime");
            return (Criteria) this;
        }

        public Criteria andVipExpiryTimeGreaterThan(Date value) {
            addCriterion("vip_expiry_time >", value, "vipExpiryTime");
            return (Criteria) this;
        }

        public Criteria andVipExpiryTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("vip_expiry_time >=", value, "vipExpiryTime");
            return (Criteria) this;
        }

        public Criteria andVipExpiryTimeLessThan(Date value) {
            addCriterion("vip_expiry_time <", value, "vipExpiryTime");
            return (Criteria) this;
        }

        public Criteria andVipExpiryTimeLessThanOrEqualTo(Date value) {
            addCriterion("vip_expiry_time <=", value, "vipExpiryTime");
            return (Criteria) this;
        }

        public Criteria andVipExpiryTimeIn(List<Date> values) {
            addCriterion("vip_expiry_time in", values, "vipExpiryTime");
            return (Criteria) this;
        }

        public Criteria andVipExpiryTimeNotIn(List<Date> values) {
            addCriterion("vip_expiry_time not in", values, "vipExpiryTime");
            return (Criteria) this;
        }

        public Criteria andVipExpiryTimeBetween(Date value1, Date value2) {
            addCriterion("vip_expiry_time between", value1, value2, "vipExpiryTime");
            return (Criteria) this;
        }

        public Criteria andVipExpiryTimeNotBetween(Date value1, Date value2) {
            addCriterion("vip_expiry_time not between", value1, value2, "vipExpiryTime");
            return (Criteria) this;
        }

        public Criteria andSuberTypeIsNull() {
            addCriterion("suber_type is null");
            return (Criteria) this;
        }

        public Criteria andSuberTypeIsNotNull() {
            addCriterion("suber_type is not null");
            return (Criteria) this;
        }

        public Criteria andSuberTypeEqualTo(String value) {
            addCriterion("suber_type =", value, "suberType");
            return (Criteria) this;
        }

        public Criteria andSuberTypeNotEqualTo(String value) {
            addCriterion("suber_type <>", value, "suberType");
            return (Criteria) this;
        }

        public Criteria andSuberTypeGreaterThan(String value) {
            addCriterion("suber_type >", value, "suberType");
            return (Criteria) this;
        }

        public Criteria andSuberTypeGreaterThanOrEqualTo(String value) {
            addCriterion("suber_type >=", value, "suberType");
            return (Criteria) this;
        }

        public Criteria andSuberTypeLessThan(String value) {
            addCriterion("suber_type <", value, "suberType");
            return (Criteria) this;
        }

        public Criteria andSuberTypeLessThanOrEqualTo(String value) {
            addCriterion("suber_type <=", value, "suberType");
            return (Criteria) this;
        }

        public Criteria andSuberTypeLike(String value) {
            addCriterion("suber_type like", value, "suberType");
            return (Criteria) this;
        }

        public Criteria andSuberTypeNotLike(String value) {
            addCriterion("suber_type not like", value, "suberType");
            return (Criteria) this;
        }

        public Criteria andSuberTypeIn(List<String> values) {
            addCriterion("suber_type in", values, "suberType");
            return (Criteria) this;
        }

        public Criteria andSuberTypeNotIn(List<String> values) {
            addCriterion("suber_type not in", values, "suberType");
            return (Criteria) this;
        }

        public Criteria andSuberTypeBetween(String value1, String value2) {
            addCriterion("suber_type between", value1, value2, "suberType");
            return (Criteria) this;
        }

        public Criteria andSuberTypeNotBetween(String value1, String value2) {
            addCriterion("suber_type not between", value1, value2, "suberType");
            return (Criteria) this;
        }

        public Criteria andTokenIdIsNull() {
            addCriterion("token_id is null");
            return (Criteria) this;
        }

        public Criteria andTokenIdIsNotNull() {
            addCriterion("token_id is not null");
            return (Criteria) this;
        }

        public Criteria andTokenIdEqualTo(String value) {
            addCriterion("token_id =", value, "tokenId");
            return (Criteria) this;
        }

        public Criteria andTokenIdNotEqualTo(String value) {
            addCriterion("token_id <>", value, "tokenId");
            return (Criteria) this;
        }

        public Criteria andTokenIdGreaterThan(String value) {
            addCriterion("token_id >", value, "tokenId");
            return (Criteria) this;
        }

        public Criteria andTokenIdGreaterThanOrEqualTo(String value) {
            addCriterion("token_id >=", value, "tokenId");
            return (Criteria) this;
        }

        public Criteria andTokenIdLessThan(String value) {
            addCriterion("token_id <", value, "tokenId");
            return (Criteria) this;
        }

        public Criteria andTokenIdLessThanOrEqualTo(String value) {
            addCriterion("token_id <=", value, "tokenId");
            return (Criteria) this;
        }

        public Criteria andTokenIdLike(String value) {
            addCriterion("token_id like", value, "tokenId");
            return (Criteria) this;
        }

        public Criteria andTokenIdNotLike(String value) {
            addCriterion("token_id not like", value, "tokenId");
            return (Criteria) this;
        }

        public Criteria andTokenIdIn(List<String> values) {
            addCriterion("token_id in", values, "tokenId");
            return (Criteria) this;
        }

        public Criteria andTokenIdNotIn(List<String> values) {
            addCriterion("token_id not in", values, "tokenId");
            return (Criteria) this;
        }

        public Criteria andTokenIdBetween(String value1, String value2) {
            addCriterion("token_id between", value1, value2, "tokenId");
            return (Criteria) this;
        }

        public Criteria andTokenIdNotBetween(String value1, String value2) {
            addCriterion("token_id not between", value1, value2, "tokenId");
            return (Criteria) this;
        }

        public Criteria andLoginFlagIsNull() {
            addCriterion("login_flag is null");
            return (Criteria) this;
        }

        public Criteria andLoginFlagIsNotNull() {
            addCriterion("login_flag is not null");
            return (Criteria) this;
        }

        public Criteria andLoginFlagEqualTo(Boolean value) {
            addCriterion("login_flag =", value, "loginFlag");
            return (Criteria) this;
        }

        public Criteria andLoginFlagNotEqualTo(Boolean value) {
            addCriterion("login_flag <>", value, "loginFlag");
            return (Criteria) this;
        }

        public Criteria andLoginFlagGreaterThan(Boolean value) {
            addCriterion("login_flag >", value, "loginFlag");
            return (Criteria) this;
        }

        public Criteria andLoginFlagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("login_flag >=", value, "loginFlag");
            return (Criteria) this;
        }

        public Criteria andLoginFlagLessThan(Boolean value) {
            addCriterion("login_flag <", value, "loginFlag");
            return (Criteria) this;
        }

        public Criteria andLoginFlagLessThanOrEqualTo(Boolean value) {
            addCriterion("login_flag <=", value, "loginFlag");
            return (Criteria) this;
        }

        public Criteria andLoginFlagIn(List<Boolean> values) {
            addCriterion("login_flag in", values, "loginFlag");
            return (Criteria) this;
        }

        public Criteria andLoginFlagNotIn(List<Boolean> values) {
            addCriterion("login_flag not in", values, "loginFlag");
            return (Criteria) this;
        }

        public Criteria andLoginFlagBetween(Boolean value1, Boolean value2) {
            addCriterion("login_flag between", value1, value2, "loginFlag");
            return (Criteria) this;
        }

        public Criteria andLoginFlagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("login_flag not between", value1, value2, "loginFlag");
            return (Criteria) this;
        }

        public Criteria andIsBlackIsNull() {
            addCriterion("is_black is null");
            return (Criteria) this;
        }

        public Criteria andIsBlackIsNotNull() {
            addCriterion("is_black is not null");
            return (Criteria) this;
        }

        public Criteria andIsBlackEqualTo(Boolean value) {
            addCriterion("is_black =", value, "isBlack");
            return (Criteria) this;
        }

        public Criteria andIsBlackNotEqualTo(Boolean value) {
            addCriterion("is_black <>", value, "isBlack");
            return (Criteria) this;
        }

        public Criteria andIsBlackGreaterThan(Boolean value) {
            addCriterion("is_black >", value, "isBlack");
            return (Criteria) this;
        }

        public Criteria andIsBlackGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_black >=", value, "isBlack");
            return (Criteria) this;
        }

        public Criteria andIsBlackLessThan(Boolean value) {
            addCriterion("is_black <", value, "isBlack");
            return (Criteria) this;
        }

        public Criteria andIsBlackLessThanOrEqualTo(Boolean value) {
            addCriterion("is_black <=", value, "isBlack");
            return (Criteria) this;
        }

        public Criteria andIsBlackIn(List<Boolean> values) {
            addCriterion("is_black in", values, "isBlack");
            return (Criteria) this;
        }

        public Criteria andIsBlackNotIn(List<Boolean> values) {
            addCriterion("is_black not in", values, "isBlack");
            return (Criteria) this;
        }

        public Criteria andIsBlackBetween(Boolean value1, Boolean value2) {
            addCriterion("is_black between", value1, value2, "isBlack");
            return (Criteria) this;
        }

        public Criteria andIsBlackNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_black not between", value1, value2, "isBlack");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIsNull() {
            addCriterion("modify_time is null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIsNotNull() {
            addCriterion("modify_time is not null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeEqualTo(Date value) {
            addCriterion("modify_time =", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotEqualTo(Date value) {
            addCriterion("modify_time <>", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThan(Date value) {
            addCriterion("modify_time >", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("modify_time >=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThan(Date value) {
            addCriterion("modify_time <", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("modify_time <=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIn(List<Date> values) {
            addCriterion("modify_time in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotIn(List<Date> values) {
            addCriterion("modify_time not in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeBetween(Date value1, Date value2) {
            addCriterion("modify_time between", value1, value2, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("modify_time not between", value1, value2, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagIsNull() {
            addCriterion("delete_flag is null");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagIsNotNull() {
            addCriterion("delete_flag is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagEqualTo(Boolean value) {
            addCriterion("delete_flag =", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagNotEqualTo(Boolean value) {
            addCriterion("delete_flag <>", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagGreaterThan(Boolean value) {
            addCriterion("delete_flag >", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("delete_flag >=", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagLessThan(Boolean value) {
            addCriterion("delete_flag <", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagLessThanOrEqualTo(Boolean value) {
            addCriterion("delete_flag <=", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagIn(List<Boolean> values) {
            addCriterion("delete_flag in", values, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagNotIn(List<Boolean> values) {
            addCriterion("delete_flag not in", values, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagBetween(Boolean value1, Boolean value2) {
            addCriterion("delete_flag between", value1, value2, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("delete_flag not between", value1, value2, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andLastImeiIsNull() {
            addCriterion("last_imei is null");
            return (Criteria) this;
        }

        public Criteria andLastImeiIsNotNull() {
            addCriterion("last_imei is not null");
            return (Criteria) this;
        }

        public Criteria andLastImeiEqualTo(String value) {
            addCriterion("last_imei =", value, "lastImei");
            return (Criteria) this;
        }

        public Criteria andLastImeiNotEqualTo(String value) {
            addCriterion("last_imei <>", value, "lastImei");
            return (Criteria) this;
        }

        public Criteria andLastImeiGreaterThan(String value) {
            addCriterion("last_imei >", value, "lastImei");
            return (Criteria) this;
        }

        public Criteria andLastImeiGreaterThanOrEqualTo(String value) {
            addCriterion("last_imei >=", value, "lastImei");
            return (Criteria) this;
        }

        public Criteria andLastImeiLessThan(String value) {
            addCriterion("last_imei <", value, "lastImei");
            return (Criteria) this;
        }

        public Criteria andLastImeiLessThanOrEqualTo(String value) {
            addCriterion("last_imei <=", value, "lastImei");
            return (Criteria) this;
        }

        public Criteria andLastImeiLike(String value) {
            addCriterion("last_imei like", value, "lastImei");
            return (Criteria) this;
        }

        public Criteria andLastImeiNotLike(String value) {
            addCriterion("last_imei not like", value, "lastImei");
            return (Criteria) this;
        }

        public Criteria andLastImeiIn(List<String> values) {
            addCriterion("last_imei in", values, "lastImei");
            return (Criteria) this;
        }

        public Criteria andLastImeiNotIn(List<String> values) {
            addCriterion("last_imei not in", values, "lastImei");
            return (Criteria) this;
        }

        public Criteria andLastImeiBetween(String value1, String value2) {
            addCriterion("last_imei between", value1, value2, "lastImei");
            return (Criteria) this;
        }

        public Criteria andLastImeiNotBetween(String value1, String value2) {
            addCriterion("last_imei not between", value1, value2, "lastImei");
            return (Criteria) this;
        }

        public Criteria andLastActiveTimeIsNull() {
            addCriterion("last_active_time is null");
            return (Criteria) this;
        }

        public Criteria andLastActiveTimeIsNotNull() {
            addCriterion("last_active_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastActiveTimeEqualTo(Date value) {
            addCriterion("last_active_time =", value, "lastActiveTime");
            return (Criteria) this;
        }

        public Criteria andLastActiveTimeNotEqualTo(Date value) {
            addCriterion("last_active_time <>", value, "lastActiveTime");
            return (Criteria) this;
        }

        public Criteria andLastActiveTimeGreaterThan(Date value) {
            addCriterion("last_active_time >", value, "lastActiveTime");
            return (Criteria) this;
        }

        public Criteria andLastActiveTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("last_active_time >=", value, "lastActiveTime");
            return (Criteria) this;
        }

        public Criteria andLastActiveTimeLessThan(Date value) {
            addCriterion("last_active_time <", value, "lastActiveTime");
            return (Criteria) this;
        }

        public Criteria andLastActiveTimeLessThanOrEqualTo(Date value) {
            addCriterion("last_active_time <=", value, "lastActiveTime");
            return (Criteria) this;
        }

        public Criteria andLastActiveTimeIn(List<Date> values) {
            addCriterion("last_active_time in", values, "lastActiveTime");
            return (Criteria) this;
        }

        public Criteria andLastActiveTimeNotIn(List<Date> values) {
            addCriterion("last_active_time not in", values, "lastActiveTime");
            return (Criteria) this;
        }

        public Criteria andLastActiveTimeBetween(Date value1, Date value2) {
            addCriterion("last_active_time between", value1, value2, "lastActiveTime");
            return (Criteria) this;
        }

        public Criteria andLastActiveTimeNotBetween(Date value1, Date value2) {
            addCriterion("last_active_time not between", value1, value2, "lastActiveTime");
            return (Criteria) this;
        }

        public Criteria andCostPriceIsNull() {
            addCriterion("cost_price is null");
            return (Criteria) this;
        }

        public Criteria andCostPriceIsNotNull() {
            addCriterion("cost_price is not null");
            return (Criteria) this;
        }

        public Criteria andCostPriceEqualTo(Integer value) {
            addCriterion("cost_price =", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceNotEqualTo(Integer value) {
            addCriterion("cost_price <>", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceGreaterThan(Integer value) {
            addCriterion("cost_price >", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("cost_price >=", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceLessThan(Integer value) {
            addCriterion("cost_price <", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceLessThanOrEqualTo(Integer value) {
            addCriterion("cost_price <=", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceIn(List<Integer> values) {
            addCriterion("cost_price in", values, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceNotIn(List<Integer> values) {
            addCriterion("cost_price not in", values, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceBetween(Integer value1, Integer value2) {
            addCriterion("cost_price between", value1, value2, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("cost_price not between", value1, value2, "costPrice");
            return (Criteria) this;
        }

        public Criteria andDistIdIsNull() {
            addCriterion("dist_id is null");
            return (Criteria) this;
        }

        public Criteria andDistIdIsNotNull() {
            addCriterion("dist_id is not null");
            return (Criteria) this;
        }

        public Criteria andDistIdEqualTo(String value) {
            addCriterion("dist_id =", value, "distId");
            return (Criteria) this;
        }

        public Criteria andDistIdNotEqualTo(String value) {
            addCriterion("dist_id <>", value, "distId");
            return (Criteria) this;
        }

        public Criteria andDistIdGreaterThan(String value) {
            addCriterion("dist_id >", value, "distId");
            return (Criteria) this;
        }

        public Criteria andDistIdGreaterThanOrEqualTo(String value) {
            addCriterion("dist_id >=", value, "distId");
            return (Criteria) this;
        }

        public Criteria andDistIdLessThan(String value) {
            addCriterion("dist_id <", value, "distId");
            return (Criteria) this;
        }

        public Criteria andDistIdLessThanOrEqualTo(String value) {
            addCriterion("dist_id <=", value, "distId");
            return (Criteria) this;
        }

        public Criteria andDistIdLike(String value) {
            addCriterion("dist_id like", value, "distId");
            return (Criteria) this;
        }

        public Criteria andDistIdNotLike(String value) {
            addCriterion("dist_id not like", value, "distId");
            return (Criteria) this;
        }

        public Criteria andDistIdIn(List<String> values) {
            addCriterion("dist_id in", values, "distId");
            return (Criteria) this;
        }

        public Criteria andDistIdNotIn(List<String> values) {
            addCriterion("dist_id not in", values, "distId");
            return (Criteria) this;
        }

        public Criteria andDistIdBetween(String value1, String value2) {
            addCriterion("dist_id between", value1, value2, "distId");
            return (Criteria) this;
        }

        public Criteria andDistIdNotBetween(String value1, String value2) {
            addCriterion("dist_id not between", value1, value2, "distId");
            return (Criteria) this;
        }

        public Criteria andRegisterTypeIsNull() {
            addCriterion("register_type is null");
            return (Criteria) this;
        }

        public Criteria andRegisterTypeIsNotNull() {
            addCriterion("register_type is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterTypeEqualTo(String value) {
            addCriterion("register_type =", value, "registerType");
            return (Criteria) this;
        }

        public Criteria andRegisterTypeNotEqualTo(String value) {
            addCriterion("register_type <>", value, "registerType");
            return (Criteria) this;
        }

        public Criteria andRegisterTypeGreaterThan(String value) {
            addCriterion("register_type >", value, "registerType");
            return (Criteria) this;
        }

        public Criteria andRegisterTypeGreaterThanOrEqualTo(String value) {
            addCriterion("register_type >=", value, "registerType");
            return (Criteria) this;
        }

        public Criteria andRegisterTypeLessThan(String value) {
            addCriterion("register_type <", value, "registerType");
            return (Criteria) this;
        }

        public Criteria andRegisterTypeLessThanOrEqualTo(String value) {
            addCriterion("register_type <=", value, "registerType");
            return (Criteria) this;
        }

        public Criteria andRegisterTypeLike(String value) {
            addCriterion("register_type like", value, "registerType");
            return (Criteria) this;
        }

        public Criteria andRegisterTypeNotLike(String value) {
            addCriterion("register_type not like", value, "registerType");
            return (Criteria) this;
        }

        public Criteria andRegisterTypeIn(List<String> values) {
            addCriterion("register_type in", values, "registerType");
            return (Criteria) this;
        }

        public Criteria andRegisterTypeNotIn(List<String> values) {
            addCriterion("register_type not in", values, "registerType");
            return (Criteria) this;
        }

        public Criteria andRegisterTypeBetween(String value1, String value2) {
            addCriterion("register_type between", value1, value2, "registerType");
            return (Criteria) this;
        }

        public Criteria andRegisterTypeNotBetween(String value1, String value2) {
            addCriterion("register_type not between", value1, value2, "registerType");
            return (Criteria) this;
        }

        public Criteria andRegisterProvinceIsNull() {
            addCriterion("register_province is null");
            return (Criteria) this;
        }

        public Criteria andRegisterProvinceIsNotNull() {
            addCriterion("register_province is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterProvinceEqualTo(String value) {
            addCriterion("register_province =", value, "registerProvince");
            return (Criteria) this;
        }

        public Criteria andRegisterProvinceNotEqualTo(String value) {
            addCriterion("register_province <>", value, "registerProvince");
            return (Criteria) this;
        }

        public Criteria andRegisterProvinceGreaterThan(String value) {
            addCriterion("register_province >", value, "registerProvince");
            return (Criteria) this;
        }

        public Criteria andRegisterProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("register_province >=", value, "registerProvince");
            return (Criteria) this;
        }

        public Criteria andRegisterProvinceLessThan(String value) {
            addCriterion("register_province <", value, "registerProvince");
            return (Criteria) this;
        }

        public Criteria andRegisterProvinceLessThanOrEqualTo(String value) {
            addCriterion("register_province <=", value, "registerProvince");
            return (Criteria) this;
        }

        public Criteria andRegisterProvinceLike(String value) {
            addCriterion("register_province like", value, "registerProvince");
            return (Criteria) this;
        }

        public Criteria andRegisterProvinceNotLike(String value) {
            addCriterion("register_province not like", value, "registerProvince");
            return (Criteria) this;
        }

        public Criteria andRegisterProvinceIn(List<String> values) {
            addCriterion("register_province in", values, "registerProvince");
            return (Criteria) this;
        }

        public Criteria andRegisterProvinceNotIn(List<String> values) {
            addCriterion("register_province not in", values, "registerProvince");
            return (Criteria) this;
        }

        public Criteria andRegisterProvinceBetween(String value1, String value2) {
            addCriterion("register_province between", value1, value2, "registerProvince");
            return (Criteria) this;
        }

        public Criteria andRegisterProvinceNotBetween(String value1, String value2) {
            addCriterion("register_province not between", value1, value2, "registerProvince");
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