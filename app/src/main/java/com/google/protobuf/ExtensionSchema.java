package com.google.protobuf;

import com.google.protobuf.FieldSet;
import com.google.protobuf.FieldSet.FieldDescriptorLite;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes2.dex */
abstract class ExtensionSchema<T extends FieldSet.FieldDescriptorLite<T>> {
    /* renamed from: a */
    public abstract int mo13369a(Map.Entry<?, ?> entry);

    /* renamed from: b */
    public abstract Object mo13370b(ExtensionRegistryLite extensionRegistryLite, MessageLite messageLite, int i2);

    /* renamed from: c */
    public abstract FieldSet<T> mo13371c(Object obj);

    /* renamed from: d */
    public abstract FieldSet<T> mo13372d(Object obj);

    /* renamed from: e */
    public abstract boolean mo13373e(MessageLite messageLite);

    /* renamed from: f */
    public abstract void mo13374f(Object obj);

    /* renamed from: g */
    public abstract <UT, UB> UB mo13375g(Reader reader, Object obj, ExtensionRegistryLite extensionRegistryLite, FieldSet<T> fieldSet, UB ub, UnknownFieldSchema<UT, UB> unknownFieldSchema) throws IOException;

    /* renamed from: h */
    public abstract void mo13376h(Reader reader, Object obj, ExtensionRegistryLite extensionRegistryLite, FieldSet<T> fieldSet) throws IOException;

    /* renamed from: i */
    public abstract void mo13377i(ByteString byteString, Object obj, ExtensionRegistryLite extensionRegistryLite, FieldSet<T> fieldSet) throws IOException;

    /* renamed from: j */
    public abstract void mo13378j(Writer writer, Map.Entry<?, ?> entry) throws IOException;
}
