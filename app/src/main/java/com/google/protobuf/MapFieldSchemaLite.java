package com.google.protobuf;

import com.google.protobuf.MapEntryLite;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes2.dex */
class MapFieldSchemaLite implements MapFieldSchema {
    @Override // com.google.protobuf.MapFieldSchema
    /* renamed from: a */
    public Object mo13493a(Object obj, Object obj2) {
        MapFieldLite mapFieldLite = (MapFieldLite) obj;
        MapFieldLite mapFieldLite2 = (MapFieldLite) obj2;
        if (!mapFieldLite2.isEmpty()) {
            if (!mapFieldLite.f24270b) {
                mapFieldLite = mapFieldLite.m13492c();
            }
            mapFieldLite.m13491b();
            if (!mapFieldLite2.isEmpty()) {
                mapFieldLite.putAll(mapFieldLite2);
            }
        }
        return mapFieldLite;
    }

    @Override // com.google.protobuf.MapFieldSchema
    /* renamed from: b */
    public Object mo13494b(Object obj) {
        ((MapFieldLite) obj).f24270b = false;
        return obj;
    }

    @Override // com.google.protobuf.MapFieldSchema
    /* renamed from: c */
    public MapEntryLite.Metadata<?, ?> mo13495c(Object obj) {
        return ((MapEntryLite) obj).f24261a;
    }

    @Override // com.google.protobuf.MapFieldSchema
    /* renamed from: d */
    public Map<?, ?> mo13496d(Object obj) {
        return (MapFieldLite) obj;
    }

    @Override // com.google.protobuf.MapFieldSchema
    /* renamed from: e */
    public Object mo13497e(Object obj) {
        return MapFieldLite.f24269c.m13492c();
    }

    @Override // com.google.protobuf.MapFieldSchema
    /* renamed from: f */
    public int mo13498f(int i2, Object obj, Object obj2) {
        MapFieldLite mapFieldLite = (MapFieldLite) obj;
        MapEntryLite mapEntryLite = (MapEntryLite) obj2;
        int i3 = 0;
        if (!mapFieldLite.isEmpty()) {
            for (Map.Entry entry : mapFieldLite.entrySet()) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                Objects.requireNonNull(mapEntryLite);
                i3 += CodedOutputStream.m13265g0(MapEntryLite.m13488a(mapEntryLite.f24261a, key, value)) + CodedOutputStream.m13274p0(i2);
            }
        }
        return i3;
    }

    @Override // com.google.protobuf.MapFieldSchema
    /* renamed from: g */
    public boolean mo13499g(Object obj) {
        return !((MapFieldLite) obj).f24270b;
    }

    @Override // com.google.protobuf.MapFieldSchema
    /* renamed from: h */
    public Map<?, ?> mo13500h(Object obj) {
        return (MapFieldLite) obj;
    }
}
