package com.swiftsoft.anixartd.utils.filepicker.utils;

import com.swiftsoft.anixartd.utils.filepicker.model.DialogProperties;
import java.io.File;
import java.io.FileFilter;
import java.util.Locale;
import java.util.Objects;

/* loaded from: classes2.dex */
public class ExtensionFilter implements FileFilter {

    /* renamed from: a */
    public final String[] f30506a;

    /* renamed from: b */
    public DialogProperties f30507b;

    public ExtensionFilter(DialogProperties dialogProperties) {
        Objects.requireNonNull(dialogProperties);
        this.f30506a = new String[]{""};
        this.f30507b = dialogProperties;
    }

    @Override // java.io.FileFilter
    public boolean accept(File file) {
        if (file.isDirectory() && file.canRead()) {
            return true;
        }
        Objects.requireNonNull(this.f30507b);
        String lowerCase = file.getName().toLowerCase(Locale.getDefault());
        for (String str : this.f30506a) {
            if (lowerCase.endsWith(str)) {
                return true;
            }
        }
        return false;
    }
}
