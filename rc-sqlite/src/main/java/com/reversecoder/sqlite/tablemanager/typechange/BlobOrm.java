package com.reversecoder.sqlite.tablemanager.typechange;

/**
 * This class deals with byte type.
 *
 */
public class BlobOrm extends OrmChange{

    /**
     * If the field type passed in is byte, it will change it into blob as
     * column type.
     */
    @Override
    public String object2Relation(String fieldType) {
        if (fieldType != null) {
            if (fieldType.equals("[B")) {
                return "blob";
            }
        }
        return null;
    }

}
