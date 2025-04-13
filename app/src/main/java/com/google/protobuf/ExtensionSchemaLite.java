package com.google.protobuf;

import com.google.protobuf.BinaryReader;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.WireFormat;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p000a.C0000a;

/* loaded from: classes2.dex */
final class ExtensionSchemaLite extends ExtensionSchema<GeneratedMessageLite.ExtensionDescriptor> {

    /* renamed from: com.google.protobuf.ExtensionSchemaLite$1 */
    public static /* synthetic */ class C23671 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f24119a;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f24119a = iArr;
            try {
                iArr[WireFormat.FieldType.f24401d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24119a[WireFormat.FieldType.f24402e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f24119a[WireFormat.FieldType.f24403f.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f24119a[WireFormat.FieldType.f24404g.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f24119a[WireFormat.FieldType.f24405h.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f24119a[WireFormat.FieldType.f24406i.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f24119a[WireFormat.FieldType.f24407j.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f24119a[WireFormat.FieldType.f24408k.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f24119a[WireFormat.FieldType.f24413p.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f24119a[WireFormat.FieldType.f24415r.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f24119a[WireFormat.FieldType.f24416s.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f24119a[WireFormat.FieldType.f24417t.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f24119a[WireFormat.FieldType.f24418u.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f24119a[WireFormat.FieldType.f24414q.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f24119a[WireFormat.FieldType.f24412o.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f24119a[WireFormat.FieldType.f24409l.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f24119a[WireFormat.FieldType.f24410m.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f24119a[WireFormat.FieldType.f24411n.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    @Override // com.google.protobuf.ExtensionSchema
    /* renamed from: a */
    public int mo13369a(Map.Entry<?, ?> entry) {
        return ((GeneratedMessageLite.ExtensionDescriptor) entry.getKey()).f24189c;
    }

    @Override // com.google.protobuf.ExtensionSchema
    /* renamed from: b */
    public Object mo13370b(ExtensionRegistryLite extensionRegistryLite, MessageLite messageLite, int i2) {
        return extensionRegistryLite.f24116a.get(new ExtensionRegistryLite.ObjectIntPair(messageLite, i2));
    }

    @Override // com.google.protobuf.ExtensionSchema
    /* renamed from: c */
    public FieldSet<GeneratedMessageLite.ExtensionDescriptor> mo13371c(Object obj) {
        return ((GeneratedMessageLite.ExtendableMessage) obj).extensions;
    }

    @Override // com.google.protobuf.ExtensionSchema
    /* renamed from: d */
    public FieldSet<GeneratedMessageLite.ExtensionDescriptor> mo13372d(Object obj) {
        return ((GeneratedMessageLite.ExtendableMessage) obj).m13446H();
    }

    @Override // com.google.protobuf.ExtensionSchema
    /* renamed from: e */
    public boolean mo13373e(MessageLite messageLite) {
        return messageLite instanceof GeneratedMessageLite.ExtendableMessage;
    }

    @Override // com.google.protobuf.ExtensionSchema
    /* renamed from: f */
    public void mo13374f(Object obj) {
        ((GeneratedMessageLite.ExtendableMessage) obj).extensions.m13396m();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.protobuf.ExtensionSchema
    /* renamed from: g */
    public <UT, UB> UB mo13375g(Reader reader, Object obj, ExtensionRegistryLite extensionRegistryLite, FieldSet<GeneratedMessageLite.ExtensionDescriptor> fieldSet, UB ub, UnknownFieldSchema<UT, UB> unknownFieldSchema) throws IOException {
        Object m13391g;
        ArrayList arrayList;
        GeneratedMessageLite.GeneratedExtension generatedExtension = (GeneratedMessageLite.GeneratedExtension) obj;
        GeneratedMessageLite.ExtensionDescriptor extensionDescriptor = generatedExtension.f24196d;
        int i2 = extensionDescriptor.f24189c;
        if (extensionDescriptor.f24191e && extensionDescriptor.f24192f) {
            switch (extensionDescriptor.f24190d.ordinal()) {
                case 0:
                    arrayList = new ArrayList();
                    reader.mo13030M(arrayList);
                    break;
                case 1:
                    arrayList = new ArrayList();
                    reader.mo13025H(arrayList);
                    break;
                case 2:
                    arrayList = new ArrayList();
                    reader.mo13070q(arrayList);
                    break;
                case 3:
                    arrayList = new ArrayList();
                    reader.mo13067n(arrayList);
                    break;
                case 4:
                    arrayList = new ArrayList();
                    reader.mo13072s(arrayList);
                    break;
                case 5:
                    arrayList = new ArrayList();
                    reader.mo13033P(arrayList);
                    break;
                case 6:
                    arrayList = new ArrayList();
                    reader.mo13075v(arrayList);
                    break;
                case 7:
                    arrayList = new ArrayList();
                    reader.mo13078y(arrayList);
                    break;
                case 8:
                case 9:
                case 10:
                case 11:
                default:
                    StringBuilder m24u = C0000a.m24u("Type cannot be packed: ");
                    m24u.append(generatedExtension.f24196d.f24190d);
                    throw new IllegalStateException(m24u.toString());
                case 12:
                    arrayList = new ArrayList();
                    reader.mo13058h(arrayList);
                    break;
                case 13:
                    arrayList = new ArrayList();
                    reader.mo13073t(arrayList);
                    ub = (UB) SchemaUtil.m13621y(i2, arrayList, generatedExtension.f24196d.f24188b, ub, unknownFieldSchema);
                    break;
                case 14:
                    arrayList = new ArrayList();
                    reader.mo13050d(arrayList);
                    break;
                case 15:
                    arrayList = new ArrayList();
                    reader.mo13071r(arrayList);
                    break;
                case 16:
                    arrayList = new ArrayList();
                    reader.mo13044a(arrayList);
                    break;
                case 17:
                    arrayList = new ArrayList();
                    reader.mo13054f(arrayList);
                    break;
            }
            fieldSet.m13398o(generatedExtension.f24196d, arrayList);
        } else {
            Object obj2 = null;
            WireFormat.FieldType fieldType = extensionDescriptor.f24190d;
            if (fieldType != WireFormat.FieldType.f24414q) {
                switch (fieldType.ordinal()) {
                    case 0:
                        obj2 = Double.valueOf(reader.readDouble());
                        break;
                    case 1:
                        obj2 = Float.valueOf(reader.readFloat());
                        break;
                    case 2:
                        obj2 = Long.valueOf(reader.mo13031N());
                        break;
                    case 3:
                        obj2 = Long.valueOf(reader.mo13046b());
                        break;
                    case 4:
                        obj2 = Integer.valueOf(reader.mo13026I());
                        break;
                    case 5:
                        obj2 = Long.valueOf(reader.mo13048c());
                        break;
                    case 6:
                        obj2 = Integer.valueOf(reader.mo13062j());
                        break;
                    case 7:
                        obj2 = Boolean.valueOf(reader.mo13064k());
                        break;
                    case 8:
                        obj2 = reader.mo13079z();
                        break;
                    case 9:
                        obj2 = reader.mo13018A(generatedExtension.f24195c.getClass(), extensionRegistryLite);
                        break;
                    case 10:
                        obj2 = reader.mo13060i(generatedExtension.f24195c.getClass(), extensionRegistryLite);
                        break;
                    case 11:
                        obj2 = reader.mo13024G();
                        break;
                    case 12:
                        obj2 = Integer.valueOf(reader.mo13069p());
                        break;
                    case 13:
                        throw new IllegalStateException("Shouldn't reach here.");
                    case 14:
                        obj2 = Integer.valueOf(reader.mo13028K());
                        break;
                    case 15:
                        obj2 = Long.valueOf(reader.mo13066m());
                        break;
                    case 16:
                        obj2 = Integer.valueOf(reader.mo13076w());
                        break;
                    case 17:
                        obj2 = Long.valueOf(reader.mo13077x());
                        break;
                }
            } else {
                int mo13026I = reader.mo13026I();
                if (generatedExtension.f24196d.f24188b.mo11029a(mo13026I) == null) {
                    Class<?> cls = SchemaUtil.f24337a;
                    if (ub == null) {
                        ub = unknownFieldSchema.mo13659m();
                    }
                    unknownFieldSchema.mo13651e(ub, i2, mo13026I);
                    return ub;
                }
                obj2 = Integer.valueOf(mo13026I);
            }
            GeneratedMessageLite.ExtensionDescriptor extensionDescriptor2 = generatedExtension.f24196d;
            if (extensionDescriptor2.f24191e) {
                fieldSet.m13389a(extensionDescriptor2, obj2);
            } else {
                int ordinal = extensionDescriptor2.f24190d.ordinal();
                if ((ordinal == 9 || ordinal == 10) && (m13391g = fieldSet.m13391g(generatedExtension.f24196d)) != null) {
                    obj2 = Internal.m13455c(m13391g, obj2);
                }
                fieldSet.m13398o(generatedExtension.f24196d, obj2);
            }
        }
        return ub;
    }

    @Override // com.google.protobuf.ExtensionSchema
    /* renamed from: h */
    public void mo13376h(Reader reader, Object obj, ExtensionRegistryLite extensionRegistryLite, FieldSet<GeneratedMessageLite.ExtensionDescriptor> fieldSet) throws IOException {
        GeneratedMessageLite.GeneratedExtension generatedExtension = (GeneratedMessageLite.GeneratedExtension) obj;
        fieldSet.m13398o(generatedExtension.f24196d, reader.mo13060i(generatedExtension.f24195c.getClass(), extensionRegistryLite));
    }

    @Override // com.google.protobuf.ExtensionSchema
    /* renamed from: i */
    public void mo13377i(ByteString byteString, Object obj, ExtensionRegistryLite extensionRegistryLite, FieldSet<GeneratedMessageLite.ExtensionDescriptor> fieldSet) throws IOException {
        GeneratedMessageLite.GeneratedExtension generatedExtension = (GeneratedMessageLite.GeneratedExtension) obj;
        MessageLite mo13438K0 = generatedExtension.f24195c.mo13431d().mo13438K0();
        ByteBuffer wrap = ByteBuffer.wrap(byteString.m13154D());
        if (!wrap.hasArray()) {
            throw new IllegalArgumentException("Direct buffers not yet supported");
        }
        BinaryReader.SafeHeapReader safeHeapReader = new BinaryReader.SafeHeapReader(wrap, true);
        Protobuf.f24310c.m13568b(mo13438K0).mo13541e(mo13438K0, safeHeapReader, extensionRegistryLite);
        fieldSet.m13398o(generatedExtension.f24196d, mo13438K0);
        if (safeHeapReader.mo13019B() != Integer.MAX_VALUE) {
            throw InvalidProtocolBufferException.m13456a();
        }
    }

    @Override // com.google.protobuf.ExtensionSchema
    /* renamed from: j */
    public void mo13378j(Writer writer, Map.Entry<?, ?> entry) throws IOException {
        GeneratedMessageLite.ExtensionDescriptor extensionDescriptor = (GeneratedMessageLite.ExtensionDescriptor) entry.getKey();
        if (!extensionDescriptor.f24191e) {
            switch (extensionDescriptor.f24190d.ordinal()) {
                case 0:
                    writer.mo13110g(extensionDescriptor.f24189c, ((Double) entry.getValue()).doubleValue());
                    break;
                case 1:
                    writer.mo13088H(extensionDescriptor.f24189c, ((Float) entry.getValue()).floatValue());
                    break;
                case 2:
                    writer.mo13116r(extensionDescriptor.f24189c, ((Long) entry.getValue()).longValue());
                    break;
                case 3:
                    writer.mo13133o(extensionDescriptor.f24189c, ((Long) entry.getValue()).longValue());
                    break;
                case 4:
                    writer.mo13139x(extensionDescriptor.f24189c, ((Integer) entry.getValue()).intValue());
                    break;
                case 5:
                    writer.mo13131k(extensionDescriptor.f24189c, ((Long) entry.getValue()).longValue());
                    break;
                case 6:
                    writer.mo13126f(extensionDescriptor.f24189c, ((Integer) entry.getValue()).intValue());
                    break;
                case 7:
                    writer.mo13135s(extensionDescriptor.f24189c, ((Boolean) entry.getValue()).booleanValue());
                    break;
                case 8:
                    writer.mo13132n(extensionDescriptor.f24189c, (String) entry.getValue());
                    break;
                case 9:
                    writer.mo13136t(extensionDescriptor.f24189c, entry.getValue(), Protobuf.f24310c.m13567a(entry.getValue().getClass()));
                    break;
                case 10:
                    writer.mo13130j(extensionDescriptor.f24189c, entry.getValue(), Protobuf.f24310c.m13567a(entry.getValue().getClass()));
                    break;
                case 11:
                    writer.mo13138w(extensionDescriptor.f24189c, (ByteString) entry.getValue());
                    break;
                case 12:
                    writer.mo13125d(extensionDescriptor.f24189c, ((Integer) entry.getValue()).intValue());
                    break;
                case 13:
                    writer.mo13139x(extensionDescriptor.f24189c, ((Integer) entry.getValue()).intValue());
                    break;
                case 14:
                    writer.mo13117u(extensionDescriptor.f24189c, ((Integer) entry.getValue()).intValue());
                    break;
                case 15:
                    writer.mo13082A(extensionDescriptor.f24189c, ((Long) entry.getValue()).longValue());
                    break;
                case 16:
                    writer.mo13122O(extensionDescriptor.f24189c, ((Integer) entry.getValue()).intValue());
                    break;
                case 17:
                    writer.mo13120G(extensionDescriptor.f24189c, ((Long) entry.getValue()).longValue());
                    break;
            }
        }
        switch (extensionDescriptor.f24190d.ordinal()) {
            case 0:
                SchemaUtil.m13581G(extensionDescriptor.f24189c, (List) entry.getValue(), writer, extensionDescriptor.f24192f);
                break;
            case 1:
                SchemaUtil.m13585K(extensionDescriptor.f24189c, (List) entry.getValue(), writer, extensionDescriptor.f24192f);
                break;
            case 2:
                SchemaUtil.m13588N(extensionDescriptor.f24189c, (List) entry.getValue(), writer, extensionDescriptor.f24192f);
                break;
            case 3:
                SchemaUtil.m13596V(extensionDescriptor.f24189c, (List) entry.getValue(), writer, extensionDescriptor.f24192f);
                break;
            case 4:
                SchemaUtil.m13587M(extensionDescriptor.f24189c, (List) entry.getValue(), writer, extensionDescriptor.f24192f);
                break;
            case 5:
                SchemaUtil.m13584J(extensionDescriptor.f24189c, (List) entry.getValue(), writer, extensionDescriptor.f24192f);
                break;
            case 6:
                SchemaUtil.m13583I(extensionDescriptor.f24189c, (List) entry.getValue(), writer, extensionDescriptor.f24192f);
                break;
            case 7:
                SchemaUtil.m13579E(extensionDescriptor.f24189c, (List) entry.getValue(), writer, extensionDescriptor.f24192f);
                break;
            case 8:
                SchemaUtil.m13594T(extensionDescriptor.f24189c, (List) entry.getValue(), writer);
                break;
            case 9:
                List list = (List) entry.getValue();
                if (list != null && !list.isEmpty()) {
                    SchemaUtil.m13586L(extensionDescriptor.f24189c, (List) entry.getValue(), writer, Protobuf.f24310c.m13567a(list.get(0).getClass()));
                    break;
                }
                break;
            case 10:
                List list2 = (List) entry.getValue();
                if (list2 != null && !list2.isEmpty()) {
                    SchemaUtil.m13589O(extensionDescriptor.f24189c, (List) entry.getValue(), writer, Protobuf.f24310c.m13567a(list2.get(0).getClass()));
                    break;
                }
                break;
            case 11:
                SchemaUtil.m13580F(extensionDescriptor.f24189c, (List) entry.getValue(), writer);
                break;
            case 12:
                SchemaUtil.m13595U(extensionDescriptor.f24189c, (List) entry.getValue(), writer, extensionDescriptor.f24192f);
                break;
            case 13:
                SchemaUtil.m13587M(extensionDescriptor.f24189c, (List) entry.getValue(), writer, extensionDescriptor.f24192f);
                break;
            case 14:
                SchemaUtil.m13590P(extensionDescriptor.f24189c, (List) entry.getValue(), writer, extensionDescriptor.f24192f);
                break;
            case 15:
                SchemaUtil.m13591Q(extensionDescriptor.f24189c, (List) entry.getValue(), writer, extensionDescriptor.f24192f);
                break;
            case 16:
                SchemaUtil.m13592R(extensionDescriptor.f24189c, (List) entry.getValue(), writer, extensionDescriptor.f24192f);
                break;
            case 17:
                SchemaUtil.m13593S(extensionDescriptor.f24189c, (List) entry.getValue(), writer, extensionDescriptor.f24192f);
                break;
        }
    }
}
