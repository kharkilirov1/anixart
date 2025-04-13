package com.google.common.util.concurrent;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Function;
import com.google.common.collect.Ordering;
import java.lang.reflect.Constructor;
import java.util.Arrays;
import java.util.concurrent.CopyOnWriteArraySet;

@GwtIncompatible
/* loaded from: classes2.dex */
final class FuturesGetChecked {

    /* renamed from: a */
    public static final /* synthetic */ int f22182a = 0;

    @VisibleForTesting
    public interface GetCheckedTypeValidator {
    }

    @VisibleForTesting
    public static class GetCheckedTypeValidatorHolder {

        /* renamed from: a */
        public static final String f22183a;

        /* renamed from: b */
        public static final GetCheckedTypeValidator f22184b;

        @IgnoreJRERequirement
        public enum ClassValueValidator implements GetCheckedTypeValidator {
            INSTANCE;

            static {
                new ClassValue<Boolean>() { // from class: com.google.common.util.concurrent.FuturesGetChecked.GetCheckedTypeValidatorHolder.ClassValueValidator.1
                };
            }
        }

        public enum WeakSetValidator implements GetCheckedTypeValidator {
            INSTANCE;

            static {
                new CopyOnWriteArraySet();
            }
        }

        static {
            GetCheckedTypeValidator getCheckedTypeValidator;
            String concat = GetCheckedTypeValidatorHolder.class.getName().concat("$ClassValueValidator");
            f22183a = concat;
            try {
                getCheckedTypeValidator = (GetCheckedTypeValidator) Class.forName(concat).getEnumConstants()[0];
            } catch (Throwable unused) {
                int i2 = FuturesGetChecked.f22182a;
                getCheckedTypeValidator = WeakSetValidator.INSTANCE;
            }
            f22184b = getCheckedTypeValidator;
        }
    }

    static {
        Ordering.m11855d().m11858g(new Function<Constructor<?>, Boolean>() { // from class: com.google.common.util.concurrent.FuturesGetChecked.1
            @Override // com.google.common.base.Function
            public Boolean apply(Constructor<?> constructor) {
                return Boolean.valueOf(Arrays.asList(constructor.getParameterTypes()).contains(String.class));
            }
        }).mo11416h();
    }
}
