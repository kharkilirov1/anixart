package com.yandex.div.core.resources;

import android.content.res.AssetFileDescriptor;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.content.res.loader.ResourcesLoader;
import android.graphics.Movie;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import androidx.annotation.RequiresApi;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: ResourcesWrapper.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0010\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/core/resources/ResourcesWrapper;", "Landroid/content/res/Resources;", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class ResourcesWrapper extends Resources {

    /* renamed from: a */
    @NotNull
    public final Resources f31322a;

    public ResourcesWrapper(@NotNull Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.f31322a = resources;
    }

    @Override // android.content.res.Resources
    @RequiresApi
    public void addLoaders(@NotNull ResourcesLoader... loaders) {
        Intrinsics.m32179h(loaders, "loaders");
        this.f31322a.addLoaders((ResourcesLoader[]) Arrays.copyOf(loaders, loaders.length));
    }

    @Override // android.content.res.Resources
    @NotNull
    public XmlResourceParser getAnimation(int i2) throws Resources.NotFoundException {
        XmlResourceParser animation = this.f31322a.getAnimation(i2);
        Intrinsics.m32178g(animation, "resources.getAnimation(id)");
        return animation;
    }

    @Override // android.content.res.Resources
    public boolean getBoolean(int i2) throws Resources.NotFoundException {
        return this.f31322a.getBoolean(i2);
    }

    @Override // android.content.res.Resources
    public int getColor(int i2) throws Resources.NotFoundException {
        return this.f31322a.getColor(i2);
    }

    @Override // android.content.res.Resources
    @RequiresApi
    @NotNull
    public ColorStateList getColorStateList(int i2, @Nullable Resources.Theme theme) throws Resources.NotFoundException {
        ColorStateList colorStateList = this.f31322a.getColorStateList(i2, theme);
        Intrinsics.m32178g(colorStateList, "resources.getColorStateList(id, theme)");
        return colorStateList;
    }

    @Override // android.content.res.Resources
    @Nullable
    public Configuration getConfiguration() {
        return this.f31322a.getConfiguration();
    }

    @Override // android.content.res.Resources
    public float getDimension(int i2) throws Resources.NotFoundException {
        return this.f31322a.getDimension(i2);
    }

    @Override // android.content.res.Resources
    public int getDimensionPixelOffset(int i2) throws Resources.NotFoundException {
        return this.f31322a.getDimensionPixelOffset(i2);
    }

    @Override // android.content.res.Resources
    public int getDimensionPixelSize(int i2) throws Resources.NotFoundException {
        return this.f31322a.getDimensionPixelSize(i2);
    }

    @Override // android.content.res.Resources
    @Nullable
    public DisplayMetrics getDisplayMetrics() {
        return this.f31322a.getDisplayMetrics();
    }

    @Override // android.content.res.Resources
    @Nullable
    public Drawable getDrawable(int i2, @Nullable Resources.Theme theme) throws Resources.NotFoundException {
        return this.f31322a.getDrawable(i2, theme);
    }

    @Override // android.content.res.Resources
    @Nullable
    public Drawable getDrawableForDensity(int i2, int i3) throws Resources.NotFoundException {
        return this.f31322a.getDrawableForDensity(i2, i3);
    }

    @Override // android.content.res.Resources
    @RequiresApi
    public float getFloat(int i2) throws Resources.NotFoundException {
        return this.f31322a.getFloat(i2);
    }

    @Override // android.content.res.Resources
    @RequiresApi
    @NotNull
    public Typeface getFont(int i2) throws Resources.NotFoundException {
        Typeface font = this.f31322a.getFont(i2);
        Intrinsics.m32178g(font, "resources.getFont(id)");
        return font;
    }

    @Override // android.content.res.Resources
    public float getFraction(int i2, int i3, int i4) throws Resources.NotFoundException {
        return this.f31322a.getFraction(i2, i3, i4);
    }

    @Override // android.content.res.Resources
    public int getIdentifier(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        return this.f31322a.getIdentifier(str, str2, str3);
    }

    @Override // android.content.res.Resources
    @NotNull
    public int[] getIntArray(int i2) throws Resources.NotFoundException {
        int[] intArray = this.f31322a.getIntArray(i2);
        Intrinsics.m32178g(intArray, "resources.getIntArray(id)");
        return intArray;
    }

    @Override // android.content.res.Resources
    public int getInteger(int i2) throws Resources.NotFoundException {
        return this.f31322a.getInteger(i2);
    }

    @Override // android.content.res.Resources
    @NotNull
    public XmlResourceParser getLayout(int i2) throws Resources.NotFoundException {
        XmlResourceParser layout = this.f31322a.getLayout(i2);
        Intrinsics.m32178g(layout, "resources.getLayout(id)");
        return layout;
    }

    @Override // android.content.res.Resources
    @Nullable
    public Movie getMovie(int i2) throws Resources.NotFoundException {
        return this.f31322a.getMovie(i2);
    }

    @Override // android.content.res.Resources
    @NotNull
    public String getQuantityString(int i2, int i3, @NotNull Object... formatArgs) throws Resources.NotFoundException {
        Intrinsics.m32179h(formatArgs, "formatArgs");
        String quantityString = this.f31322a.getQuantityString(i2, i3, Arrays.copyOf(formatArgs, formatArgs.length));
        Intrinsics.m32178g(quantityString, "resources.getQuantityStr…d, quantity, *formatArgs)");
        return quantityString;
    }

    @Override // android.content.res.Resources
    @NotNull
    public CharSequence getQuantityText(int i2, int i3) throws Resources.NotFoundException {
        CharSequence quantityText = this.f31322a.getQuantityText(i2, i3);
        Intrinsics.m32178g(quantityText, "resources.getQuantityText(id, quantity)");
        return quantityText;
    }

    @Override // android.content.res.Resources
    @Nullable
    public String getResourceEntryName(int i2) throws Resources.NotFoundException {
        return this.f31322a.getResourceEntryName(i2);
    }

    @Override // android.content.res.Resources
    @Nullable
    public String getResourceName(int i2) throws Resources.NotFoundException {
        return this.f31322a.getResourceName(i2);
    }

    @Override // android.content.res.Resources
    @Nullable
    public String getResourcePackageName(int i2) throws Resources.NotFoundException {
        return this.f31322a.getResourcePackageName(i2);
    }

    @Override // android.content.res.Resources
    @Nullable
    public String getResourceTypeName(int i2) throws Resources.NotFoundException {
        return this.f31322a.getResourceTypeName(i2);
    }

    @Override // android.content.res.Resources
    @NotNull
    public String getString(int i2, @NotNull Object... formatArgs) throws Resources.NotFoundException {
        Intrinsics.m32179h(formatArgs, "formatArgs");
        String string = this.f31322a.getString(i2, Arrays.copyOf(formatArgs, formatArgs.length));
        Intrinsics.m32178g(string, "resources.getString(id, *formatArgs)");
        return string;
    }

    @Override // android.content.res.Resources
    @NotNull
    public String[] getStringArray(int i2) throws Resources.NotFoundException {
        String[] stringArray = this.f31322a.getStringArray(i2);
        Intrinsics.m32178g(stringArray, "resources.getStringArray(id)");
        return stringArray;
    }

    @Override // android.content.res.Resources
    @Nullable
    public CharSequence getText(int i2, @Nullable CharSequence charSequence) {
        return this.f31322a.getText(i2, charSequence);
    }

    @Override // android.content.res.Resources
    @NotNull
    public CharSequence[] getTextArray(int i2) throws Resources.NotFoundException {
        CharSequence[] textArray = this.f31322a.getTextArray(i2);
        Intrinsics.m32178g(textArray, "resources.getTextArray(id)");
        return textArray;
    }

    @Override // android.content.res.Resources
    public void getValue(@Nullable String str, @Nullable TypedValue typedValue, boolean z) throws Resources.NotFoundException {
        this.f31322a.getValue(str, typedValue, z);
    }

    @Override // android.content.res.Resources
    public void getValueForDensity(int i2, int i3, @Nullable TypedValue typedValue, boolean z) throws Resources.NotFoundException {
        this.f31322a.getValueForDensity(i2, i3, typedValue, z);
    }

    @Override // android.content.res.Resources
    @NotNull
    public XmlResourceParser getXml(int i2) throws Resources.NotFoundException {
        XmlResourceParser xml = this.f31322a.getXml(i2);
        Intrinsics.m32178g(xml, "resources.getXml(id)");
        return xml;
    }

    @Override // android.content.res.Resources
    @Nullable
    public TypedArray obtainAttributes(@Nullable AttributeSet attributeSet, @Nullable int[] iArr) {
        return this.f31322a.obtainAttributes(attributeSet, iArr);
    }

    @Override // android.content.res.Resources
    @NotNull
    public TypedArray obtainTypedArray(int i2) throws Resources.NotFoundException {
        TypedArray obtainTypedArray = this.f31322a.obtainTypedArray(i2);
        Intrinsics.m32178g(obtainTypedArray, "resources.obtainTypedArray(id)");
        return obtainTypedArray;
    }

    @Override // android.content.res.Resources
    @NotNull
    public InputStream openRawResource(int i2, @Nullable TypedValue typedValue) throws Resources.NotFoundException {
        InputStream openRawResource = this.f31322a.openRawResource(i2, typedValue);
        Intrinsics.m32178g(openRawResource, "resources.openRawResource(id, value)");
        return openRawResource;
    }

    @Override // android.content.res.Resources
    @Nullable
    public AssetFileDescriptor openRawResourceFd(int i2) throws Resources.NotFoundException {
        return this.f31322a.openRawResourceFd(i2);
    }

    @Override // android.content.res.Resources
    public void parseBundleExtra(@Nullable String str, @Nullable AttributeSet attributeSet, @Nullable Bundle bundle) throws XmlPullParserException {
        this.f31322a.parseBundleExtra(str, attributeSet, bundle);
    }

    @Override // android.content.res.Resources
    public void parseBundleExtras(@Nullable XmlResourceParser xmlResourceParser, @Nullable Bundle bundle) throws XmlPullParserException, IOException {
        this.f31322a.parseBundleExtras(xmlResourceParser, bundle);
    }

    @Override // android.content.res.Resources
    @RequiresApi
    public void removeLoaders(@NotNull ResourcesLoader... loaders) {
        Intrinsics.m32179h(loaders, "loaders");
        this.f31322a.removeLoaders((ResourcesLoader[]) Arrays.copyOf(loaders, loaders.length));
    }

    @Override // android.content.res.Resources
    public void updateConfiguration(@Nullable Configuration configuration, @Nullable DisplayMetrics displayMetrics) {
        super.updateConfiguration(configuration, displayMetrics);
        Resources resources = this.f31322a;
        if (resources != null) {
            resources.updateConfiguration(configuration, displayMetrics);
        }
    }

    @Override // android.content.res.Resources
    @RequiresApi
    public int getColor(int i2, @Nullable Resources.Theme theme) throws Resources.NotFoundException {
        return this.f31322a.getColor(i2, theme);
    }

    @Override // android.content.res.Resources
    @NotNull
    public ColorStateList getColorStateList(int i2) throws Resources.NotFoundException {
        ColorStateList colorStateList = this.f31322a.getColorStateList(i2);
        Intrinsics.m32178g(colorStateList, "resources.getColorStateList(id)");
        return colorStateList;
    }

    @Override // android.content.res.Resources
    @Nullable
    public Drawable getDrawable(int i2) throws Resources.NotFoundException {
        return this.f31322a.getDrawable(i2);
    }

    @Override // android.content.res.Resources
    @Nullable
    public Drawable getDrawableForDensity(int i2, int i3, @Nullable Resources.Theme theme) {
        return this.f31322a.getDrawableForDensity(i2, i3, theme);
    }

    @Override // android.content.res.Resources
    @NotNull
    public String getQuantityString(int i2, int i3) throws Resources.NotFoundException {
        String quantityString = this.f31322a.getQuantityString(i2, i3);
        Intrinsics.m32178g(quantityString, "resources.getQuantityString(id, quantity)");
        return quantityString;
    }

    @Override // android.content.res.Resources
    @NotNull
    public String getString(int i2) throws Resources.NotFoundException {
        String string = this.f31322a.getString(i2);
        Intrinsics.m32178g(string, "resources.getString(id)");
        return string;
    }

    @Override // android.content.res.Resources
    @NotNull
    public CharSequence getText(int i2) throws Resources.NotFoundException {
        CharSequence text = this.f31322a.getText(i2);
        Intrinsics.m32178g(text, "resources.getText(id)");
        return text;
    }

    @Override // android.content.res.Resources
    public void getValue(int i2, @Nullable TypedValue typedValue, boolean z) throws Resources.NotFoundException {
        this.f31322a.getValue(i2, typedValue, z);
    }

    @Override // android.content.res.Resources
    @NotNull
    public InputStream openRawResource(int i2) throws Resources.NotFoundException {
        InputStream openRawResource = this.f31322a.openRawResource(i2);
        Intrinsics.m32178g(openRawResource, "resources.openRawResource(id)");
        return openRawResource;
    }
}
