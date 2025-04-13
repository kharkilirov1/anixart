package com.google.protobuf;

/* loaded from: classes2.dex */
final class MapFieldSchemas {

    /* renamed from: a */
    public static final MapFieldSchema f24271a;

    /* renamed from: b */
    public static final MapFieldSchema f24272b;

    static {
        MapFieldSchema mapFieldSchema;
        try {
            mapFieldSchema = (MapFieldSchema) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            mapFieldSchema = null;
        }
        f24271a = mapFieldSchema;
        f24272b = new MapFieldSchemaLite();
    }
}
