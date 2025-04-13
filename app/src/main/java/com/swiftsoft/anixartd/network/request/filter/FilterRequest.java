package com.swiftsoft.anixartd.network.request.filter;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: FilterRequest.kt */
@Metadata(m31883d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u001a\u0018\u0000 F2\u00020\u0001:\u0001FB\u0005¢\u0006\u0002\u0010\u0002R\"\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048GX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR \u0010\n\u001a\u0004\u0018\u00010\u000b8GX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R \u0010\u0017\u001a\u0004\u0018\u00010\u00058GX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR \u0010\u001d\u001a\u0004\u0018\u00010\u00058GX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b\u001e\u0010\u0019\"\u0004\b\u001f\u0010\u001bR \u0010 \u001a\u0004\u0018\u00010\u00058GX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b!\u0010\u0019\"\u0004\b\"\u0010\u001bR \u0010#\u001a\u0004\u0018\u00010\u00058GX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b$\u0010\u0019\"\u0004\b%\u0010\u001bR \u0010&\u001a\u0004\u0018\u00010\u00058GX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b'\u0010\u0019\"\u0004\b(\u0010\u001bR\"\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00120\u00048GX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0007\"\u0004\b+\u0010\tR\u001c\u0010,\u001a\u00020-8GX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010.\"\u0004\b/\u00100R\"\u00101\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048GX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u0007\"\u0004\b3\u0010\tR\u001e\u00104\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b5\u0010\u0019\"\u0004\b6\u0010\u001bR\u001e\u00107\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b8\u0010\u0019\"\u0004\b9\u0010\u001bR \u0010:\u001a\u0004\u0018\u00010\u00058GX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b;\u0010\u0019\"\u0004\b<\u0010\u001bR \u0010=\u001a\u0004\u0018\u00010\u000b8GX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b>\u0010\r\"\u0004\b?\u0010\u000fR\u001c\u0010@\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010\u0014\"\u0004\bB\u0010\u0016R\"\u0010C\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00048GX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010\u0007\"\u0004\bE\u0010\t¨\u0006G"}, m31884d2 = {"Lcom/swiftsoft/anixartd/network/request/filter/FilterRequest;", "", "()V", "ageRatings", "", "", "getAgeRatings", "()Ljava/util/List;", "setAgeRatings", "(Ljava/util/List;)V", "categoryId", "", "getCategoryId", "()Ljava/lang/Long;", "setCategoryId", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "country", "", "getCountry", "()Ljava/lang/String;", "setCountry", "(Ljava/lang/String;)V", "endYear", "getEndYear", "()Ljava/lang/Integer;", "setEndYear", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "episodeDurationFrom", "getEpisodeDurationFrom", "setEpisodeDurationFrom", "episodeDurationTo", "getEpisodeDurationTo", "setEpisodeDurationTo", "episodesFrom", "getEpisodesFrom", "setEpisodesFrom", "episodesTo", "getEpisodesTo", "setEpisodesTo", "genres", "getGenres", "setGenres", "isGenresExcludeModeEnabled", "", "()Z", "setGenresExcludeModeEnabled", "(Z)V", "profileListExclusions", "getProfileListExclusions", "setProfileListExclusions", "season", "getSeason", "setSeason", "sort", "getSort", "setSort", "startYear", "getStartYear", "setStartYear", "statusId", "getStatusId", "setStatusId", "studio", "getStudio", "setStudio", "types", "getTypes", "setTypes", "Companion", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
/* loaded from: classes2.dex */
public final class FilterRequest {
    public static final int LESS_THAN_13 = 1;
    public static final int MORE_THAN_100 = 4;
    public static final int MORE_THAN_13 = 2;
    public static final int MORE_THAN_26 = 3;
    public static final int SORT_DATE_UPDATE = 0;
    public static final int SORT_GRADE = 1;
    public static final int SORT_YEAR = 2;

    @Nullable
    private Long categoryId;

    @Nullable
    private String country;

    @Nullable
    private Integer endYear;

    @Nullable
    private Integer episodeDurationFrom;

    @Nullable
    private Integer episodeDurationTo;

    @Nullable
    private Integer episodesFrom;

    @Nullable
    private Integer episodesTo;
    private boolean isGenresExcludeModeEnabled;

    @Nullable
    private Integer season;

    @Nullable
    private Integer startYear;

    @Nullable
    private Long statusId;

    @Nullable
    private String studio;

    @Nullable
    private Integer sort = 0;

    @NotNull
    private List<String> genres = new ArrayList();

    @NotNull
    private List<Integer> profileListExclusions = new ArrayList();

    @NotNull
    private List<Long> types = new ArrayList();

    @NotNull
    private List<Integer> ageRatings = new ArrayList();

    @JsonProperty("age_ratings")
    @NotNull
    public final List<Integer> getAgeRatings() {
        return this.ageRatings;
    }

    @JsonProperty("category_id")
    @Nullable
    public final Long getCategoryId() {
        return this.categoryId;
    }

    @Nullable
    public final String getCountry() {
        return this.country;
    }

    @JsonProperty("end_year")
    @Nullable
    public final Integer getEndYear() {
        return this.endYear;
    }

    @JsonProperty("episode_duration_from")
    @Nullable
    public final Integer getEpisodeDurationFrom() {
        return this.episodeDurationFrom;
    }

    @JsonProperty("episode_duration_to")
    @Nullable
    public final Integer getEpisodeDurationTo() {
        return this.episodeDurationTo;
    }

    @JsonProperty("episodes_from")
    @Nullable
    public final Integer getEpisodesFrom() {
        return this.episodesFrom;
    }

    @JsonProperty("episodes_to")
    @Nullable
    public final Integer getEpisodesTo() {
        return this.episodesTo;
    }

    @JsonProperty("genres")
    @NotNull
    public final List<String> getGenres() {
        return this.genres;
    }

    @JsonProperty("profile_list_exclusions")
    @NotNull
    public final List<Integer> getProfileListExclusions() {
        return this.profileListExclusions;
    }

    @Nullable
    public final Integer getSeason() {
        return this.season;
    }

    @Nullable
    public final Integer getSort() {
        return this.sort;
    }

    @JsonProperty("start_year")
    @Nullable
    public final Integer getStartYear() {
        return this.startYear;
    }

    @JsonProperty("status_id")
    @Nullable
    public final Long getStatusId() {
        return this.statusId;
    }

    @Nullable
    public final String getStudio() {
        return this.studio;
    }

    @JsonProperty("types")
    @NotNull
    public final List<Long> getTypes() {
        return this.types;
    }

    @JsonProperty("is_genres_exclude_mode_enabled")
    /* renamed from: isGenresExcludeModeEnabled, reason: from getter */
    public final boolean getIsGenresExcludeModeEnabled() {
        return this.isGenresExcludeModeEnabled;
    }

    public final void setAgeRatings(@NotNull List<Integer> list) {
        Intrinsics.m32179h(list, "<set-?>");
        this.ageRatings = list;
    }

    public final void setCategoryId(@Nullable Long l2) {
        this.categoryId = l2;
    }

    public final void setCountry(@Nullable String str) {
        this.country = str;
    }

    public final void setEndYear(@Nullable Integer num) {
        this.endYear = num;
    }

    public final void setEpisodeDurationFrom(@Nullable Integer num) {
        this.episodeDurationFrom = num;
    }

    public final void setEpisodeDurationTo(@Nullable Integer num) {
        this.episodeDurationTo = num;
    }

    public final void setEpisodesFrom(@Nullable Integer num) {
        this.episodesFrom = num;
    }

    public final void setEpisodesTo(@Nullable Integer num) {
        this.episodesTo = num;
    }

    public final void setGenres(@NotNull List<String> list) {
        Intrinsics.m32179h(list, "<set-?>");
        this.genres = list;
    }

    public final void setGenresExcludeModeEnabled(boolean z) {
        this.isGenresExcludeModeEnabled = z;
    }

    public final void setProfileListExclusions(@NotNull List<Integer> list) {
        Intrinsics.m32179h(list, "<set-?>");
        this.profileListExclusions = list;
    }

    public final void setSeason(@Nullable Integer num) {
        this.season = num;
    }

    public final void setSort(@Nullable Integer num) {
        this.sort = num;
    }

    public final void setStartYear(@Nullable Integer num) {
        this.startYear = num;
    }

    public final void setStatusId(@Nullable Long l2) {
        this.statusId = l2;
    }

    public final void setStudio(@Nullable String str) {
        this.studio = str;
    }

    public final void setTypes(@NotNull List<Long> list) {
        Intrinsics.m32179h(list, "<set-?>");
        this.types = list;
    }
}
