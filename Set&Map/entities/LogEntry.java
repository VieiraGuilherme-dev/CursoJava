package entities;

import java.time.LocalDateTime;

public class LogEntry {

    private String username;
    private LocalDateTime moment;

    // Construtor que recebe o username e o momento da entrada de log
    public LogEntry(String username, LocalDateTime moment) {
        this.username = username;
        this.moment = moment;
    }

    // Getters e Setters
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public LocalDateTime getMoment() {
        return moment;
    }

    public void setMoment(LocalDateTime moment) {
        this.moment = moment;
    }

    // Sobrescrita do método hashCode considerando 'username' e 'moment'
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((username == null) ? 0 : username.hashCode());
        result = prime * result + ((moment == null) ? 0 : moment.hashCode()); // Incluído moment
        return result;
    }

    // Sobrescrita do método equals considerando 'username' e 'moment'
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        LogEntry other = (LogEntry) obj;
        if (username == null) {
            if (other.username != null)
                return false;
        } else if (!username.equals(other.username))
            return false;
        
        if (moment == null) {
            if (other.moment != null)
                return false;
        } else if (!moment.equals(other.moment))
            return false;

        return true;
    }

    // Método toString para exibir uma representação de LogEntry
    @Override
    public String toString() {
        return "LogEntry [username=" + username + ", moment=" + moment + "]";
    }
}
