package com.google.protobuf;

/* loaded from: classes2.dex */
final class ExtensionSchemas {

    /* renamed from: a */
    public static final ExtensionSchema<?> f24120a = new ExtensionSchemaLite();

    /* renamed from: b */
    public static final ExtensionSchema<?> f24121b;

    static {
        ExtensionSchema<?> extensionSchema;
        try {
            extensionSchema = (ExtensionSchema) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            extensionSchema = null;
        }
        f24121b = extensionSchema;
    }
}
