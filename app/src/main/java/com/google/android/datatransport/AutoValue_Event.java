package com.google.android.datatransport;

import androidx.annotation.Nullable;
import java.util.Objects;
import p000a.C0000a;

/* loaded from: classes.dex */
final class AutoValue_Event<T> extends Event<T> {

    /* renamed from: a */
    public final Integer f8947a = null;

    /* renamed from: b */
    public final T f8948b;

    /* renamed from: c */
    public final Priority f8949c;

    public AutoValue_Event(@Nullable Integer num, T t, Priority priority) {
        Objects.requireNonNull(t, "Null payload");
        this.f8948b = t;
        this.f8949c = priority;
    }

    @Override // com.google.android.datatransport.Event
    @Nullable
    /* renamed from: a */
    public Integer mo5396a() {
        return this.f8947a;
    }

    @Override // com.google.android.datatransport.Event
    /* renamed from: b */
    public T mo5397b() {
        return this.f8948b;
    }

    @Override // com.google.android.datatransport.Event
    /* renamed from: c */
    public Priority mo5398c() {
        return this.f8949c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Event)) {
            return false;
        }
        Event event = (Event) obj;
        Integer num = this.f8947a;
        if (num != null ? num.equals(event.mo5396a()) : event.mo5396a() == null) {
            if (this.f8948b.equals(event.mo5397b()) && this.f8949c.equals(event.mo5398c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        Integer num = this.f8947a;
        return (((((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003) ^ this.f8948b.hashCode()) * 1000003) ^ this.f8949c.hashCode();
    }

    public String toString() {
        StringBuilder m24u = C0000a.m24u("Event{code=");
        m24u.append(this.f8947a);
        m24u.append(", payload=");
        m24u.append(this.f8948b);
        m24u.append(", priority=");
        m24u.append(this.f8949c);
        m24u.append("}");
        return m24u.toString();
    }
}
