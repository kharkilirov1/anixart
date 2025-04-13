package com.swiftsoft.anixartd.database.entity;

import androidx.room.Entity;
import androidx.room.PrimaryKey;
import com.swiftsoft.anixartd.database.util.Identifiable;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CustomFilter.kt */
@Entity
@Metadata(m31883d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b%\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J\u0013\u0010F\u001a\u00020\u000b2\b\u0010G\u001a\u0004\u0018\u00010HH\u0096\u0002J\b\u0010I\u001a\u00020\"H\u0016R\u001e\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\f\"\u0004\b\r\u0010\u000eR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0016\u001a\u0004\u0018\u00010\u0002X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001b\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001c\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001e\u0010!\u001a\u0004\u0018\u00010\"X\u0086\u000e¢\u0006\u0010\n\u0002\u0010'\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001e\u0010(\u001a\u0004\u0018\u00010\"X\u0086\u000e¢\u0006\u0010\n\u0002\u0010'\u001a\u0004\b)\u0010$\"\u0004\b*\u0010&R\u001e\u0010+\u001a\u0004\u0018\u00010\"X\u0086\u000e¢\u0006\u0010\n\u0002\u0010'\u001a\u0004\b,\u0010$\"\u0004\b-\u0010&R \u0010.\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u0013\"\u0004\b0\u0010\u0015R \u00101\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u0013\"\u0004\b3\u0010\u0015R\u001e\u00104\u001a\u0004\u0018\u00010\"X\u0086\u000e¢\u0006\u0010\n\u0002\u0010'\u001a\u0004\b5\u0010$\"\u0004\b6\u0010&R\u001e\u00107\u001a\u0004\u0018\u00010\"X\u0086\u000e¢\u0006\u0010\n\u0002\u0010'\u001a\u0004\b8\u0010$\"\u0004\b9\u0010&R\u001e\u0010:\u001a\u0004\u0018\u00010\"X\u0086\u000e¢\u0006\u0010\n\u0002\u0010'\u001a\u0004\b;\u0010$\"\u0004\b<\u0010&R\u001e\u0010=\u001a\u0004\u0018\u00010\u0002X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001b\u001a\u0004\b>\u0010\u0018\"\u0004\b?\u0010\u001aR\u001a\u0010@\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010\u001e\"\u0004\bB\u0010 R \u0010C\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010\u0013\"\u0004\bE\u0010\u0015¨\u0006J"}, m31884d2 = {"Lcom/swiftsoft/anixartd/database/entity/CustomFilter;", "Lcom/swiftsoft/anixartd/database/util/Identifiable;", "", "Ljava/io/Serializable;", "()V", "id", "getId", "()J", "setId", "(J)V", "isGenresExcludeModeEnabled", "", "()Z", "setGenresExcludeModeEnabled", "(Z)V", "selectedAgeRatings", "", "", "getSelectedAgeRatings", "()Ljava/util/List;", "setSelectedAgeRatings", "(Ljava/util/List;)V", "selectedCategoryId", "getSelectedCategoryId", "()Ljava/lang/Long;", "setSelectedCategoryId", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "selectedCountry", "getSelectedCountry", "()Ljava/lang/String;", "setSelectedCountry", "(Ljava/lang/String;)V", "selectedEndYear", "", "getSelectedEndYear", "()Ljava/lang/Integer;", "setSelectedEndYear", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "selectedEpisodeDuration", "getSelectedEpisodeDuration", "setSelectedEpisodeDuration", "selectedEpisodes", "getSelectedEpisodes", "setSelectedEpisodes", "selectedGenres", "getSelectedGenres", "setSelectedGenres", "selectedProfileListExclusions", "getSelectedProfileListExclusions", "setSelectedProfileListExclusions", "selectedSeason", "getSelectedSeason", "setSelectedSeason", "selectedSort", "getSelectedSort", "setSelectedSort", "selectedStartYear", "getSelectedStartYear", "setSelectedStartYear", "selectedStatusId", "getSelectedStatusId", "setSelectedStatusId", "selectedStudio", "getSelectedStudio", "setSelectedStudio", "selectedTypes", "getSelectedTypes", "setSelectedTypes", "equals", "other", "", "hashCode", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
/* loaded from: classes2.dex */
public final class CustomFilter implements Identifiable<Long>, Serializable {

    @PrimaryKey
    private long id;
    private boolean isGenresExcludeModeEnabled;

    @NotNull
    private List<String> selectedAgeRatings;

    @Nullable
    private Long selectedCategoryId;

    @Nullable
    private Integer selectedEndYear;

    @Nullable
    private Integer selectedEpisodeDuration;

    @Nullable
    private Integer selectedEpisodes;

    @NotNull
    private List<String> selectedGenres;

    @NotNull
    private List<String> selectedProfileListExclusions;

    @Nullable
    private Integer selectedSeason;

    @Nullable
    private Integer selectedSort;

    @Nullable
    private Integer selectedStartYear;

    @Nullable
    private Long selectedStatusId;

    @NotNull
    private List<String> selectedTypes;

    @NotNull
    private String selectedStudio = "";

    @NotNull
    private String selectedCountry = "";

    public CustomFilter() {
        EmptyList emptyList = EmptyList.f63144b;
        this.selectedGenres = emptyList;
        this.selectedProfileListExclusions = emptyList;
        this.selectedTypes = emptyList;
        this.selectedAgeRatings = emptyList;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.m32174c(CustomFilter.class, other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.m32177f(other, "null cannot be cast to non-null type com.swiftsoft.anixartd.database.entity.CustomFilter");
        CustomFilter customFilter = (CustomFilter) other;
        return this.id == customFilter.id && Intrinsics.m32174c(this.selectedCategoryId, customFilter.selectedCategoryId) && Intrinsics.m32174c(this.selectedStatusId, customFilter.selectedStatusId) && Intrinsics.m32174c(this.selectedStartYear, customFilter.selectedStartYear) && Intrinsics.m32174c(this.selectedEndYear, customFilter.selectedEndYear) && Intrinsics.m32174c(this.selectedStudio, customFilter.selectedStudio) && Intrinsics.m32174c(this.selectedEpisodes, customFilter.selectedEpisodes) && Intrinsics.m32174c(this.selectedSort, customFilter.selectedSort) && Intrinsics.m32174c(this.selectedCountry, customFilter.selectedCountry) && Intrinsics.m32174c(this.selectedSeason, customFilter.selectedSeason) && Intrinsics.m32174c(this.selectedEpisodeDuration, customFilter.selectedEpisodeDuration) && Intrinsics.m32174c(this.selectedGenres, customFilter.selectedGenres) && Intrinsics.m32174c(this.selectedProfileListExclusions, customFilter.selectedProfileListExclusions) && Intrinsics.m32174c(this.selectedTypes, customFilter.selectedTypes) && Intrinsics.m32174c(this.selectedAgeRatings, customFilter.selectedAgeRatings) && this.isGenresExcludeModeEnabled == customFilter.isGenresExcludeModeEnabled;
    }

    public final long getId() {
        return this.id;
    }

    @NotNull
    public final List<String> getSelectedAgeRatings() {
        return this.selectedAgeRatings;
    }

    @Nullable
    public final Long getSelectedCategoryId() {
        return this.selectedCategoryId;
    }

    @NotNull
    public final String getSelectedCountry() {
        return this.selectedCountry;
    }

    @Nullable
    public final Integer getSelectedEndYear() {
        return this.selectedEndYear;
    }

    @Nullable
    public final Integer getSelectedEpisodeDuration() {
        return this.selectedEpisodeDuration;
    }

    @Nullable
    public final Integer getSelectedEpisodes() {
        return this.selectedEpisodes;
    }

    @NotNull
    public final List<String> getSelectedGenres() {
        return this.selectedGenres;
    }

    @NotNull
    public final List<String> getSelectedProfileListExclusions() {
        return this.selectedProfileListExclusions;
    }

    @Nullable
    public final Integer getSelectedSeason() {
        return this.selectedSeason;
    }

    @Nullable
    public final Integer getSelectedSort() {
        return this.selectedSort;
    }

    @Nullable
    public final Integer getSelectedStartYear() {
        return this.selectedStartYear;
    }

    @Nullable
    public final Long getSelectedStatusId() {
        return this.selectedStatusId;
    }

    @NotNull
    public final String getSelectedStudio() {
        return this.selectedStudio;
    }

    @NotNull
    public final List<String> getSelectedTypes() {
        return this.selectedTypes;
    }

    public int hashCode() {
        long j2 = this.id;
        return (int) (j2 ^ (j2 >>> 32));
    }

    /* renamed from: isGenresExcludeModeEnabled, reason: from getter */
    public final boolean getIsGenresExcludeModeEnabled() {
        return this.isGenresExcludeModeEnabled;
    }

    public final void setGenresExcludeModeEnabled(boolean z) {
        this.isGenresExcludeModeEnabled = z;
    }

    public final void setId(long j2) {
        this.id = j2;
    }

    public final void setSelectedAgeRatings(@NotNull List<String> list) {
        Intrinsics.m32179h(list, "<set-?>");
        this.selectedAgeRatings = list;
    }

    public final void setSelectedCategoryId(@Nullable Long l2) {
        this.selectedCategoryId = l2;
    }

    public final void setSelectedCountry(@NotNull String str) {
        Intrinsics.m32179h(str, "<set-?>");
        this.selectedCountry = str;
    }

    public final void setSelectedEndYear(@Nullable Integer num) {
        this.selectedEndYear = num;
    }

    public final void setSelectedEpisodeDuration(@Nullable Integer num) {
        this.selectedEpisodeDuration = num;
    }

    public final void setSelectedEpisodes(@Nullable Integer num) {
        this.selectedEpisodes = num;
    }

    public final void setSelectedGenres(@NotNull List<String> list) {
        Intrinsics.m32179h(list, "<set-?>");
        this.selectedGenres = list;
    }

    public final void setSelectedProfileListExclusions(@NotNull List<String> list) {
        Intrinsics.m32179h(list, "<set-?>");
        this.selectedProfileListExclusions = list;
    }

    public final void setSelectedSeason(@Nullable Integer num) {
        this.selectedSeason = num;
    }

    public final void setSelectedSort(@Nullable Integer num) {
        this.selectedSort = num;
    }

    public final void setSelectedStartYear(@Nullable Integer num) {
        this.selectedStartYear = num;
    }

    public final void setSelectedStatusId(@Nullable Long l2) {
        this.selectedStatusId = l2;
    }

    public final void setSelectedStudio(@NotNull String str) {
        Intrinsics.m32179h(str, "<set-?>");
        this.selectedStudio = str;
    }

    public final void setSelectedTypes(@NotNull List<String> list) {
        Intrinsics.m32179h(list, "<set-?>");
        this.selectedTypes = list;
    }
}
