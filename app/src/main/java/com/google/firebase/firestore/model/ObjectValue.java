package com.google.firebase.firestore.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.firestore.util.Assert;
import com.google.firestore.p012v1.MapValue;
import com.google.firestore.p012v1.Value;
import com.google.protobuf.MapFieldLite;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import p000a.C0000a;

/* loaded from: classes2.dex */
public final class ObjectValue implements Cloneable {

    /* renamed from: b */
    public Value f22875b;

    /* renamed from: c */
    public final Map<String, Object> f22876c;

    public ObjectValue(Value value) {
        this.f22876c = new HashMap();
        Assert.m12490b(value.m12815X() == Value.ValueTypeCase.MAP_VALUE, "ObjectValues should be backed by a MapValue", new Object[0]);
        Assert.m12490b(!ServerTimestamps.m12455b(value), "ServerTimestamps should not be used as an ObjectValue", new Object[0]);
        this.f22875b = value;
    }

    @Nullable
    /* renamed from: a */
    public final MapValue m12448a(FieldPath fieldPath, Map<String, Object> map) {
        Value m12451d = m12451d(this.f22875b, fieldPath);
        Value value = Values.f22880a;
        MapValue.Builder mo13429b = m12451d != null && m12451d.m12815X() == Value.ValueTypeCase.MAP_VALUE ? m12451d.m12811T().mo13429b() : MapValue.m12766O();
        boolean z = false;
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value2 = entry.getValue();
            if (value2 instanceof Map) {
                MapValue m12448a = m12448a(fieldPath.m12427a(key), (Map) value2);
                if (m12448a != null) {
                    Value.Builder m12804Y = Value.m12804Y();
                    m12804Y.m13441n();
                    Value.m12800J((Value) m12804Y.f24185c, m12448a);
                    mo13429b.m12771r(key, m12804Y.mo13437A());
                    z = true;
                }
            } else {
                if (value2 instanceof Value) {
                    mo13429b.m12771r(key, (Value) value2);
                } else {
                    Objects.requireNonNull(mo13429b);
                    Objects.requireNonNull(key);
                    if (((MapValue) mo13429b.f24185c).m12768L().containsKey(key)) {
                        Assert.m12490b(value2 == null, "Expected entry to be a Map, a Value or null", new Object[0]);
                        mo13429b.m13441n();
                        ((MapFieldLite) MapValue.m12764I((MapValue) mo13429b.f24185c)).remove(key);
                    }
                }
                z = true;
            }
        }
        if (z) {
            return mo13429b.mo13437A();
        }
        return null;
    }

    /* renamed from: b */
    public final Value m12449b() {
        synchronized (this.f22876c) {
            MapValue m12448a = m12448a(FieldPath.f22859d, this.f22876c);
            if (m12448a != null) {
                Value.Builder m12804Y = Value.m12804Y();
                m12804Y.m13441n();
                Value.m12800J((Value) m12804Y.f24185c, m12448a);
                this.f22875b = m12804Y.mo13437A();
                this.f22876c.clear();
            }
        }
        return this.f22875b;
    }

    @NonNull
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public ObjectValue clone() {
        return new ObjectValue(m12449b());
    }

    @Nullable
    /* renamed from: d */
    public final Value m12451d(Value value, FieldPath fieldPath) {
        if (fieldPath.m12433h()) {
            return value;
        }
        int i2 = 0;
        while (true) {
            if (i2 >= fieldPath.m12434i() - 1) {
                return value.m12811T().m12769M(fieldPath.m12431e(), null);
            }
            value = value.m12811T().m12769M(fieldPath.m12432f(i2), null);
            Value value2 = Values.f22880a;
            if (!(value != null && value.m12815X() == Value.ValueTypeCase.MAP_VALUE)) {
                return null;
            }
            i2++;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ObjectValue) {
            return Values.m12461e(m12449b(), ((ObjectValue) obj).m12449b());
        }
        return false;
    }

    public int hashCode() {
        return m12449b().hashCode();
    }

    @NonNull
    public String toString() {
        StringBuilder m24u = C0000a.m24u("ObjectValue{internalValue=");
        m24u.append(Values.m12457a(m12449b()));
        m24u.append('}');
        return m24u.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ObjectValue() {
        /*
            r2 = this;
            com.google.firestore.v1.Value$Builder r0 = com.google.firestore.p012v1.Value.m12804Y()
            com.google.firestore.v1.MapValue r1 = com.google.firestore.p012v1.MapValue.m12765J()
            r0.m12818t(r1)
            com.google.protobuf.GeneratedMessageLite r0 = r0.mo13437A()
            com.google.firestore.v1.Value r0 = (com.google.firestore.p012v1.Value) r0
            r2.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.firestore.model.ObjectValue.<init>():void");
    }
}
