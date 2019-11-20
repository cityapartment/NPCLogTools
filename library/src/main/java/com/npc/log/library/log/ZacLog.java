package com.npc.log.library.log;

/**
 * @author leroy
 * @description:
 * @data: 24
 */
public class ZacLog {

    private String path;
    private String logCategory;
    private String logLevel;
    private String logModel;

    ZacLog() {
        this(new Builder());
    }

    ZacLog(Builder builder) {
        this.logCategory = builder.logCategory;
        this.logLevel = builder.logLevel;
        this.logModel = builder.logModel;
    }

    public static final class Builder {
        private String path;
        private String logCategory;
        private String logLevel;
        private String logModel;

        public Builder() {

        }

        public Builder setLogRootPath(String path) {
            this.path = path;
            return this;
        }

        public Builder setLogCategory(String logCategory) {
            this.logCategory = logCategory;
            return this;
        }

        public Builder setLogLevel(String logLevel) {
            this.logCategory = logCategory;
            return this;
        }

        public Builder setLogModel(String logModel) {
            this.logCategory = logCategory;
            return this;
        }

        public ZacLog create() {
            return new ZacLog(this);
        }
    }

    public void init() {

    }

    public void collectLog() {

    }
}
