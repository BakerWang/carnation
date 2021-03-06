package com.sinco.carnation.selftest.model;

import com.sinco.carnation.selftest.bo.WenJuanThemeBO;
import com.sinco.mybatis.dal.core.AbstractExample;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WenJuanThemeExample extends AbstractExample<WenJuanThemeBO> {
	protected String orderByClause;

	protected boolean distinct;

	protected List<Criteria> oredCriteria;

	protected String limit;

	public WenJuanThemeExample() {
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

	public String getLimit() {
		return limit;
	}

	public void setLimit(String limit) {
		this.limit = limit;
	}

	public void setLimit(int count) {
		this.limit = String.valueOf(count);
	}

	public void setLimit(int offset, int rows) {
		this.limit = new StringBuilder().append(String.valueOf(offset)).append(",")
				.append(String.valueOf(rows)).toString();
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

		public Criteria andThemeNameIsNull() {
			addCriterion("theme_name is null");
			return (Criteria) this;
		}

		public Criteria andThemeNameIsNotNull() {
			addCriterion("theme_name is not null");
			return (Criteria) this;
		}

		public Criteria andThemeNameEqualTo(String value) {
			addCriterion("theme_name =", value, "themeName");
			return (Criteria) this;
		}

		public Criteria andThemeNameNotEqualTo(String value) {
			addCriterion("theme_name <>", value, "themeName");
			return (Criteria) this;
		}

		public Criteria andThemeNameGreaterThan(String value) {
			addCriterion("theme_name >", value, "themeName");
			return (Criteria) this;
		}

		public Criteria andThemeNameGreaterThanOrEqualTo(String value) {
			addCriterion("theme_name >=", value, "themeName");
			return (Criteria) this;
		}

		public Criteria andThemeNameLessThan(String value) {
			addCriterion("theme_name <", value, "themeName");
			return (Criteria) this;
		}

		public Criteria andThemeNameLessThanOrEqualTo(String value) {
			addCriterion("theme_name <=", value, "themeName");
			return (Criteria) this;
		}

		public Criteria andThemeNameLike(String value) {
			addCriterion("theme_name like", value, "themeName");
			return (Criteria) this;
		}

		public Criteria andThemeNameNotLike(String value) {
			addCriterion("theme_name not like", value, "themeName");
			return (Criteria) this;
		}

		public Criteria andThemeNameIn(List<String> values) {
			addCriterion("theme_name in", values, "themeName");
			return (Criteria) this;
		}

		public Criteria andThemeNameNotIn(List<String> values) {
			addCriterion("theme_name not in", values, "themeName");
			return (Criteria) this;
		}

		public Criteria andThemeNameBetween(String value1, String value2) {
			addCriterion("theme_name between", value1, value2, "themeName");
			return (Criteria) this;
		}

		public Criteria andThemeNameNotBetween(String value1, String value2) {
			addCriterion("theme_name not between", value1, value2, "themeName");
			return (Criteria) this;
		}

		public Criteria andIsDeletedIsNull() {
			addCriterion("is_deleted is null");
			return (Criteria) this;
		}

		public Criteria andIsDeletedIsNotNull() {
			addCriterion("is_deleted is not null");
			return (Criteria) this;
		}

		public Criteria andIsDeletedEqualTo(Long value) {
			addCriterion("is_deleted =", value, "isDeleted");
			return (Criteria) this;
		}

		public Criteria andIsDeletedNotEqualTo(Long value) {
			addCriterion("is_deleted <>", value, "isDeleted");
			return (Criteria) this;
		}

		public Criteria andIsDeletedGreaterThan(Long value) {
			addCriterion("is_deleted >", value, "isDeleted");
			return (Criteria) this;
		}

		public Criteria andIsDeletedGreaterThanOrEqualTo(Long value) {
			addCriterion("is_deleted >=", value, "isDeleted");
			return (Criteria) this;
		}

		public Criteria andIsDeletedLessThan(Long value) {
			addCriterion("is_deleted <", value, "isDeleted");
			return (Criteria) this;
		}

		public Criteria andIsDeletedLessThanOrEqualTo(Long value) {
			addCriterion("is_deleted <=", value, "isDeleted");
			return (Criteria) this;
		}

		public Criteria andIsDeletedIn(List<Long> values) {
			addCriterion("is_deleted in", values, "isDeleted");
			return (Criteria) this;
		}

		public Criteria andIsDeletedNotIn(List<Long> values) {
			addCriterion("is_deleted not in", values, "isDeleted");
			return (Criteria) this;
		}

		public Criteria andIsDeletedBetween(Long value1, Long value2) {
			addCriterion("is_deleted between", value1, value2, "isDeleted");
			return (Criteria) this;
		}

		public Criteria andIsDeletedNotBetween(Long value1, Long value2) {
			addCriterion("is_deleted not between", value1, value2, "isDeleted");
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

		public Criteria andUpdateTimeIsNull() {
			addCriterion("update_time is null");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeIsNotNull() {
			addCriterion("update_time is not null");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeEqualTo(Date value) {
			addCriterion("update_time =", value, "updateTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeNotEqualTo(Date value) {
			addCriterion("update_time <>", value, "updateTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeGreaterThan(Date value) {
			addCriterion("update_time >", value, "updateTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
			addCriterion("update_time >=", value, "updateTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeLessThan(Date value) {
			addCriterion("update_time <", value, "updateTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
			addCriterion("update_time <=", value, "updateTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeIn(List<Date> values) {
			addCriterion("update_time in", values, "updateTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeNotIn(List<Date> values) {
			addCriterion("update_time not in", values, "updateTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeBetween(Date value1, Date value2) {
			addCriterion("update_time between", value1, value2, "updateTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
			addCriterion("update_time not between", value1, value2, "updateTime");
			return (Criteria) this;
		}

		public Criteria andCreateUseridIsNull() {
			addCriterion("create_userID is null");
			return (Criteria) this;
		}

		public Criteria andCreateUseridIsNotNull() {
			addCriterion("create_userID is not null");
			return (Criteria) this;
		}

		public Criteria andCreateUseridEqualTo(Long value) {
			addCriterion("create_userID =", value, "createUserid");
			return (Criteria) this;
		}

		public Criteria andCreateUseridNotEqualTo(Long value) {
			addCriterion("create_userID <>", value, "createUserid");
			return (Criteria) this;
		}

		public Criteria andCreateUseridGreaterThan(Long value) {
			addCriterion("create_userID >", value, "createUserid");
			return (Criteria) this;
		}

		public Criteria andCreateUseridGreaterThanOrEqualTo(Long value) {
			addCriterion("create_userID >=", value, "createUserid");
			return (Criteria) this;
		}

		public Criteria andCreateUseridLessThan(Long value) {
			addCriterion("create_userID <", value, "createUserid");
			return (Criteria) this;
		}

		public Criteria andCreateUseridLessThanOrEqualTo(Long value) {
			addCriterion("create_userID <=", value, "createUserid");
			return (Criteria) this;
		}

		public Criteria andCreateUseridIn(List<Long> values) {
			addCriterion("create_userID in", values, "createUserid");
			return (Criteria) this;
		}

		public Criteria andCreateUseridNotIn(List<Long> values) {
			addCriterion("create_userID not in", values, "createUserid");
			return (Criteria) this;
		}

		public Criteria andCreateUseridBetween(Long value1, Long value2) {
			addCriterion("create_userID between", value1, value2, "createUserid");
			return (Criteria) this;
		}

		public Criteria andCreateUseridNotBetween(Long value1, Long value2) {
			addCriterion("create_userID not between", value1, value2, "createUserid");
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