package levelup.world.domain;

import java.util.Date;

public class Player {

	private Integer id;
	private Integer teamId;
	private String playerName;
	private String role;
	private String battingStyle;
	private String bowlingStyle;
	private String nationality;
	private Date dateOfBirth;

	public Player() {

	}

	public Player(Integer id, Integer teamId, String playerName, String role, String battingStyle, String bowlingStyle,
			String nationality, Date dateOfBirth) {
		setId(id);
		setTeamId(teamId);
		setPlayerName(playerName);
		setRole(role);
		setBattingStyle(battingStyle);
		setBowlingStyle(bowlingStyle);
		setNationality(nationality);
		setDateOfBirth(dateOfBirth);
	}

	public boolean isNew() {
		return id == null;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getTeamId() {
		return teamId;
	}

	public void setTeamId(Integer teamId) {
		this.teamId = teamId;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getBattingStyle() {
		return battingStyle;
	}

	public void setBattingStyle(String battingStyle) {
		this.battingStyle = battingStyle;
	}

	public String getBowlingStyle() {
		return bowlingStyle;
	}

	public void setBowlingStyle(String bowlingStyle) {
		this.bowlingStyle = bowlingStyle;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

}
