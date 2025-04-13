package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.JsonParser;
import java.util.Iterator;

/* loaded from: classes.dex */
public interface TreeNode {
    JsonToken asToken();

    /* renamed from: at */
    TreeNode mo5360at(JsonPointer jsonPointer);

    /* renamed from: at */
    TreeNode mo5361at(String str) throws IllegalArgumentException;

    Iterator<String> fieldNames();

    TreeNode get(int i2);

    TreeNode get(String str);

    boolean isArray();

    boolean isContainerNode();

    boolean isMissingNode();

    boolean isObject();

    boolean isValueNode();

    JsonParser.NumberType numberType();

    TreeNode path(int i2);

    TreeNode path(String str);

    int size();

    JsonParser traverse();

    JsonParser traverse(ObjectCodec objectCodec);
}
