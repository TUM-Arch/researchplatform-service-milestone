package de.tum.ar.researchplatform.util;

/**
 * Created by karthik on 9/10/2019
 */

/**
 * Helper class to provide constants
 */
public final class Constants {

    /**
     * Enforce private constructor
     */
    private Constants() {}

    /**
     * Enums
     */

    //Enum for Field object
    public enum FieldType {
        DATE,
        TIME,
        RADIO,
        SELECT,
        CHECKBOX,
        SWITCH,
        TEXT,
        IMAGE,
        MULTITEXT
    }

    //Enum for Project object
    public enum ProjectStatus {
        NOTSUBMITTED,
        SUBMITTED,
        APPROVED
    }
}
