package androidx.core.os;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import com.fasterxml.jackson.core.JsonFactory;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: Bundle.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m31884d2 = {"core-ktx_release"}, m31885k = 2, m31886mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class BundleKt {
    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    /* renamed from: a */
    public static final Bundle m1944a(@NotNull Pair<String, ? extends Object>... pairArr) {
        Bundle bundle = new Bundle(pairArr.length);
        for (Pair<String, ? extends Object> pair : pairArr) {
            String str = pair.f63055b;
            B b = pair.f63056c;
            if (b == 0) {
                bundle.putString(str, null);
            } else if (b instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) b).booleanValue());
            } else if (b instanceof Byte) {
                bundle.putByte(str, ((Number) b).byteValue());
            } else if (b instanceof Character) {
                bundle.putChar(str, ((Character) b).charValue());
            } else if (b instanceof Double) {
                bundle.putDouble(str, ((Number) b).doubleValue());
            } else if (b instanceof Float) {
                bundle.putFloat(str, ((Number) b).floatValue());
            } else if (b instanceof Integer) {
                bundle.putInt(str, ((Number) b).intValue());
            } else if (b instanceof Long) {
                bundle.putLong(str, ((Number) b).longValue());
            } else if (b instanceof Short) {
                bundle.putShort(str, ((Number) b).shortValue());
            } else if (b instanceof Bundle) {
                bundle.putBundle(str, (Bundle) b);
            } else if (b instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) b);
            } else if (b instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) b);
            } else if (b instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) b);
            } else if (b instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) b);
            } else if (b instanceof char[]) {
                bundle.putCharArray(str, (char[]) b);
            } else if (b instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) b);
            } else if (b instanceof float[]) {
                bundle.putFloatArray(str, (float[]) b);
            } else if (b instanceof int[]) {
                bundle.putIntArray(str, (int[]) b);
            } else if (b instanceof long[]) {
                bundle.putLongArray(str, (long[]) b);
            } else if (b instanceof short[]) {
                bundle.putShortArray(str, (short[]) b);
            } else if (b instanceof Object[]) {
                Class<?> componentType = b.getClass().getComponentType();
                Intrinsics.m32176e(componentType);
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    bundle.putParcelableArray(str, (Parcelable[]) b);
                } else if (String.class.isAssignableFrom(componentType)) {
                    bundle.putStringArray(str, (String[]) b);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    bundle.putCharSequenceArray(str, (CharSequence[]) b);
                } else {
                    if (!Serializable.class.isAssignableFrom(componentType)) {
                        throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + str + JsonFactory.DEFAULT_QUOTE_CHAR);
                    }
                    bundle.putSerializable(str, (Serializable) b);
                }
            } else if (b instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) b);
            } else if (b instanceof IBinder) {
                BundleApi18ImplKt.m1941a(bundle, str, (IBinder) b);
            } else if (b instanceof Size) {
                BundleApi21ImplKt.m1942a(bundle, str, (Size) b);
            } else {
                if (!(b instanceof SizeF)) {
                    throw new IllegalArgumentException("Illegal value type " + b.getClass().getCanonicalName() + " for key \"" + str + JsonFactory.DEFAULT_QUOTE_CHAR);
                }
                BundleApi21ImplKt.m1943b(bundle, str, (SizeF) b);
            }
        }
        return bundle;
    }
}
