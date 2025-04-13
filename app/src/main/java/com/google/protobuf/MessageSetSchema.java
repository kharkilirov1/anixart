package com.google.protobuf;

import com.google.protobuf.FieldSet;
import com.google.protobuf.LazyField;
import com.google.protobuf.WireFormat;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
final class MessageSetSchema<T> implements Schema<T> {

    /* renamed from: a */
    public final MessageLite f24293a;

    /* renamed from: b */
    public final UnknownFieldSchema<?, ?> f24294b;

    /* renamed from: c */
    public final boolean f24295c;

    /* renamed from: d */
    public final ExtensionSchema<?> f24296d;

    public MessageSetSchema(UnknownFieldSchema<?, ?> unknownFieldSchema, ExtensionSchema<?> extensionSchema, MessageLite messageLite) {
        this.f24294b = unknownFieldSchema;
        this.f24295c = extensionSchema.mo13373e(messageLite);
        this.f24296d = extensionSchema;
        this.f24293a = messageLite;
    }

    @Override // com.google.protobuf.Schema
    /* renamed from: a */
    public void mo13535a(T t, T t2) {
        UnknownFieldSchema<?, ?> unknownFieldSchema = this.f24294b;
        Class<?> cls = SchemaUtil.f24337a;
        unknownFieldSchema.mo13661o(t, unknownFieldSchema.mo13657k(unknownFieldSchema.mo13653g(t), unknownFieldSchema.mo13653g(t2)));
        if (this.f24295c) {
            SchemaUtil.m13576B(this.f24296d, t, t2);
        }
    }

    @Override // com.google.protobuf.Schema
    /* renamed from: b */
    public void mo13537b(T t, Writer writer) throws IOException {
        Iterator<Map.Entry<?, Object>> m13395l = this.f24296d.mo13371c(t).m13395l();
        while (m13395l.hasNext()) {
            Map.Entry<?, Object> next = m13395l.next();
            FieldSet.FieldDescriptorLite fieldDescriptorLite = (FieldSet.FieldDescriptorLite) next.getKey();
            if (fieldDescriptorLite.mo13400A() != WireFormat.JavaType.MESSAGE || fieldDescriptorLite.mo13404y() || fieldDescriptorLite.mo13401C()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (next instanceof LazyField.LazyEntry) {
                writer.mo13108e(fieldDescriptorLite.mo13403x(), ((LazyField.LazyEntry) next).f24245b.getValue().m13468b());
            } else {
                writer.mo13108e(fieldDescriptorLite.mo13403x(), next.getValue());
            }
        }
        UnknownFieldSchema<?, ?> unknownFieldSchema = this.f24294b;
        unknownFieldSchema.mo13664r(unknownFieldSchema.mo13653g(t), writer);
    }

    @Override // com.google.protobuf.Schema
    /* renamed from: c */
    public void mo13539c(T t) {
        this.f24294b.mo13656j(t);
        this.f24296d.mo13374f(t);
    }

    @Override // com.google.protobuf.Schema
    /* renamed from: d */
    public final boolean mo13540d(T t) {
        return this.f24296d.mo13371c(t).m13394j();
    }

    @Override // com.google.protobuf.Schema
    /* renamed from: e */
    public void mo13541e(T t, Reader reader, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        UnknownFieldSchema unknownFieldSchema = this.f24294b;
        ExtensionSchema extensionSchema = this.f24296d;
        Object mo13652f = unknownFieldSchema.mo13652f(t);
        FieldSet<ET> mo13372d = extensionSchema.mo13372d(t);
        while (reader.mo13019B() != Integer.MAX_VALUE && m13561k(reader, extensionRegistryLite, extensionSchema, mo13372d, unknownFieldSchema, mo13652f)) {
            try {
            } finally {
                unknownFieldSchema.mo13660n(t, mo13652f);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b9 A[EDGE_INSN: B:24:0x00b9->B:25:0x00b9 BREAK  A[LOOP:1: B:10:0x0063->B:18:0x0063], SYNTHETIC] */
    @Override // com.google.protobuf.Schema
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo13542f(T r11, byte[] r12, int r13, int r14, com.google.protobuf.ArrayDecoders.Registers r15) throws java.io.IOException {
        /*
            r10 = this;
            r0 = r11
            com.google.protobuf.GeneratedMessageLite r0 = (com.google.protobuf.GeneratedMessageLite) r0
            com.google.protobuf.UnknownFieldSetLite r1 = r0.unknownFields
            com.google.protobuf.UnknownFieldSetLite r2 = com.google.protobuf.UnknownFieldSetLite.f24377f
            if (r1 != r2) goto Lf
            com.google.protobuf.UnknownFieldSetLite r1 = com.google.protobuf.UnknownFieldSetLite.m13666b()
            r0.unknownFields = r1
        Lf:
            com.google.protobuf.GeneratedMessageLite$ExtendableMessage r11 = (com.google.protobuf.GeneratedMessageLite.ExtendableMessage) r11
            com.google.protobuf.FieldSet r11 = r11.m13446H()
            r0 = 0
            r2 = r0
        L17:
            if (r13 >= r14) goto Lc4
            int r4 = com.google.protobuf.ArrayDecoders.m13014t(r12, r13, r15)
            int r13 = r15.f23961a
            r3 = 11
            r5 = 2
            if (r13 == r3) goto L61
            r3 = r13 & 7
            if (r3 != r5) goto L5c
            com.google.protobuf.ExtensionSchema<?> r2 = r10.f24296d
            com.google.protobuf.ExtensionRegistryLite r3 = r15.f23964d
            com.google.protobuf.MessageLite r5 = r10.f24293a
            int r6 = r13 >>> 3
            java.lang.Object r2 = r2.mo13370b(r3, r5, r6)
            r8 = r2
            com.google.protobuf.GeneratedMessageLite$GeneratedExtension r8 = (com.google.protobuf.GeneratedMessageLite.GeneratedExtension) r8
            if (r8 == 0) goto L51
            com.google.protobuf.Protobuf r13 = com.google.protobuf.Protobuf.f24310c
            com.google.protobuf.MessageLite r2 = r8.f24195c
            java.lang.Class r2 = r2.getClass()
            com.google.protobuf.Schema r13 = r13.m13567a(r2)
            int r13 = com.google.protobuf.ArrayDecoders.m12999e(r13, r12, r4, r14, r15)
            com.google.protobuf.GeneratedMessageLite$ExtensionDescriptor r2 = r8.f24196d
            java.lang.Object r3 = r15.f23963c
            r11.m13398o(r2, r3)
            goto L5a
        L51:
            r2 = r13
            r3 = r12
            r5 = r14
            r6 = r1
            r7 = r15
            int r13 = com.google.protobuf.ArrayDecoders.m13012r(r2, r3, r4, r5, r6, r7)
        L5a:
            r2 = r8
            goto L17
        L5c:
            int r13 = com.google.protobuf.ArrayDecoders.m13017w(r13, r12, r4, r14, r15)
            goto L17
        L61:
            r13 = 0
            r3 = r0
        L63:
            if (r4 >= r14) goto Lb9
            int r4 = com.google.protobuf.ArrayDecoders.m13014t(r12, r4, r15)
            int r6 = r15.f23961a
            int r7 = r6 >>> 3
            r8 = r6 & 7
            if (r7 == r5) goto L9a
            r9 = 3
            if (r7 == r9) goto L75
            goto Laf
        L75:
            if (r2 == 0) goto L8f
            com.google.protobuf.Protobuf r6 = com.google.protobuf.Protobuf.f24310c
            com.google.protobuf.MessageLite r7 = r2.f24195c
            java.lang.Class r7 = r7.getClass()
            com.google.protobuf.Schema r6 = r6.m13567a(r7)
            int r4 = com.google.protobuf.ArrayDecoders.m12999e(r6, r12, r4, r14, r15)
            com.google.protobuf.GeneratedMessageLite$ExtensionDescriptor r6 = r2.f24196d
            java.lang.Object r7 = r15.f23963c
            r11.m13398o(r6, r7)
            goto L63
        L8f:
            if (r8 != r5) goto Laf
            int r4 = com.google.protobuf.ArrayDecoders.m12995a(r12, r4, r15)
            java.lang.Object r3 = r15.f23963c
            com.google.protobuf.ByteString r3 = (com.google.protobuf.ByteString) r3
            goto L63
        L9a:
            if (r8 != 0) goto Laf
            int r4 = com.google.protobuf.ArrayDecoders.m13014t(r12, r4, r15)
            int r13 = r15.f23961a
            com.google.protobuf.ExtensionSchema<?> r2 = r10.f24296d
            com.google.protobuf.ExtensionRegistryLite r6 = r15.f23964d
            com.google.protobuf.MessageLite r7 = r10.f24293a
            java.lang.Object r2 = r2.mo13370b(r6, r7, r13)
            com.google.protobuf.GeneratedMessageLite$GeneratedExtension r2 = (com.google.protobuf.GeneratedMessageLite.GeneratedExtension) r2
            goto L63
        Laf:
            r7 = 12
            if (r6 != r7) goto Lb4
            goto Lb9
        Lb4:
            int r4 = com.google.protobuf.ArrayDecoders.m13017w(r6, r12, r4, r14, r15)
            goto L63
        Lb9:
            if (r3 == 0) goto Lc1
            int r13 = r13 << 3
            r13 = r13 | r5
            r1.m13669c(r13, r3)
        Lc1:
            r13 = r4
            goto L17
        Lc4:
            if (r13 != r14) goto Lc7
            return
        Lc7:
            com.google.protobuf.InvalidProtocolBufferException r11 = com.google.protobuf.InvalidProtocolBufferException.m13462g()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.MessageSetSchema.mo13542f(java.lang.Object, byte[], int, int, com.google.protobuf.ArrayDecoders$Registers):void");
    }

    @Override // com.google.protobuf.Schema
    /* renamed from: g */
    public boolean mo13543g(T t, T t2) {
        if (!this.f24294b.mo13653g(t).equals(this.f24294b.mo13653g(t2))) {
            return false;
        }
        if (this.f24295c) {
            return this.f24296d.mo13371c(t).equals(this.f24296d.mo13371c(t2));
        }
        return true;
    }

    @Override // com.google.protobuf.Schema
    /* renamed from: h */
    public int mo13544h(T t) {
        UnknownFieldSchema<?, ?> unknownFieldSchema = this.f24294b;
        int mo13655i = unknownFieldSchema.mo13655i(unknownFieldSchema.mo13653g(t)) + 0;
        if (!this.f24295c) {
            return mo13655i;
        }
        FieldSet<?> mo13371c = this.f24296d.mo13371c(t);
        int i2 = 0;
        for (int i3 = 0; i3 < mo13371c.f24155a.m13626d(); i3++) {
            i2 += mo13371c.m13392h(mo13371c.f24155a.m13625c(i3));
        }
        Iterator<Map.Entry<?, Object>> it = mo13371c.f24155a.m13627f().iterator();
        while (it.hasNext()) {
            i2 += mo13371c.m13392h(it.next());
        }
        return mo13655i + i2;
    }

    @Override // com.google.protobuf.Schema
    /* renamed from: i */
    public T mo13545i() {
        return (T) this.f24293a.mo13431d().mo13438K0();
    }

    @Override // com.google.protobuf.Schema
    /* renamed from: j */
    public int mo13546j(T t) {
        int hashCode = this.f24294b.mo13653g(t).hashCode();
        return this.f24295c ? (hashCode * 53) + this.f24296d.mo13371c(t).hashCode() : hashCode;
    }

    /* renamed from: k */
    public final <UT, UB, ET extends FieldSet.FieldDescriptorLite<ET>> boolean m13561k(Reader reader, ExtensionRegistryLite extensionRegistryLite, ExtensionSchema<ET> extensionSchema, FieldSet<ET> fieldSet, UnknownFieldSchema<UT, UB> unknownFieldSchema, UB ub) throws IOException {
        int mo13052e = reader.mo13052e();
        if (mo13052e != 11) {
            if ((mo13052e & 7) != 2) {
                return reader.mo13027J();
            }
            Object mo13370b = extensionSchema.mo13370b(extensionRegistryLite, this.f24293a, mo13052e >>> 3);
            if (mo13370b == null) {
                return unknownFieldSchema.m13658l(ub, reader);
            }
            extensionSchema.mo13376h(reader, mo13370b, extensionRegistryLite, fieldSet);
            return true;
        }
        int i2 = 0;
        Object obj = null;
        ByteString byteString = null;
        while (reader.mo13019B() != Integer.MAX_VALUE) {
            int mo13052e2 = reader.mo13052e();
            if (mo13052e2 == 16) {
                i2 = reader.mo13069p();
                obj = extensionSchema.mo13370b(extensionRegistryLite, this.f24293a, i2);
            } else if (mo13052e2 == 26) {
                if (obj != null) {
                    extensionSchema.mo13376h(reader, obj, extensionRegistryLite, fieldSet);
                } else {
                    byteString = reader.mo13024G();
                }
            } else if (!reader.mo13027J()) {
                break;
            }
        }
        if (reader.mo13052e() != 12) {
            throw InvalidProtocolBufferException.m13456a();
        }
        if (byteString != null) {
            if (obj != null) {
                extensionSchema.mo13377i(byteString, obj, extensionRegistryLite, fieldSet);
            } else {
                unknownFieldSchema.mo13650d(ub, i2, byteString);
            }
        }
        return true;
    }
}
