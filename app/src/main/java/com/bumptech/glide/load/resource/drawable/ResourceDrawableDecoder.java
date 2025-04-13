package com.bumptech.glide.load.resource.drawable;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.Resource;
import java.io.IOException;
import java.util.List;
import p000a.C0000a;

/* loaded from: classes.dex */
public class ResourceDrawableDecoder implements ResourceDecoder<Uri, Drawable> {

    /* renamed from: a */
    public final Context f8593a;

    public ResourceDrawableDecoder(Context context) {
        this.f8593a = context.getApplicationContext();
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    /* renamed from: a */
    public boolean mo4962a(@NonNull Uri uri, @NonNull Options options) throws IOException {
        return uri.getScheme().equals("android.resource");
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    @Nullable
    /* renamed from: b */
    public /* bridge */ /* synthetic */ Resource<Drawable> mo4963b(@NonNull Uri uri, int i2, int i3, @NonNull Options options) throws IOException {
        return m5198c(uri);
    }

    @Nullable
    /* renamed from: c */
    public Resource m5198c(@NonNull Uri uri) {
        Context context;
        int parseInt;
        String authority = uri.getAuthority();
        if (authority.equals(this.f8593a.getPackageName())) {
            context = this.f8593a;
        } else {
            try {
                context = this.f8593a.createPackageContext(authority, 0);
            } catch (PackageManager.NameNotFoundException e2) {
                if (!authority.contains(this.f8593a.getPackageName())) {
                    throw new IllegalArgumentException(C0000a.m12i("Failed to obtain context or unrecognized Uri format for: ", uri), e2);
                }
                context = this.f8593a;
            }
        }
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 2) {
            List<String> pathSegments2 = uri.getPathSegments();
            String authority2 = uri.getAuthority();
            String str = pathSegments2.get(0);
            String str2 = pathSegments2.get(1);
            parseInt = context.getResources().getIdentifier(str2, str, authority2);
            if (parseInt == 0) {
                parseInt = Resources.getSystem().getIdentifier(str2, str, "android");
            }
            if (parseInt == 0) {
                throw new IllegalArgumentException(C0000a.m12i("Failed to find resource id for: ", uri));
            }
        } else {
            if (pathSegments.size() != 1) {
                throw new IllegalArgumentException(C0000a.m12i("Unrecognized Uri format: ", uri));
            }
            try {
                parseInt = Integer.parseInt(uri.getPathSegments().get(0));
            } catch (NumberFormatException e3) {
                throw new IllegalArgumentException(C0000a.m12i("Unrecognized Uri format: ", uri), e3);
            }
        }
        Drawable m5196a = DrawableDecoderCompat.m5196a(this.f8593a, context, parseInt, null);
        if (m5196a != null) {
            return new NonOwnedDrawableResource(m5196a);
        }
        return null;
    }
}
