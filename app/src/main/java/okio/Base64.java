package okio;

import com.fasterxml.jackson.core.Base64Variants;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;

/* compiled from: -Base64.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m31884d2 = {"okio"}, m31885k = 2, m31886mv = {1, 4, 0})
@JvmName
/* renamed from: okio.-Base64, reason: invalid class name */
/* loaded from: classes3.dex */
public final class Base64 {

    /* renamed from: a */
    @NotNull
    public static final byte[] f68736a;

    static {
        ByteString.Companion companion = ByteString.f68753f;
        f68736a = companion.m34592d(Base64Variants.STD_BASE64_ALPHABET).f68756d;
        companion.m34592d("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_");
    }
}
