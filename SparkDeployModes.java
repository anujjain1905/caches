package com.spark.utils;

/**
 * Created by anuj.jain on 10/08/21.
 */
public enum SparkDeployModes {
    LOCAL("local[*]"),
    YARN_CLIENT("yarn-client"),
    YARN_CLUSTER("yarn-cluster");

    private String master;
    SparkDeployModes(String master) {
        this.master = master;
    }

    public String getMaster() {
        return master;
    }
}
