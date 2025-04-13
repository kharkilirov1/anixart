package com.google.common.hash;

import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.Immutable;
import java.io.Serializable;
import java.util.Objects;
import java.util.zip.Checksum;

@Immutable
/* loaded from: classes.dex */
final class ChecksumHashFunction extends AbstractHashFunction implements Serializable {

    /* renamed from: b */
    public final ImmutableSupplier<? extends Checksum> f21757b;

    /* renamed from: c */
    public final int f21758c;

    /* renamed from: d */
    public final String f21759d;

    public final class ChecksumHasher extends AbstractByteHasher {
    }

    public ChecksumHashFunction(ImmutableSupplier<? extends Checksum> immutableSupplier, int i2, String str) {
        this.f21757b = immutableSupplier;
        Preconditions.m11181e(i2 == 32 || i2 == 64, "bits (%s) must be either 32 or 64", i2);
        this.f21758c = i2;
        Objects.requireNonNull(str);
        this.f21759d = str;
    }

    public String toString() {
        return this.f21759d;
    }
}
