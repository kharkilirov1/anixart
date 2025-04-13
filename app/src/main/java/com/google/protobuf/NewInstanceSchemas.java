package com.google.protobuf;

/* loaded from: classes2.dex */
final class NewInstanceSchemas {

    /* renamed from: a */
    public static final NewInstanceSchema f24299a;

    /* renamed from: b */
    public static final NewInstanceSchema f24300b;

    static {
        NewInstanceSchema newInstanceSchema;
        try {
            newInstanceSchema = (NewInstanceSchema) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            newInstanceSchema = null;
        }
        f24299a = newInstanceSchema;
        f24300b = new NewInstanceSchemaLite();
    }
}
