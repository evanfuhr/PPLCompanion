package com.cometpenguinstudio.pplcompanion.controller;

import com.cometpenguinstudio.pplcompanion.model.Leader;
import com.cometpenguinstudio.pplcompanion.model.LeaderType;

import java.util.ArrayList;
import java.util.List;

public class LeaderController {

    private List<Leader> casualLeaders;
    private List<Leader> veteranLeaders;
    private List<Leader> eliteLeaders;
    private List<Leader> championLeaders;

    public LeaderController() {
        casualLeaders = new ArrayList<>();
        veteranLeaders = new ArrayList<>();
        eliteLeaders = new ArrayList<>();
        championLeaders = new ArrayList<>();

        loadSeedData();
    }

    public List<Leader> getCasualLeaders() {
        return casualLeaders;
    }

    public void setCasualLeaders(List<Leader> casualLeaders) {
        this.casualLeaders = casualLeaders;
    }

    public List<Leader> getVeteranLeaders() {
        return veteranLeaders;
    }

    public void setVeteranLeaders(List<Leader> veteranLeaders) {
        this.veteranLeaders = veteranLeaders;
    }

    public List<Leader> getEliteLeaders() {
        return eliteLeaders;
    }

    public void setEliteLeaders(List<Leader> eliteLeaders) {
        this.eliteLeaders = eliteLeaders;
    }

    public List<Leader> getChampionLeaders() {
        return championLeaders;
    }

    public void setChampionLeaders(List<Leader> championLeaders) {
        this.championLeaders = championLeaders;
    }

    private void loadSeedData() {
        Leader emmett = new Leader(18017760521381478L, "Emmett, the Special", "Piece of Resistance Badge", LeaderType.CASUAL);
        Leader virgil = new Leader(221279588997791744L, "Virgil, The Haunted Guide", "Possessed Badge", LeaderType.VETERAN);
        Leader cryo = new Leader(340559329000423424L, "Cryo, Twister of the Elements", "Floe Emblem", LeaderType.ELITE);
        Leader eleanora = new Leader(504917257491578880L, "Eleanora, the Exquisite Entomologist", "N/A", LeaderType.CHAMPION);

        casualLeaders.add(emmett);
        veteranLeaders.add(virgil);
        eliteLeaders.add(cryo);
        championLeaders.add(eleanora);
    }
}
