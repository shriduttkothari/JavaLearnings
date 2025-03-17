package org.shridutt.ds.leetcodeanalysis;

import java.util.HashSet;
import java.util.Set;
import java.util.Arrays;
class Record {
    private String number;
    private String solution;
    private Set<String> tags;
    private String difficulty;
    private String remark;

    public String getSolution() {
        return solution;
    }

    public void setSolution(String solution) {
        this.solution = solution;
    }

    public Set<String> getTags() {
        return tags;
    }

    public void setTags(Set<String> tags) {
        this.tags = tags;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Record(String number, String solution, String tags, String difficulty, String remark) {
        this.number = number;
        this.solution = solution;
        this.tags = parseTags(tags);
        this.difficulty = difficulty;
        this.remark = remark;
    }

    private Set<String> parseTags(String tags) {
        if (tags == null || tags.isEmpty()) {
            return new HashSet<>();
        }

        return new HashSet<>(
                Arrays.stream(tags.trim().split("\\s*,\\s*"))
                        .map(tag -> tag.replace("`", "")) // Remove backticks
                        .toList()
        );
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Record{" +
                "number='" + number + '\'' +
                ", solution='" + solution + '\'' +
                ", tags=" + tags +
                ", difficulty='" + difficulty + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }
}
