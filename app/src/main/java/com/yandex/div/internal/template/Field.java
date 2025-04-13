package com.yandex.div.internal.template;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: Field.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0005\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, m31884d2 = {"Lcom/yandex/div/internal/template/Field;", "T", "", "Companion", "Null", "Placeholder", "Reference", "Value", "Lcom/yandex/div/internal/template/Field$Null;", "Lcom/yandex/div/internal/template/Field$Placeholder;", "Lcom/yandex/div/internal/template/Field$Value;", "Lcom/yandex/div/internal/template/Field$Reference;", "div-json_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public abstract class Field<T> {

    /* renamed from: b */
    @NotNull
    public static final Companion f33876b = new Companion(null);

    /* renamed from: a */
    public final boolean f33877a;

    /* compiled from: Field.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/internal/template/Field$Companion;", "", "div-json_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        @NotNull
        /* renamed from: a */
        public final <T> Field<T> m17374a(boolean z) {
            return z ? Placeholder.f33879c : Null.f33878c;
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* compiled from: Field.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m31884d2 = {"Lcom/yandex/div/internal/template/Field$Null;", "Lcom/yandex/div/internal/template/Field;", "", "div-json_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Null extends Field<Object> {

        /* renamed from: c */
        @NotNull
        public static final Null f33878c = new Null();

        public Null() {
            super(false, null);
        }
    }

    /* compiled from: Field.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m31884d2 = {"Lcom/yandex/div/internal/template/Field$Placeholder;", "Lcom/yandex/div/internal/template/Field;", "", "div-json_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Placeholder extends Field<Object> {

        /* renamed from: c */
        @NotNull
        public static final Placeholder f33879c = new Placeholder();

        public Placeholder() {
            super(true, null);
        }
    }

    /* compiled from: Field.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/yandex/div/internal/template/Field$Reference;", "T", "Lcom/yandex/div/internal/template/Field;", "div-json_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Reference<T> extends Field<T> {

        /* renamed from: c */
        @NotNull
        public final String f33880c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Reference(boolean z, @NotNull String reference) {
            super(z, null);
            Intrinsics.m32179h(reference, "reference");
            this.f33880c = reference;
        }
    }

    /* compiled from: Field.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/yandex/div/internal/template/Field$Value;", "T", "Lcom/yandex/div/internal/template/Field;", "div-json_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Value<T> extends Field<T> {

        /* renamed from: c */
        public final T f33881c;

        public Value(boolean z, T t) {
            super(z, null);
            this.f33881c = t;
        }
    }

    public Field(boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this.f33877a = z;
    }
}
